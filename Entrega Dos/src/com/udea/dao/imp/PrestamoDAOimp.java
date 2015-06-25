package com.udea.dao.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.udea.dao.PrestamoDAO;
import com.udea.dto.Prestamo;
import com.udea.exception.MyException;
/**<h1> PrestamoDAOimp</h1>
*clase encargada de aplicar la logica a la interfaz del mismo nombre
 * 
 * @author andersson villa
 * @author Jorge Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class PrestamoDAOimp extends HibernateDaoSupport implements PrestamoDAO {
	
	/**Objeto de la clase logger, el cual nos permite log mensajes usando la clase propia
	 * 
	 */
	Logger log = Logger.getLogger(this.getClass());
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<Prestamo> retorna la lista de prestamos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public List<Prestamo> obtener() throws MyException {
		List<Prestamo> prestamos = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Prestamo.class);
			prestamos = criteria.list();
		} catch (HibernateException e) {
			throw new MyException(e);
		}
		return prestamos;
	}
	/**Con este metodo se buscara el prestamo identificado con una idprestamo
	 * @param idprestamo parametro que se recibe para identificar el prestamo en la base de datos
	 * @return prestamo retorna el prestamo buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	@Override
	public Prestamo obtenerPrestamo(Integer idPrestamo) throws MyException {
		Session session = null;
		Prestamo prestamo = null;

		try {
			session = getSession();
			prestamo = (Prestamo) session.get(Prestamo.class, idPrestamo);

		} catch (HibernateException e) {
			log.error("Error PrestamoDAO: ", e);
			throw new MyException(e);
		} finally {
			if (session != null) {
				session.close();
			}

		}
		return prestamo;
	}
	/**Este metodo guarda el prestamo dentro de las bases de datos
	 * @param prestamo el elemento de la clase prestamo que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void guardar(Prestamo prestamo) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.save(prestamo); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al guardar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se modifica la información del prestamo
	 * @param prestamo elemento de la clase prestamoal cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void actualizar(Prestamo prestamo) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.update(prestamo); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al actualizar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se eliminara el prestamo de la base de datos
	 * @param prestamo elemento de la clase prestamo a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void eliminar(Prestamo prestamo) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.delete(prestamo); // update, delete
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
