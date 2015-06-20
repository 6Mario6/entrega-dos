package com.udea.dao;

import java.util.List;

import com.udea.dto.SolicitudPrestamo;
import com.udea.exception.MyException;

/**<h1> SolicitudPrestamoDao</h1>
 * Es una interfaz la cual sirve para simplificar la conexión a la base de datos
 * mas especificamente a la tabla de solicitudPrestamo y obtener de alli los datos solicitados
 * 
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public interface SolicitudPrestamoDAO {
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<SolicitudPrestamo> retorna la lista de Solicitudes de prestamo
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public List<SolicitudPrestamo> obtener() throws MyException;
	/**Con este metodo se buscara la solicitud de prestamo identificado con una idReservacion
	 * @param idReservacion parametro que se recibe para identificar la solicitud de perstamo en la base de datos
	 * @return SolicitudPrestamo retorna Solicitudprestamo buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	public SolicitudPrestamo obtenerSolicitudPrestamo(Integer idReservacion)
			throws MyException;
	/**Este metodo guarda la solicitud de prestamo dentro de las bases de datos
	 * @param solicitud La solicitud de prestamo que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void guardar(SolicitudPrestamo solicitud) throws MyException;
	/**Con este metodo se modifica la información de la la solicitud de prestamo
	 * @param solicitud elemento de la clase solicitud de prestamo  a la cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void actualizar(SolicitudPrestamo solicitud) throws MyException;
	/**Con este metodo se eliminara una solicitud de prestamo de la base de datos
	 * @param solicitud la solicitud de prestamo a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void eliminar(SolicitudPrestamo solicitud) throws MyException;
}
