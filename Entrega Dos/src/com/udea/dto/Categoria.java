package com.udea.dto;

import java.io.Serializable;
import java.util.Set;


/**<h1> Categoria</h1>
Clase encargada de los setter y getter del elemento Categoria
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class Categoria implements Serializable {
	/**Entero que da la id de la categoria
	 * 
	 */
	private int idCategoria;
	/**String que da el nombre a la categoria
	 * 
	 */
	private String categoria;
	/**
	 * lista de elementos no repetidos dentro de la categoria
	 */
	private Set<Dispositivo> dispositivos;

	/**
	 * obtiene la id de la categoria
	 * @return la id de la categoria
	 */
	public int getIdCategoria() {
		return idCategoria;
	}

	/**
	 * establece la id de la categoria
	 * @param idCategoria el nuevo id de la categoria
	 */
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	/**
	 * obtiene el nombre de la categoria
	 * @return el nombre de la categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * establece el nombre de la categoria
	 * @param categoria nuevo nombre de la categoria
	 */

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * obtiene la lista de dispositivos asociados a la categoria
	 * @return la lista de dispositivos
	 */

	public Set<Dispositivo> getDispositivos() {
		return dispositivos;
	}

	/**
	 * establece la lista de dispositivos de la clase
	 * @param dispositivos la lista de dispositivos a agregar
	 */
	public void setDispositivos(Set<Dispositivo> dispositivos) {
		this.dispositivos = dispositivos;
	}
}