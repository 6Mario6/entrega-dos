package com.udea.dao;

import java.util.List;

import com.udea.dto.Usuario;
import com.udea.exception.MyException;

/**<h1> UsuarioDAO</h1>
 * Es una interfaz la cual sirve para simplificar la conexión a la base de datos
 * mas especificamente a la tabla de Usuario y obtener de alli los datos solicitados
 * 
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public interface UsuarioDAO {
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<Usuario> retorna la lista de Usuarios
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public List<Usuario> obtener() throws MyException;
	/**Con este metodo se buscara al usuario identificado con una idUsuario
	 * @param idUsuario parametro que se recibe para identificar al usuario en la base de datos
	 * @return usuario retorna El usuario buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	public Usuario obtenerUsuario(Integer idUsuario) throws MyException;
	/**Este metodo guarda al usuario  dentro de las bases de datos
	 * @param usuario el usuario que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void guardar(Usuario usuario) throws MyException;
	/**Con este metodo se modifica la información del usuario
	 * @param usuario usuario a la cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void actualizar(Usuario usuario) throws MyException;
	/**Con este metodo se eliminara el usuario de la base de datos
	 * @param usuario el usuario a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void eliminar(Usuario usuario) throws MyException;

}
