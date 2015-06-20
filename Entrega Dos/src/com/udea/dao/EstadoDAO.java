package com.udea.dao;

import java.util.List;

import com.udea.dto.Estado;
import com.udea.exception.MyException;

/**<h1> EstadoDAO</h1>
 * Es una interfaz la cual sirve para simplificar la conexión a la base de datos
 * mas especificamente a la tabla de Estado y obtener de alli los datos solicitados
 * 
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public interface EstadoDAO {
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<Estado> retorna la lista de Estados
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public List<Estado> obtener() throws MyException;
	/**Con este metodo se buscara el estado identificado con una idEstado
	 * @param idEstado parametro que se recibe para identificar el estado en la base de datos
	 * @return Estado retorna el estado buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	public Estado obtenerEstado(Integer idEstado) throws MyException;
	/**Este metodo guarda el estado dentro de las bases de datos
	 * @param estado el estado que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void guardar(Estado estado) throws MyException;
	/**Con este metodo se modifica la información del estado
	 * @param estado  el estado al cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void actualizar(Estado estado) throws MyException;
	/**Con este metodo se eliminara el estado de la base de datos
	 * @param estado el estado a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void eliminar(Estado estado) throws MyException;
}
