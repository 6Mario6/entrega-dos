package com.udea.dao.imp;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.udea.dao.DispositivoDAO;
import com.udea.dto.Dispositivo;
import com.udea.exception.MyException;
/**<h1> DispositivoDaoimp</h1>
Implementacion de la interfaz del mismo nombre
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class DispositivoDAOimp extends HibernateDaoSupport implements
		DispositivoDAO {
	
	/**Objeto de la clase logger, el cual nos permite log mensajes usando la clase propia
	 * 
	 */
	Logger log = Logger.getLogger(this.getClass());
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<Dispositivo> retorna la lista de dispositivos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public List<Dispositivo> obtener() throws MyException {
		List<Dispositivo> dispositivos = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Dispositivo.class);
			dispositivos = criteria.list();
		} catch (HibernateException e) {
			throw new MyException(e);
		}
		return dispositivos;
	}
	/**Con este metodo se buscara el Dispositivo identificado con un idDispositivo
	 * @param idDispositivo parametro que se recibe para identificar la dispositivo en la base de datos
	 * @return Dispositivo retorna el dispositivo buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	@Override
	public Dispositivo obtenerDispositivo(Integer idDispositivo)
			throws MyException {
		Session session = null;
		Dispositivo dispositivo = null;

		try {
			session = getSession();
			dispositivo = (Dispositivo) session.get(Dispositivo.class,
					idDispositivo);

		} catch (HibernateException e) {
			log.error("Error DispositivoDAO: ", e);
			throw new MyException(e);
		} finally {
			if (session != null) {
				session.close();
			}

		}
		return dispositivo;
	}
	/**Este metodo guarda al usuario "dispositivo" dentro de las bases de datos
	 * @param dispositivo El dispositivo que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void guardar(Dispositivo dispositivo) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();

			session.save(dispositivo); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al guardar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se modifica la información del "dispositivo"
	 * @param dispositivo "dispositivo" a la cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void actualizar(Dispositivo dispositivo) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();

			session.update(dispositivo); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al actualizar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se eliminara al "dispositivo" de la base de datos
	 * @param dispositivo el "dispositivo" a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void eliminar(Dispositivo dispositivo) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();

			session.delete(dispositivo); // update, delete
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
