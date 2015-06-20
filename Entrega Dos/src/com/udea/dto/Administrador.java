package com.udea.dto;

import java.io.Serializable;


/**<h1> Administrador</h1>
Clase encargada de los setter y getter del elemento administrador
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class Administrador implements Serializable {
	/**
	 * entero el cual identiica la id del administrador
	 * 
	 */
	private int idAdministrador;
	/**
	 * elemento del tipo usuario el cual podemos almacenar al usuario
	 */
	private Usuario usuario;

	/** Obtiene la id del administrador
	 * @return un entero con la id del administrador
	 */
	public int getIdAdministrador() {
		return idAdministrador;
	}

	/** establece el valor de la variable idAdministrador
	 * @param idAdministrador
	 */
	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	/** metodo encargado de obtener al usuario alamacenado
	 * @return un usuario alamacenado
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/** establece el usuario a almacenar
	 * @param usuario el usuario a almacenar
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}