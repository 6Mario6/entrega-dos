package com.udea.dao.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.udea.dao.InventarioDispositivoDAO;
import com.udea.dto.Estado;
import com.udea.dto.InventarioDispositivo;
import com.udea.dto.InventarioDispositivoId;
import com.udea.exception.MyException;
/**<h1> InventarioDispositivoDAOimp</h1>
Implementacion de la interfaz del mismo nombre
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class InventarioDispositivoDAOimp extends HibernateDaoSupport implements
		InventarioDispositivoDAO {
	/**Objeto de la clase logger, el cual nos permite log mensajes usando la clase propia
	 * 
	 */
	Logger log = Logger.getLogger(this.getClass());
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<InventarioDispositivo> retorna la lista de Objetos almacenados en la tabla inventarioDispositivos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public List<InventarioDispositivo> obtener() throws MyException {
		List<InventarioDispositivo> inventarios = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Estado.class);
			inventarios = criteria.list();
		} catch (HibernateException e) {
			throw new MyException(e);
		}
		return inventarios;
	}
	/**Con este metodo se buscara al invetarioDispositivos identificado con una id	 
	 * * @param id parametro de la clase InventarioDispositivoID que se recibe para identificar el InventarioDispositivo en la base de datos
	 * @return InventarioDispositivo retorna el InventarioDispositivo buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	@Override
	public InventarioDispositivo obtenerInventarioDispositivo(
			InventarioDispositivoId id) throws MyException {
		Session session = null;
		InventarioDispositivo inventario = null;

		try {
			session = getSession();
			inventario = (InventarioDispositivo) session.get(
					InventarioDispositivo.class, id);

		} catch (HibernateException e) {
			log.error("Error InventarioDispositivoDAO: ", e);
			throw new MyException(e);
		} finally {
			if (session != null) {
				session.close();
			}

		}
		return inventario;
	}
	/**Este metodo guarda el InventarioDispositivo dentro de las bases de datos
	 * @param Inventario el inventarioDispositivo que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void guardar(InventarioDispositivo inventario) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.save(inventario); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al guardar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se modifica la información de InventarioDispositivo
	 * @param Inventario elemento de la clase InventarioDispositivo a la cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void actualizar(InventarioDispositivo inventario) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.update(inventario); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al actualizar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se eliminara El inventarioDispositivo de la base de datos
	 * @param inventario elemento de la clase inventarioDispositivo el cual se desea borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void eliminar(InventarioDispositivo inventario) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.delete(inventario); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al borrar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

}
