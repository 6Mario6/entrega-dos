package com.udea.dto;

import java.io.Serializable;

/**<h1> usuario</h1>
Clase encargada de los setter y getter del elemento usuario
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class Usuario implements Serializable {
	
/**
 * la id del usuario
 */
	private int idUsuario;
	/**
	 * el nombre del usuario
	 */
	private String nombre;
	/**
	 * el apellido del usuario
	 */
	private String apellido;
	/**
	 * el telefono del usuario
	 */
	private String telefono;
	/**
	 * el email del usuario
	 */
	private String email;
	/**
	 * el username del usuario
	 */
	private String username;
	/**
	 * la password del usuario
	 */
	
	private String password;
	/**
	 * el grupo al que pertenece el usuario
	 */
	private String grupoInvestigacion;

	/**
	 * retorna la id del usuario
	 * @return entero con la id del usuario
	 */
	public int getIdUsuario() {
		return idUsuario;
	}
	/**
	 * establece la id del usuario
	 * @param idUsuario la nueva id del usuario
	 */

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
/**
 * retorna el nombre del usuario
 * @return string con el nombre del usuario
 */
	public String getNombre() {
		return nombre;
	}
/**
 * establece el nuevo nombre del usuario
 * @param nombre el nuevo nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * retorna el apellido del usuario 
 * @return String con el apellido del usuario
 */
	public String getApellido() {
		return apellido;
	}
/**
 * establece el nuevo apellido del usuario
 * @param apellido el nuevo apellido
 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
/**
 * retorna el telefono del usuario
 * @return string con el numero telefonico del usuario
 */
	public String getTelefono() {
		return telefono;
	}
/**
 * establece el nuevo telefono del usuario
 * @param telefono el nuevo telefono del usuario
 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
/**
 * retorna el email del usuario
 * @return string con el email del usuario
 */
	public String getEmail() {
		return email;
	}
/**
 * establece el email del usuario
 * @param email el nuevo email tipo string
 */
	public void setEmail(String email) {
		this.email = email;
	}
/**
 * retorna el username del usuario
 * @return string con el username
 */
	public String getUsername() {
		return username;
	}

	/**
	 * establece el username del usuario
	 * @param username el nuevo username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
/**
 * retorna la password del usuario
 * @return String con la password del usuario
 */
	public String getPassword() {
		return password;
	}
/**
 * establece la password del usuario
 * @param password la nueva password
 */
	public void setPassword(String password) {
		this.password = password;
	}
/**
 * retorna el grupo de investigacion del usuario
 * @return string con el grupo de investigacion del usuario
 */
	public String getGrupoInvestigacion() {
		return grupoInvestigacion;
	}
/**
 * establece el grupo de investigacion del usuario
 * @param grupoInvestigacion el nuevo grupo de investigacion
 */
	public void setGrupoInvestigacion(String grupoInvestigacion) {
		this.grupoInvestigacion = grupoInvestigacion;
	}

}
