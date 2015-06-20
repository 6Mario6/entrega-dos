package com.udea.dto;

import java.io.Serializable;
import java.util.Date;
/**<h1> Dispositivo</h1>
Clase encargada de los setter y getter del elemento Dispositivo
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class Dispositivo implements Serializable {
	
	
	private InventarioDispositivo invDispositivo;
	/**
	 * Entero que define la id del dispositivo
	 */
	private int idDispositivo;
	/**
	 * atributo de la clase administrador a crear
	 */
	private Administrador administrador;
	/**
	 * atributo de la clase categoria a crear
	 */
	private Categoria categoria;
	/**
	 * atributo de la clase estado
	 */
	private Estado estado;
	/**
	 * String nombre del dispositivo
	 * 
	 */
	private String nombre;
	/**
	 * String que describe el dispositivo
	 */
	private String descripcion;
	/**
	 * atributo de tipo date que determina la fecha de adquisicion
	 */
	private Date fechaAdquisicion;

	/**
	 * retorna la id del dispositivo
	 * @return la id del dispositivo
	 */
	public int getIdDispositivo() {
		return idDispositivo;
	}
	/**
	 * establece la id del dispositivo
	 * @param idDispositivo la nueva id del dispositivo
	 */

	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}
/**
 * retorna el nombre del dispositivo
 * @return un string con el nombre del dispositivo
 */
	public String getNombre() {
		return nombre;
	}
/**
 * establece el nombre del dispositivo
 * @param nombre string con el nuevo nombre del dispositivo
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * retorna la descripcion del dispositivo
 * @return un string con la descripción del dispositivo
 */
	public String getDescripcion() {
		return descripcion;
	}
/**
 * establece la descripcion del dispositivo
 * @param descripcion string con la nueva descripcion del dispositivo
 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
/**
 * retorna la fecha de adquisicion del dispositivo
 * @return un tipo date con la fecha de adquisicion
 */
	public Date getFechaAdquisicion() {
		return fechaAdquisicion;
	}
/**
 * establece la fecha de adquisicion del dispositivo
 * @param fechaAdquisicion establece la nueva fecha de adquisicion
 */
	public void setFechaAdquisicion(Date fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}
/**
 * retorna el administrador del dispositivo
 * @return elemento de la clase administrador
 */
	public Administrador getAdministrador() {
		return administrador;
	}
/**
 * establce el administrador del dispositivo
 * @param administrador el nuevo administrador del dispositivo
 */
	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
/**
 * retorna la categoria del dispositivo
 * @return elemento de la clase categoria
 */
	public Categoria getCategoria() {
		return categoria;
	}
/**
 * establece la categoria del dispositivo 
 * @param categoria la nueva categoria del dispositivo
 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
/**
 * retorna el estado del dispositivo
 * @return elemento de la clase estado
 */
	public Estado getEstado() {
		return estado;
	}
/**
 * establece el nuevo estado del dispositivo
 * @param estado el nuevo estado del dispositivo
 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
public InventarioDispositivo getInvDispositivo() {
	return invDispositivo;
}
public void setInvDispositivo(InventarioDispositivo invDispositivo) {
	this.invDispositivo = invDispositivo;
}
}