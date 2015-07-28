package com.udea.logica.imp;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import com.udea.dao.AdministradorDAO;
import com.udea.dao.CategoriaDAO;
import com.udea.dao.DispositivoDAO;
import com.udea.dao.EstadoDAO;
import com.udea.dao.SolicitudPrestamoDAO;
import com.udea.dao.UsuarioDAO;
import com.udea.dto.Dispositivo;
import com.udea.dto.SolicitudPrestamo;
import com.udea.dto.Usuario;
import com.udea.encode.Cifrar;
import com.udea.exception.MyException;
import com.udea.logica.SolicitudPrestamoLogica;

/**<h1> SolicitudPrestamoLogica</h1>
 * Es una interfaz la cual sirve para definir las funciones de la logica del negocio de las solicitudes
 * 
 * 
 * @author Jorge Mario Fernandez
 * @version 1.0
 * @since 01-06-15
 *
 */
public class SolicitudPrestamoLogImp implements SolicitudPrestamoLogica {
	private SolicitudPrestamoDAO solicitudDao;
	private DispositivoDAO disDao;
	private AdministradorDAO adDao;
	private UsuarioDAO usDao;
	/**Con este metodo obtenemos la lista de solicitudes
	 * @return List<SolicitudPrestamo> retorna la lista de solicitudes
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public List<SolicitudPrestamo> obtener() throws MyException {
		return getSolicitudDao().obtener();
	}
	/**Con este metodo se buscara la solicitud identificado con una idReservacion
	 * @param idReservacion parametro que se recibe para identificar la solicitud en la base de datos
	 * @return usuario retorna El usuario buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public SolicitudPrestamo obtenerSolicitudPrestamoLogica(
			Integer idReservacion) throws MyException {
		SolicitudPrestamo solicitud= solicitudDao.obtenerSolicitudPrestamo(idReservacion);
		if ( solicitud== null) {
			throw new MyException("La solicitud no existe en el sistema.");
		}
		return solicitud;
	}

	@Override
	public void realizarSolicitud(int idReservacion, int idDispositivo, int idAdministrador,
			int idUsuario, Date fechaSolicitudInicio, Time horaSolicitudInicio, String estadoSolicitud)
					throws MyException {
		
		SolicitudPrestamo solicitud = null;
		
		if (solicitudDao.obtenerSolicitudPrestamo(idReservacion)!= null) {
			throw new MyException("La solicitud ya existe.");
		}
		if (disDao.obtenerDispositivo(idDispositivo)== null) {
			throw new MyException("El dispositivo no existe.");
		}
		if (adDao.obtenerAdministrador(idAdministrador)== null) {
			throw new MyException("El administrador no existe");
		}
		if (usDao.obtenerUsuario(idUsuario)== null) {
			throw new MyException("El administrador no existe");
		}
		
		if (fechaSolicitudInicio == null) {
			throw new MyException(
					"La fecha de la solicitud  no puede ser nula, ni una cadena de caracteres vacia");
		}
		if (horaSolicitudInicio == null) {
			throw new MyException(
					"El descripcion del dispositivo no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (estadoSolicitud.isEmpty() || estadoSolicitud == null) {
			throw new MyException(
					"estadoSolicitud del dispositivo no puede ser nulo");
		}
		
		solicitud = new SolicitudPrestamo();
		solicitud.setAdministrador(idAdministrador);
		solicitud.setDispositivo(idDispositivo);
		solicitud.setEstadoSolicitud(estadoSolicitud);
		solicitud.setFechaSolicitudInicio(fechaSolicitudInicio);
		solicitud.setHoraSolicitudInicio(horaSolicitudInicio);
		solicitud.setIdReservacion(idReservacion);
		solicitud.setUsuario(idUsuario);
		
		solicitudDao.guardar(solicitud);
		
		
	}

	public SolicitudPrestamoDAO getSolicitudDao() {
		return solicitudDao;
	}

	public void setSolicitudDao(SolicitudPrestamoDAO solicitudDao) {
		this.solicitudDao = solicitudDao;
	}
	
}
