package com.udea.dto;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
/**<h1> Prestamo</h1>
Clase encargada de los setter y getter del elemento Prestamo
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class Prestamo implements Serializable {
	/**
	 * entero con la id del prestamo
	 */
	private int idPrestamo;
	/**
	 * la solicitud del prestamo
	 */
	private int idReservacion;
	/**
	 * fecha en la cual se hizo el prestamo
	 */
	private Date fechaPrestamo;
	/**
	 * Horas que duro el prestamo
	 */
	private Time horaPrestamo;
	/**
	 * fecha en la que termino el prestamo
	 */
	private Date fechaFinPrestamo;
	/**
	 * hora a la que finalizo el prestamo
	 */
	private Time horaFinPrestamo;
	/**
	 * retorna la id del prestamo
	 * @return entero con l id
	 */

	public int getIdPrestamo() {
		return idPrestamo;
	}
/**
 * establece la id del prestamo
 * @param idPrestamo la nueva id del prestamo
 */
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
/**
 * retorna la fecha del prestamo
 * @return la fecha del prestamo
 */
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
/**
 * establece la fecha del prestamo
 * @param fechaPrestamo nueva fecha de prestamo
 */
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
/**
 * retorna la hora de prestamo
 * @return tipo date hora d eprestamo
 */
	public Time getHoraPrestamo() {
		return horaPrestamo;
	}
/**
 * establece la hora de prestamo
 * @param horaPrestamo nueva hora d eprestamo
 */
	public void setHoraPrestamo(Time horaPrestamo) {
		this.horaPrestamo = horaPrestamo;
	}
/**
 * retorna la fecha del final del prestamo
 * @return la fecha de final del prestamo
 */
	public Date getFechaFinPrestamo() {
		return fechaFinPrestamo;
	}
/**
 * establece la fecha de fin del prestamo
 * @param fechaFinPrestamo la nueva fecha de fin de prestamo
 */
	public void setFechaFinPrestamo(Date fechaFinPrestamo) {
		this.fechaFinPrestamo = fechaFinPrestamo;
	}
/**
 * retorna la hora del final del prestamo
 * @return retorna la hora del final del prestamo
 */
	public Time getHoraFinPrestamo() {
		return horaFinPrestamo;
	}
/**
 * establece la hora del final del prestamo
 * @param horaFinPrestamo la nueva hora del final del prestamo
 */
	public void setHoraFinPrestamo(Time horaFinPrestamo) {
		this.horaFinPrestamo = horaFinPrestamo;
	}
/**
 * retorna  la solicitud de prestamo
 * @return retorna una solicitud de prestamo
 */
	public int getSolicitudPrestamo() {
		return 	idReservacion;
	}
/**
 * establce la solicitud de prestamo
 * @param solicitudPrestamo la nueva solicitud de prestamo
 */
	public void setSolicitudPrestamo(int 	idReservacion) {
		this.	idReservacion = 	idReservacion;
	}

}
