package com.udea.dao.imp;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.udea.dao.AdministradorDAO;
import com.udea.dto.Administrador;
import com.udea.exception.MyException;


/**<h1> AdminstradorDAOimp</h1>
 * clase la cual injecta logica a la interfaz de su mismo nombre
 * 
 * 
 * @author andersson villa
 * @author Jorge Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class AdministradorDAOimp extends HibernateDaoSupport implements
		AdministradorDAO {
	
	/**Objeto de la clase logger, el cual nos permite log mensajes usando la clase propia
	 * 
	 */
	Logger log = Logger.getLogger(this.getClass());
	
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<Administrador> retorna la lista de administradores
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public List<Administrador> obtener() throws MyException {
		List<Administrador> administradores = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Administrador.class);
			administradores = criteria.list();
		} catch (HibernateException e) {
			throw new MyException(e);
		}
		return administradores;
	}
	/**Con este metodo se buscara al administrador identificado con una idAdministrador
	 * @param idAdministrador parametro que se recibe para identificar el administrador en la base de datos
	 * @return Adminstrador retorna al administrador buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	@Override
	public Administrador obtenerAdministrador(Integer idAdministrador)
			throws MyException {
		Session session = null;
		Administrador administrador = null;

		try {
			session = getSession();
			administrador = (Administrador) session.get(Administrador.class,
					idAdministrador); // Aqui esta llendo a la base de datos a
										// traer los datos

		} catch (HibernateException e) {
			log.error("Error AdministradorDAO: ", e);
			throw new MyException(e);
		} finally {
			if (session != null) {
				session.close();
			}

		}
		return administrador;
	}
	/**Este metodo guarda al usuario "administrador" dentro de las bases de datos
	 * @param administrador El administrador que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void guardar(Administrador administrador) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();

			session.save(administrador); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al guardar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se modifica la información del "administrador"
	 * @param administrador "administrador" al cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void actualizar(Administrador administrador) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.update(administrador); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al actualizar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se eliminara al "administrador" de la base de datos
	 * @param administrador el "administrador" a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void eliminar(Administrador administrador) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.delete(administrador); // update, delete
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
