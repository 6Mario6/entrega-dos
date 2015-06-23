package com.udea.dao.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.udea.dao.UsuarioDAO;
import com.udea.dto.Usuario;
import com.udea.exception.MyException;
/**<h1> UsuarioDAO</h1>
*Clase encargada de implementar la logica de la interfaz del mismo nombre
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class UsuarioDAOimp extends HibernateDaoSupport implements UsuarioDAO {
	
	/**Objeto de la clase logger, el cual nos permite log mensajes usando la clase propia
	 * 
	 */
	Logger log = Logger.getLogger(this.getClass());
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<Usuario> retorna la lista de Usuarios
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public List<Usuario> obtener() throws MyException {
		List<Usuario> usuarios=null;
		Session session=null;
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Usuario.class);
			usuarios = criteria.list();
		} catch (HibernateException e) {
			throw new MyException(e);
		}
		return usuarios;
	}
	/**Con este metodo se buscara al usuario identificado con una idUsuario
	 * @param idUsuario parametro que se recibe para identificar al usuario en la base de datos
	 * @return usuario retorna El usuario buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	@Override
	public Usuario obtenerUsuario(Integer idUsuario) throws MyException {
		Usuario usuario = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Usuario.class).add(
					Restrictions.eq("idUsuario", idUsuario));
			usuario = (Usuario) criteria.uniqueResult();
		} catch (HibernateException e) {
			throw new MyException(e);
		}
		return usuario;
	}
	/**Con este metodo se buscara al usuario identificado con un username
	 * @param username parametro que se recibe para identificar al usuario en la base de datos
	 * @return usuario retorna El usuario buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	@Override
	public Usuario obtenerUsuario(String username) throws MyException {
		Usuario usuario = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Usuario.class).add(
					Restrictions.eq("username", username));
			usuario = (Usuario) criteria.uniqueResult();
		} catch (HibernateException e) {
			throw new MyException(e);
		}
		return usuario;
	}
	/**Este metodo guarda al usuario  dentro de las bases de datos
	 * @param usuario el usuario que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void guardar(Usuario usuario) throws MyException {
		// TODO Auto-generated method stub
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.save(usuario); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al guardar", e);
			throw new MyException(e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se modifica la información del usuario
	 * @param usuario usuario a la cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void actualizar(Usuario usuario) throws MyException {
		// TODO Auto-generated method stub
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.update(usuario); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al actualizar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se eliminara el usuario de la base de datos
	 * @param usuario el usuario a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void eliminar(Usuario usuario) throws MyException {
		// TODO Auto-generated method stub
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.delete(usuario); // update, delete
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
