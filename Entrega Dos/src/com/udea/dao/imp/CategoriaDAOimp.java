package com.udea.dao.imp;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.udea.dao.CategoriaDAO;
import com.udea.dto.Categoria;
import com.udea.exception.MyException;
/**<h1> CategoriaDaoimp</h1>
 * Clase la cual se encarga de inyectar codigo a la interfaz del mismo nombre
 * ademas de ejecutar los metodos
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public class CategoriaDAOimp extends HibernateDaoSupport implements
		CategoriaDAO {
	/**Objeto de la clase logger, el cual nos permite log mensajes usando la clase propia
	 * 
	 */
	Logger log = Logger.getLogger(this.getClass());
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<CAtegoria> retorna la lista de Categorias
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public List<Categoria> obtener() throws MyException {
		List<Categoria> categorias = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Categoria.class);
			categorias = criteria.list();
		} catch (HibernateException e) {
			throw new MyException(e);
		}
		return categorias;
	}
	/**Con este metodo se buscara la categoria identificada con una idCategoria
	 * @param idCategoria parametro que se recibe para identificar la categoria en la base de datos
	 * @return Categoria retorna la categoria buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	@Override
	public Categoria obtenerCategoria(Integer idCategoria) throws MyException {
		Session session = null;
		Categoria categoria = null;

		try {
			session = getSession();
			categoria = (Categoria) session.get(Categoria.class, idCategoria);

		} catch (HibernateException e) {
			log.error("Error CategoriaDAO: ", e);
			throw new MyException(e);
		} finally {
			if (session != null) {
				session.close();
			}

		}
		return categoria;
	}
	/**Este metodo guarda al usuario "Categoria" dentro de las bases de datos
	 * @param categoria La categoria que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void guardar(Categoria categoria) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();

			session.save(categoria); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al guardar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se modifica la información de la "categoria"
	 * @param categoria "categoria" a la cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void actualizar(Categoria categoria) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.update(categoria); // update, delete
			tx.commit();

		} catch (HibernateException e) {
			log.error("ocurrió un error al actualizar", e);

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	/**Con este metodo se eliminara al "Categoria" de la base de datos
	 * @param Categoria el "categoria" a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	@Override
	public void eliminar(Categoria categoria) throws MyException {
		Session session = null;

		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.delete(categoria); // update, delete
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
