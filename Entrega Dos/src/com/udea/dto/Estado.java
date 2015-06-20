package com.udea.dto;

import java.io.Serializable;
import java.util.Set;
/**<h1> Estado</h1>
Clase encargada de los setter y getter del elemento Estado
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class Estado implements Serializable {
	/**
	 * entero que establece la id del estado
	 */
	private int idEstado;
	/**
	 * String que establece el nombre del estado
	 */
	private String nombre;
	/**
	 * String que establece la descripcion del estado 
	 */
	
	private String descripcion;
	/**
	 * Lista de dispositivos
	 */
	private Set<Dispositivo> dispositivos;

	/**
	 * retorna la id del estado
	 * @return entero con la id del estado
	 */
	public int getIdEstado() {
		return idEstado;
	}
/**
 * establece la id del estado
 * @param idEstado la nueva id del estado
 */
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
/**
 * retorna el nobre del estado
 * @return string con el nombre del estado
 */
	public String getNombre() {
		return nombre;
	}
/**
 * establece el nuevo nombre del estado
 * @param nombre string con el nuevo nombre del estado
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * retorna la descripcion del estado
 * @return retorna un string con la descripcion del estado
 */
	public String getDescripcion() {
		return descripcion;
	}
/**
 * establece la nueva descripcion del estado
 * @param descripcion string con la nueva descripcion del estado
 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
/**
 * retorna la lista de dispositivos
 * @return una lista con elementos unicos de la lista
 */
	public Set<Dispositivo> getDispositivos() {
		return dispositivos;
	}
/**
 *  establece la lista de dispositovos
 * @param dispositivos lista de dispositivos unicos
 */
	public void setDispositivos(Set<Dispositivo> dispositivos) {
		this.dispositivos = dispositivos;
	}
}
