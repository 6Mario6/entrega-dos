package com.udea.dto;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
/**<h1> Solicitudprestamo</h1>
Clase encargada de los setter y getter del elemento Solicitud prestamo
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class SolicitudPrestamo implements Serializable {
	/**
	 * entero con la id de la reservacion
	 */
	private int idReservacion;
	/**
	 * el adminsitrador asociado a la solicitud
	 */
	private Administrador administrador;
	/**
	 * el dispositivo asociado a la solicitud
	 */
	private Dispositivo dispositivo;
	/**
	 * el usuario asociado a la solicitud
	 */
	private Usuario usuario;
	/**
	 * la fecha de solicitud inicio
	 */
	private Date fechaSolicitudInicio;
	/**
	 * la hora de solicitud de inciio
	 */
	private Time horaSolicitudInicio;
	/**
	 * establece el estado de la solicitud
	 */
	private int estadoSolicitud;
/**
 * retorna la id de la reservacion
 * @return entero con la id de la reservacion
 */
	public int getIdReservacion() {
		return idReservacion;
	}
/**
 * establece la id de la reservacion
 * @param idReservacion la nueva id de la reservacion
 */
	public void setIdReservacion(int idReservacion) {
		this.idReservacion = idReservacion;
	}
/**
 * retorna la fecha de inicio de la solicitud
 * @return date con la fehca de inicio
 */
	public Date getFechaSolicitudInicio() {
		return fechaSolicitudInicio;
	}
/**
 * establece la fecha de incioo de la solicitud
 * @param fechaSolicitudInicio la nueva fecha de solicitud
 */
	public void setFechaSolicitudInicio(Date fechaSolicitudInicio) {
		this.fechaSolicitudInicio = fechaSolicitudInicio;
	}
/**
 * retorna la hora de la solicitud de inicio
 * @return retorna la hora de inicio
 */
	public Time getHoraSolicitudInicio() {
		return horaSolicitudInicio;
	}
/**
 * establece la nueva hora de la solicitud para iniciar
 * @param horaSolicitudInicio la nueva hora de inicio
 */
	public void setHoraSolicitudInicio(Time horaSolicitudInicio) {
		this.horaSolicitudInicio = horaSolicitudInicio;
	}
/**
 * retorna el estado de la solicitud
 * @return entero con el estado
 */
	public int getEstadoSolicitud() {
		return estadoSolicitud;
	}
/**
 * establece el estado de la solicitud
 * @param estadoSolicitud el nuevo estado de la solicitud
 */
	public void setEstadoSolicitud(int estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}
/**
 * retorna el administrado asociado
 * @return elemento de la clase administrador
 */
	public Administrador getAdministrador() {
		return administrador;
	}
/**
 * establece el nuevo administrador asociado a la solicitud
 * @param administrador el nuevo administrador
 */
	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
/**
 * retorna el usuario asociado a la solicitud
 * @return retorna un usuario
 */
	public Usuario getUsuario() {
		return usuario;
	}
/**
 * establece el nuevo usuario asociado a la solicitud
 * @param usuario el nuevo usuario
 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
/**
 * retorna la id del dispositivo
 * @return elemento de tipo dispositivo
 */
	public Dispositivo getDispositivo() {
		return dispositivo;
	}
/**
 * establece el nuevo dispositivo asociado
 * @param dispositivo el nuevo dispositivo
 */
	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

}

