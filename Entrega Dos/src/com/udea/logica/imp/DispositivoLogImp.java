package com.udea.logica.imp;

import java.util.Date;
import java.util.List;

import com.udea.dao.AdministradorDAO;
import com.udea.dao.CategoriaDAO;
import com.udea.dao.DispositivoDAO;
import com.udea.dao.EstadoDAO;
import com.udea.dto.Dispositivo;
import com.udea.dto.Usuario;
import com.udea.encode.Cifrar;
import com.udea.exception.MyException;
import com.udea.logica.DispositivoLogica;

/**<h1> DispositivoLogImp</h1>
 * Clase que implementa los metodos de la logica del negocio relacionada con los dispositivos
 * 
 * 
 * @author Jorge Mario Fernandez
 * @version 1.0
 * @since 01-06-15
 *
 */
public class DispositivoLogImp implements DispositivoLogica {
	private DispositivoDAO disDao;
	private AdministradorDAO adDao;
	private CategoriaDAO catDao;
	private EstadoDAO estDao;
	/**Con este metodo obtenemos la lista de Dispositivos
	 * @return List<Dispositivo> retorna la lista de Dispositivos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public List<Dispositivo> obtener() throws MyException {
		
		return disDao.obtener();
	}
	/**Con este metodo se buscara al usuario identificado con una idDispositivo
	 * @param idDispositivo parametro que se recibe para identificar al Dispositivo en la base de datos
	 * @return Dispositivo retorna El Dispositivo buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public Dispositivo obtenerDispositivo(Integer idDispositivo)
			throws MyException {
		Dispositivo dispositivo= disDao.obtenerDispositivo(idDispositivo);
		if ( dispositivo== null) {
			throw new MyException("El dispositivo no existe en el sistema.");
		}
		return dispositivo;
	}
	/**Este metodo guarda el dispositivo  dentro de las bases de datos
	 *@param idDispositivo identificacion del dispositivo
	 *@param idCategoria identificacion de la categoria del dispositivo
	 *@param idEstado identificacion del estado del dispositivo
	 *@param idAdministrador identificacion del usuario
	 *@param nombre el nombre del dispositivo
	 *@param descripcion La descripcion del dispositivo
	 *@param fecha_adquisicion la fecha en la que se adquirio el dispositivo
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void guardarDispositivo(int idDispositivo, int idCategoria,
			int idEstado, int idAdministrador, String nombre,
			String descripcion, Date fecha_adquisicion) throws MyException {
		
		Dispositivo dispositivo = null;
		
		if (disDao.obtenerDispositivo(idDispositivo)!= null) {
			throw new MyException("El dispositivo ya existe en el sistema.");
		}
		if (catDao.obtenerCategoria(idCategoria)== null) {
			throw new MyException(
					"La categoria no existe");
		}
		if (estDao.obtenerEstado(idEstado) == null) {
			throw new MyException(
					"El estado  no existe");
		}
		if (adDao.obtenerAdministrador(idAdministrador)== null) {
			throw new MyException(
					"El telefono del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (nombre.isEmpty() || nombre == null) {
			throw new MyException(
					"El nombre del dispositivo no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (descripcion.isEmpty() || descripcion == null) {
			throw new MyException(
					"El descripcion del dispositivo no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (fecha_adquisicion == null) {
			throw new MyException(
					"la fecha_adquisicion del dispositivo no puede ser nulo");
		}
		
		dispositivo = new Dispositivo();
		dispositivo.setAdministrador(idAdministrador);
		dispositivo.setCategoria(idCategoria);
		dispositivo.setDescripcion(descripcion);
		dispositivo.setEstado(idEstado);
		dispositivo.setFechaAdquisicion(fecha_adquisicion);
		dispositivo.setIdDispositivo(idDispositivo);
		dispositivo.setNombre(nombre);
		disDao.guardar(dispositivo);
		
	}
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
	@Override
	public void actualizarDispositivo(int idDispositivo, int idCategoria,
			int idEstado, int idAdministrador, String nombre,
			String descripcion, Date fecha_adquisicion) throws MyException {

		Dispositivo dispositivo = null;
		
		if (disDao.obtenerDispositivo(idDispositivo)== null) {
			throw new MyException("El usuario no existe en el sistema.");
		}
		
		
		if (catDao.obtenerCategoria(idCategoria)== null) {
			throw new MyException(
					"La categoria no existe");
		}
		if (estDao.obtenerEstado(idEstado) == null) {
			throw new MyException(
					"El estado  no existe");
		}
		if (adDao.obtenerAdministrador(idAdministrador)== null) {
			throw new MyException(
					"El telefono del usuario no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (nombre.isEmpty() || nombre == null) {
			throw new MyException(
					"El nombre del dispositivo no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (descripcion.isEmpty() || descripcion == null) {
			throw new MyException(
					"El descripcion del dispositivo no puede ser nulo, ni una cadena de caracteres vacia");
		}
		if (fecha_adquisicion == null) {
			throw new MyException(
					"la fecha_adquisicion del dispositivo no puede ser nulo");
		}
		
		dispositivo = new Dispositivo();
		dispositivo.setAdministrador(idAdministrador);
		dispositivo.setCategoria(idCategoria);
		dispositivo.setDescripcion(descripcion);
		dispositivo.setEstado(idEstado);
		dispositivo.setFechaAdquisicion(fecha_adquisicion);
		dispositivo.setNombre(nombre);
		disDao.guardar(dispositivo);
		
	}
	/**Con este metodo se eliminara el Dispositivo de la base de datos
	 * @param idDispositivo la identificacion del usuario a eliminar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void eliminarDispositivo(int idDispositivo) throws MyException {
		Dispositivo dispositivo = null;

		dispositivo = disDao.obtenerDispositivo(idDispositivo);
		if (dispositivo == null) {
			throw new MyException("El usuario no existe en el sistema.");
		}

		disDao.eliminar(dispositivo);
		
	}
	
	public DispositivoDAO getDisDao() {
		return disDao;
	}
	public void setDisDao(DispositivoDAO disDao) {
		this.disDao = disDao;
	}
	public AdministradorDAO getAdDao() {
		return adDao;
	}
	public void setAdDao(AdministradorDAO adDao) {
		this.adDao = adDao;
	}
	public CategoriaDAO getCatDao() {
		return catDao;
	}
	public void setCatDao(CategoriaDAO catDao) {
		this.catDao = catDao;
	}
	public EstadoDAO getEstDao() {
		return estDao;
	}
	public void setEstDao(EstadoDAO estDao) {
		this.estDao = estDao;
	}

}
