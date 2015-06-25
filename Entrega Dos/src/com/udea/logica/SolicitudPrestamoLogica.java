package com.udea.logica;

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
	public SolicitudPrestamoLogImp obtenerSolicitudPrestamoLogica(Integer idReservacion) throws MyException;
	
	public void realizarSolicitud(int idReservacion, String nombre, String apellido,
			String telefono, String email, String username, String password,
			String grupoInvestigacion) throws MyException;
	
}
