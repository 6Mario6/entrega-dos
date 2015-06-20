package com.udea.dao.imp;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.udea.dao.SolicitudPrestamoDAO;
import com.udea.dto.SolicitudPrestamo;
import com.udea.exception.MyException;
/**<h1> SolicitudPrestamoDao</h1>
*Clase encargada de aplicar la logica a la interfaz del mismo nombre
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class SolicitudPrestamoDAOimp extends HibernateDaoSupport implements
		SolicitudPrestamoDAO {
	/**Objeto de la clase logger, el cual nos permite log mensajes usando la clase propia
	 * 
	 */
	Logger log = Logger.getLogger(this.getClass());
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<SolicitudPrestamo> retorna la lista de Solicitudes de prestamo
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public List<SolicitudPrestamo> obtener() throws MyException {
		List<SolicitudPrestamo> solicitudes = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(SolicitudPrestamo.class);
			solicitudes = criteria.list();
		} catch (HibernateException e) {
			throw new MyException(e);
		}
		return solicitudes;
	}
	/**Con este metodo se buscara la solicitud de prestamo identificado con una idReservacion
	 * @param idReservacion parametro que se recibe para identificar la solicitud de perstamo en la base de datos
	 * @return SolicitudPrestamo retorna Solicitudprestamo buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	@Override
	public SolicitudPrestamo obtenerSolicitudPrestamo(Integer idReservacion)
			throws MyException {
		Session session = null;
		SolicitudPrestamo solicitud = null;

		try {
			session = getSession();
			solicitud = (SolicitudPrestamo) session.get(
					SolicitudPrestamo.class, idReservacion);
		} catch (HibernateException e) {
			log.error("Error SolicitudPrestamoDAO: ", e);
			throw new MyException(e);
		} finally {
			if (session != null) {
				session.close();
			}

		}
		return solicitud;
	}
	/**Este metodo guarda la solicitud de prestamo dentro de las bases de datos
	 * @param solicitud La solicitud de prestamo que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void guardar(SolicitudPrestamo solicitud) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.save(solicitud); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al guardar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se modifica la información de la la solicitud de prestamo
	 * @param solicitud elemento de la clase solicitud de prestamo  a la cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void actualizar(SolicitudPrestamo solicitud) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.update(solicitud);
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al actualizar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se eliminara una solicitud de prestamo de la base de datos
	 * @param solicitud la solicitud de prestamo a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void eliminar(SolicitudPrestamo solicitud) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.delete(solicitud); // update, delete
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
