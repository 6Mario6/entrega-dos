package com.udea.dao;

import java.util.List;

import com.udea.dto.Prestamo;
import com.udea.exception.MyException;

/**<h1> PrestamoDAO</h1>
 * Es una interfaz la cual sirve para simplificar la conexión a la base de datos
 * mas especificamente a la tabla de Prestamo y obtener de alli los datos solicitados
 * 
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public interface PrestamoDAO {
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<Prestamo> retorna la lista de prestamos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public List<Prestamo> obtener() throws MyException;
	/**Con este metodo se buscara el prestamo identificado con una idprestamo
	 * @param idprestamo parametro que se recibe para identificar el prestamo en la base de datos
	 * @return prestamo retorna el prestamo buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	public Prestamo obtenerPrestamo(Integer idPrestamo) throws MyException;
	/**Este metodo guarda el prestamo dentro de las bases de datos
	 * @param prestamo el elemento de la clase prestamo que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void guardar(Prestamo prestamo) throws MyException;
	/**Con este metodo se modifica la información del prestamo
	 * @param prestamo elemento de la clase prestamoal cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void actualizar(Prestamo prestamo) throws MyException;
	/**Con este metodo se eliminara el prestamo de la base de datos
	 * @param prestamo elemento de la clase prestamo a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void eliminar(Prestamo prestamo) throws MyException;
}
