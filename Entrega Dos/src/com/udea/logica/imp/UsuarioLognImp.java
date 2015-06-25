package com.udea.logica.imp;

import java.util.List;

import com.udea.dao.UsuarioDAO;
import com.udea.dto.Usuario;
import com.udea.encode.Cifrar;
import com.udea.exception.MyException;
import com.udea.logica.UsuarioLogica;

public class UsuarioLognImp implements UsuarioLogica {
	private UsuarioDAO usDao;

	@Override
	public List<Usuario> obtener() throws MyException {
		return getUsDao().obtener();
	}
	@Override
	public Usuario obtenerUsuario(Integer idUsuario) throws MyException {
		Usuario usuario= usDao.obtenerUsuario(idUsuario);
		if ( usuario== null) {
			throw new MyException("El usuario no existe en el sistema.");
		}
		return usuario;
	}
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

	@Override
	public void eliminarUsuario(int idUsuario) throws MyException {
		Usuario usuario = null;

		usuario = usDao.obtenerUsuario(idUsuario);
		if (usuario == null) {
			throw new MyException("El usuario no existe en el sistema.");
		}

		usDao.eliminar(usuario);
	}
	
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


	public UsuarioDAO getUsDao() {
		return usDao;
	}

	public void setUsDao(UsuarioDAO usDao) {
		this.usDao = usDao;
	}

	

	
}
