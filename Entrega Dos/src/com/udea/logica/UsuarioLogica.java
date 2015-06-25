package com.udea.logica;

import java.util.List;

import com.udea.dto.Usuario;
import com.udea.exception.MyException;
/**<h1> UsuarioLogica</h1>
 * Es una interfaz la cual sirve para definir las funciones de la logica del negocio de los usuarios
 * 
 * 
 * @author Jorge Mario Fernandez
 * @version 1.0
 * @since 01-06-15
 *
 */
public interface UsuarioLogica {
	/**Con este metodo obtenemos la lista de usuarios
	 * @return List<Usuario> retorna la lista de Usuarios
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public List<Usuario> obtener() throws MyException;
	/**Con este metodo se buscara al usuario identificado con una idUsuario
	 * @param idUsuario parametro que se recibe para identificar al usuario en la base de datos
	 * @return usuario retorna El usuario buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
	 */
	public Usuario obtenerUsuario(Integer idUsuario) throws MyException;
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
	public void guardarUsuario(int idUsuario, String nombre, String apellido,
			String telefono, String email, String username, String password,
			String grupoInvestigacion) throws MyException;
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
	public void actualizarUsuario(int idUsuario, String nombre,
			String apellido, String telefono, String email, String username,
			String password, String grupoInvestigacion) throws MyException;
	/**Con este metodo se eliminara el usuario de la base de datos
	 * @param idUsuario la identificacion del usuario a eliminar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void eliminarUsuario(int idUsuario) throws MyException;
	/**Con este metodo se valida el usuario en el sistema
	 * @param username el username del usuario a validar
	 * @param password el password del usuario a validar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public boolean  validar (String username, String password) throws MyException;

}
