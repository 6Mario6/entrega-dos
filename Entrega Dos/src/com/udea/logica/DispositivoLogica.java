package com.udea.logica;

import java.util.Date;
import java.util.List;

import com.udea.dto.Dispositivo;
import com.udea.exception.MyException;

/**<h1> DispositivoLogica</h1>
 * Es una interfaz la cual sirve para definir las funciones de la logica del negocio de los Dispositivos
 * 
 * 
 * @author Jorge Mario Fernandez
 * @version 1.0
 * @since 01-06-15
 *
 */
public interface DispositivoLogica {
	/**Con este metodo obtenemos la lista de Dispositivos
	 * @return List<Dispositivo> retorna la lista de Dispositivos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public List<Dispositivo> obtener() throws MyException;
	/**Con este metodo se buscara al usuario identificado con una idDispositivo
	 * @param idDispositivo parametro que se recibe para identificar al Dispositivo en la base de datos
	 * @return Dispositivo retorna El Dispositivo buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
	 */
	public Dispositivo obtenerDispositivo(Integer idDispositivo) throws MyException;
	/**Este metodo guarda al usuario  dentro de las bases de datos
	 *@param idDispositivo identificacion del dispositivo
	 *@param idCategoria identificacion de la categoria del dispositivo
	 *@param idEstado identificacion del estado del dispositivo
	 *@param idAdministrador identificacion del usuario
	 *@param nombre el nombre del dispositivo
	 *@param descripcion La descripcion del dispositivo
	 *@param fecha_adquisicion la fecha en la que se adquirio el dispositivo
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void guardarDispositivo(int idDispositivo,int idCategoria,
			int idEstado,int idAdministrador, String nombre, String descripcion,Date fecha_adquisicion) throws MyException;
	
	/**Con este metodo se modifica la información del Dispositivo
	 *@param idDispositivo identificacion del dispositivo
	 *@param idCategoria identificacion de la categoria del dispositivo
	 *@param idEstado identificacion del estado del dispositivo
	 *@param idAdministrador identificacion del usuario
	 *@param nombre el nombre del dispositivo
	 *@param descripcion La descripcion del dispositivo
	 *@param fecha_adquisicion la fecha en la que se adquirio el dispositivo
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void actualizarDispositivo(int idDispositivo,int idCategoria,
			int idEstado,int idAdministrador, String nombre, String descripcion,Date fecha_adquisicion) throws MyException;
	
	/**Con este metodo se eliminara el Dispositivo de la base de datos
	 * @param idDispositivo la identificacion del usuario a eliminar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void eliminarDispositivo(int idDispositivo) throws MyException;
	
}
