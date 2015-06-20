package com.udea.dao;

import java.util.List;

import com.udea.dto.Administrador;
import com.udea.exception.MyException;

/**<h1> AdminstradorDao</h1>
 * Es una interfaz la cual sirve para simplificar la conexión a la base de datos
 * mas especificamente a la tabla de Administrador y obtener de alli los datos solicitados
 * 
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public interface AdministradorDAO {
	
	
	
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<Administrador> retorna la lista de administradores
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public List<Administrador> obtener() throws MyException;

	/**Con este metodo se buscara al administrador identificado con una idAdministrador
	 * @param idAdministrador parametro que se recibe para identificar el administrador en la base de datos
	 * @return Adminstrador retorna al administrador buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	public Administrador obtenerAdministrador(Integer idAdministrador)
			throws MyException;
	
	

	/**Este metodo guarda al usuario "administrador" dentro de las bases de datos
	 * @param administrador El administrador que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void guardar(Administrador administrador) throws MyException;

	/**Con este metodo se modifica la información del "administrador"
	 * @param administrador "administrador" al cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void actualizar(Administrador administrador) throws MyException;

	/**Con este metodo se eliminara al "administrador" de la base de datos
	 * @param administrador el "administrador" a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void eliminar(Administrador administrador) throws MyException;
}
