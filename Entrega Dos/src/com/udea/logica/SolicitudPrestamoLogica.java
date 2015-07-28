package com.udea.logica;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import com.udea.dto.SolicitudPrestamo;
import com.udea.exception.MyException;
import com.udea.logica.imp.SolicitudPrestamoLogImp;

public interface SolicitudPrestamoLogica {
	/**Con este metodo obtenemos la lista de solicitudes
	 * @return List<SolicitudPrestamo> retorna la lista de solicitudes
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public List<SolicitudPrestamo> obtener() throws MyException;
	/**Con este metodo se buscara la solicitud identificado con una idReservacion
	 * @param idReservacion parametro que se recibe para identificar la solicitud del prestamo en la base de datos
	 * @return solicitud retorna la solicitud buscada
	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
	 */
	public SolicitudPrestamo obtenerSolicitudPrestamoLogica(Integer idReservacion) throws MyException;
	
	public void realizarSolicitud(int idReservacion, int idDispositivo, int idAdministrador,
			int idUsuario, Date fechaSolicitudInicio, Time horaSolicitudInicio, String estadoSolicitud) throws MyException;
	
}
