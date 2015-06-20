package com.udea.dao.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.udea.dao.EstadoDAO;
import com.udea.dto.Estado;
import com.udea.exception.MyException;
/**<h1> EstadoDAOimp</h1>
 * Implementacion de la interfaz del mismo nombre
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class EstadoDAOimp extends HibernateDaoSupport implements EstadoDAO {
	
	/**Objeto de la clase logger, el cual nos permite log mensajes usando la clase propia
	 * 
	 */
	Logger log = Logger.getLogger(this.getClass());
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<Estado> retorna la lista de Estados
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public List<Estado> obtener() throws MyException {
		List<Estado> estados = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Estado.class);
			estados = criteria.list();
		} catch (HibernateException e) {
			throw new MyException(e);
		}
		return estados;
	}
	/**Con este metodo se buscara el estado identificado con una idEstado
	 * @param idEstado parametro que se recibe para identificar el estado en la base de datos
	 * @return Estado retorna el estado buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	@Override
	public Estado obtenerEstado(Integer idEstado) throws MyException {
		Session session = null;
		Estado estado = null;

		try {
			session = getSession();
			estado = (Estado) session.get(Estado.class, idEstado);

		} catch (HibernateException e) {
			log.error("Error EstadoDAO: ", e);
			throw new MyException(e);
		} finally {
			if (session != null) {
				session.close();
			}

		}
		return estado;
	}
	/**Este metodo guarda el estado dentro de las bases de datos
	 * @param estado el estado que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void guardar(Estado estado) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.save(estado); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al guardar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se modifica la información del estado
	 * @param estado  el estado al cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void actualizar(Estado estado) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.update(estado); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al actualizar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se eliminara el estado de la base de datos
	 * @param estado el estado a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void eliminar(Estado estado) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.delete(estado); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al eliminar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

}
