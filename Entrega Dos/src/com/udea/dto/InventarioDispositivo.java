package com.udea.dto;

import java.io.Serializable;
/**<h1> InventarioDispositivo</h1>
Clase encargada de los setter y getter del elemento InventarioDispositivo
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class InventarioDispositivo implements Serializable {
/**
 * Dispositovo asociado al inventario
 */
	private Dispositivo dispositivo;
	/**
	 * cantidad de algun dispositivo
	 */
	private int cantidad;
	/**
	 * id del dispositivo
	 */
	private InventarioDispositivoId id;
	
/**
 * retorna la catidad existente o disponible de un dispositivo
 * @return entero con la cantidad
 */
	public int getCantidad() {
		return cantidad;
	}
/**
 * establece la cantidad de dispositivos
 * @param cantidad la nueva cantidad de dispositivos
 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
/**
 * retorna la id del dispositivo
 * @return la id del dispositivo
 */
	public InventarioDispositivoId getId() {
		return id;
	}
/**
 * establece la nueva id del dispositivo
 * @param id nueva id del dispositivo
 */
	public void setId(InventarioDispositivoId id) {
		this.id = id;
	}
/**
 * retorna el tipo de dispositivop del inventario
 * @return retorna el dispositivo asociado
 */
	public Dispositivo getDispositivo() {
		return dispositivo;
	}
/**
 * establece un nuevo dispositivo
 * @param dispositivo el nuevo dispositivo a asociar
 */
	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

}

