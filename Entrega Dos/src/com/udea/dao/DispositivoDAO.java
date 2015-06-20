package com.udea.dao;

import java.util.List;

import com.udea.dto.Dispositivo;
import com.udea.exception.MyException;
/**<h1> DispositivoDao</h1>
 * Es una interfaz la cual sirve para simplificar la conexión a la base de datos
 * mas especificamente a la tabla de Dispositivo y obtener de alli los datos solicitados
 * 
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public interface DispositivoDAO {
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<Dispositivo> retorna la lista de dispositivos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public List<Dispositivo> obtener() throws MyException;
	/**Con este metodo se buscara el Dispositivo identificado con un idDispositivo
	 * @param idDispositivo parametro que se recibe para identificar la dispositivo en la base de datos
	 * @return Dispositivo retorna el dispositivo buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	public Dispositivo obtenerDispositivo(Integer idDispositivo)
			throws MyException;
	/**Este metodo guarda al usuario "dispositivo" dentro de las bases de datos
	 * @param dispositivo El dispositivo que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void guardar(Dispositivo dispositivo) throws MyException;
	/**Con este metodo se modifica la información del "dispositivo"
	 * @param dispositivo "dispositivo" a la cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void actualizar(Dispositivo dispositivo) throws MyException;
	/**Con este metodo se eliminara al "dispositivo" de la base de datos
	 * @param dispositivo el "dispositivo" a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void eliminar(Dispositivo dispositivo) throws MyException;
}
