package com.udea.logica.imp;

import java.util.List;

import com.udea.dao.UsuarioDAO;
import com.udea.dto.Usuario;
import com.udea.encode.Cifrar;
import com.udea.exception.MyException;
import com.udea.logica.UsuarioLogica;
/**<h1> UsuarioLognImp</h1>
 * Clase que implementa los metodos de la logica del negocio relacionada con los usuarios
 * 
 * 
 * @author Jorge Mario Fernandez
 * @version 1.0
 * @since 01-06-15
 *
 */
public class UsuarioLognImp implements UsuarioLogica {
	
	private UsuarioDAO usDao;
	/**Con este metodo obtenemos la lista de usuarios
	 * @return List<Usuario> retorna la lista de Usuarios
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public List<Usuario> obtener() throws MyException {
		return getUsDao().obtener();
	}
	/**Con este metodo se buscara al usuario identificado con una idUsuario
	 * @param idUsuario parametro que se recibe para identificar al usuario en la base de datos
	 * @return usuario retorna El usuario buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public Usuario obtenerUsuario(Integer idUsuario) throws MyException {
		Usuario usuario= usDao.obtenerUsuario(idUsuario);
		if ( usuario== null) {
			throw new MyException("El usuario no existe en el sistema.");
		}
		return usuario;
	}
	/**Este metodo guarda al usuario  dentro de las bases de datos
	 * @param idUsuario identificacion del usuario
	 * @param nombre el nombre del usuario a guardar
	 * @param apellido el apellido del usuario a guardar
	 * @param telefono el telefono del usuario a guardar
	 * @param email el correo electronico del usuario a guardar
	 * @param username el username del usuario a guardar
	 * @param password el password del usuario a guardar
	 * @param grupoInvestigacion el nombre de gusto de investigacion del usuario a guardar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void guardarUsuario(int idUsuario, String nombre, String apellido,
			String telefono, String email, String username, String password,
			String grupoInvestigacion) throws MyException {
		Usuario usuario = null;
		Cifrar cifrar = new Cifrar ();
		if (usDao.obtenerUsuario(idUsuario) != null) {
			throw new MyException("El usuario ya existe en el sistema.");
		}
		if (nombre.isEmpty() || nombre == null) {
			throw new MyException(
					"La id del usuario no puede ser nula, ni una cadena de caracteres vacia");
		}
		if (apellido.isEmpty() || apellido == null) {
			throw new MyException(
					"El apellido del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (telefono.isEmpty() || telefono == null) {
			throw new MyException(
					"El telefono del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (email.isEmpty() || email == null) {
			throw new MyException(
					"El email del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (username.isEmpty() || username == null) {
			throw new MyException(
					"El username del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (password.isEmpty() || password == null) {
			throw new MyException(
					"El password del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (grupoInvestigacion.isEmpty() || grupoInvestigacion == null) {
			throw new MyException(
					"El grupoInvestigacio del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		usuario = new Usuario();
		usuario.setIdUsuario(idUsuario);
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setTelefono(telefono);
		usuario.setEmail(email);
		usuario.setUsername(username);
		usuario.setPassword(cifrar.encrypt(password));
		usuario.setGrupoInvestigacion(grupoInvestigacion);
		usDao.guardar(usuario);

	}
	/**Con este metodo se modifica la información del usuario
	 * @param idUsuario identificacion del usuario
	 * @param nombre el nombre del usuario a modificar
	 * @param apellido el apellido del usuario a modificar
	 * @param telefono el telefono del usuario a modificar
	 * @param email el correo electronico del usuario a modificar
	 * @param username el username del usuario a modificar
	 * @param password el password del usuario a modificar
	 * @param grupoInvestigacion el nombre de gusto de investigacion del usuario a modificar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void actualizarUsuario(int idUsuario, String nombre,
			String apellido, String telefono, String email, String username,
			String password, String grupoInvestigacion) throws MyException {
		Usuario usuario = null;
		if (nombre.isEmpty() || nombre == null) {
			throw new MyException(
					"La id del usuario no puede ser nula, ni una cadena de caracteres vacia");
		}
		if (apellido.isEmpty() || apellido == null) {
			throw new MyException(
					"El apellido del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (telefono.isEmpty() || telefono == null) {
			throw new MyException(
					"El telefono del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (email.isEmpty() || email == null) {
			throw new MyException(
					"El email del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (username.isEmpty() || username == null) {
			throw new MyException(
					"El username del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (password.isEmpty() || password == null) {
			throw new MyException(
					"El password del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (grupoInvestigacion.isEmpty() || grupoInvestigacion == null) {
			throw new MyException(
					"El grupoInvestigacio del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}

		usuario = usDao.obtenerUsuario(idUsuario);
		if (usuario == null) {
			throw new MyException("El usuario no existe en el sistema.");
		}

		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setTelefono(telefono);
		usuario.setEmail(email);
		usuario.setUsername(username);
		usuario.setPassword(password);
		usuario.setGrupoInvestigacion(grupoInvestigacion);
		usDao.actualizar(usuario);
	}
	/**Con este metodo se eliminara el usuario de la base de datos
	 * @param idUsuario la identificacion del usuario a eliminar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void eliminarUsuario(int idUsuario) throws MyException {
		Usuario usuario = null;

		usuario = usDao.obtenerUsuario(idUsuario);
		if (usuario == null) {
			throw new MyException("El usuario no existe en el sistema.");
		}

		usDao.eliminar(usuario);
	}
	/**Con este metodo se valida el usuario en el sistema
	 * @param username el username del usuario a validar
	 * @param password el password del usuario a validar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public boolean validar(String username, String password) throws MyException {
		Usuario usuario = null;
		if (username.isEmpty() || username == null) {
			throw new MyException(
					"El username del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (password.isEmpty() || password == null) {
			throw new MyException(
					"El password del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		usuario = usDao.obtenerUsuario(username);
		if(usuario==null){
			throw new MyException("El usuario no valido.");
		}
			
		if(!password.equals(usuario.getPassword())){
			throw new MyException("El password no valido" +"-"+usuario.getPassword()+" "+password);
		}
		return true;
	}

	/**Con este metodo obtenemos el usuarioDAO que obtiene la informacion de la base de datos
	 * @return usDao retorna el objeto de la clase usuarioDAO
	 */
	public UsuarioDAO getUsDao() {
		return usDao;
	}
	/**Con este metodo se establece un objeto de UsuarioDAO
	 * @param usDao el objeto de UsuarioDAO que se va a establecer
	 */
	public void setUsDao(UsuarioDAO usDao) {
		this.usDao = usDao;
	}

	

	
}
