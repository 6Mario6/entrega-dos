package com.udea.dao;

import java.util.List;

import com.udea.dto.InventarioDispositivoId;
import com.udea.dto.InventarioDispositivo;
import com.udea.exception.MyException;

/**<h1> InventarioDispositivoDAO</h1>
 * Es una interfaz la cual sirve para simplificar la conexión a la base de datos
 * mas especificamente a la tabla de InventarioDispositivo y obtener de alli los datos solicitados
 * 
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public interface InventarioDispositivoDAO {
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<InventarioDispositivo> retorna la lista de Objetos almacenados en la tabla inventarioDispositivos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public List<InventarioDispositivo> obtener() throws MyException;

	/**Con este metodo se buscara al invetarioDispositivos identificado con una id	 
	 * * @param id parametro de la clase InventarioDispositivoID que se recibe para identificar el InventarioDispositivo en la base de datos
	 * @return InventarioDispositivo retorna el InventarioDispositivo buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	public InventarioDispositivo obtenerInventarioDispositivo(
			InventarioDispositivoId id) throws MyException;
	/**Este metodo guarda el InventarioDispositivo dentro de las bases de datos
	 * @param Inventario el inventarioDispositivo que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void guardar(InventarioDispositivo inventario) throws MyException;
	/**Con este metodo se modifica la información de InventarioDispositivo
	 * @param Inventario elemento de la clase InventarioDispositivo a la cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void actualizar(InventarioDispositivo inventario) throws MyException;
	/**Con este metodo se eliminara El inventarioDispositivo de la base de datos
	 * @param inventario elemento de la clase inventarioDispositivo el cual se desea borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void eliminar(InventarioDispositivo inventario) throws MyException;
}
