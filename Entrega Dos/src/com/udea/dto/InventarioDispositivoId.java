package com.udea.dto;
/**<h1> InventarioDispositivoId</h1>
Clase encargada de los setter y getter del elemento inventarioDispositivoId
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class InventarioDispositivoId implements java.io.Serializable {

	/**
	 * la id del inventario
	 */
	private int idInvetario;
	/**
	 * la id del dispositivo
	 */
	private int idDispositivo;

	/**
	 * Constructor de la clase
	 */
	public InventarioDispositivoId() {
	}
/**
 * genera la nueva id o clave foranea del dispositivo
 * @param idInvetario la id del inventario
 * @param idDispositivo la id del dispositivo
 */
	public InventarioDispositivoId(int idInvetario, int idDispositivo) {
		this.idInvetario = idInvetario;
		this.idDispositivo = idDispositivo;
	}
/**
 * retorna la id del inventario
 * @return entero con la id del inventario
 */
	public int getIdInvetario() {
		return this.idInvetario;
	}
/**
 * establece la id del inventario
 * @param idInvetario la nueva id del inventario
 */
	public void setIdInvetario(int idInvetario) {
		this.idInvetario = idInvetario;
	}
/**
 * retorna la id del dispositivo
 * @return  retorna entero con la id del dispositivo
 */
	public int getIdDispositivo() {
		return this.idDispositivo;
	}
/**
 * establece la nueva id del dispositivo
 * @param idDispositivo la nueva id del dispositivo
 */
	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

}
