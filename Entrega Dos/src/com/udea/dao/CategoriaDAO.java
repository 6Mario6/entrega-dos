package com.udea.dao;

import java.util.List;

import com.udea.dto.Categoria;
import com.udea.exception.MyException;

/**<h1> CategoriaDao</h1>
 * Es una interfaz la cual sirve para simplificar la conexión a la base de datos
 * mas especificamente a la tabla de Categoria y obtener de alli los datos solicitados
 * 
 * 
 * @author andersson villa
 * @author Mario Fernandez
 * @author David Montoya
 * @version 1.0
 * @since 01-06-15
 *
 */
public interface CategoriaDAO {
	
	/**Con este metodo obtenemos todos los datos dentro de la tabla en una lista
	 * @return List<CAtegoria> retorna la lista de Categorias
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public List<Categoria> obtener() throws MyException;

	/**Con este metodo se buscara la categoria identificada con una idCategoria
	 * @param idCategoria parametro que se recibe para identificar la categoria en la base de datos
	 * @return Categoria retorna la categoria buscado
 	 * @throws MyException	Esta es una excepción propia en caso de inconvenientes
 	 *
	 */
	public Categoria obtenerCategoria(Integer idCategoria) throws MyException;


	/**Este metodo guarda al usuario "Categoria" dentro de las bases de datos
	 * @param categoria La categoria que se desea guardar enla base de datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void guardar(Categoria categoria) throws MyException;

	/**Con este metodo se modifica la información de la "categoria"
	 * @param categoria "categoria" a la cual se le han modificado los datos
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void actualizar(Categoria categoria) throws MyException;

	/**Con este metodo se eliminara al "Categoria" de la base de datos
	 * @param Categoria el "categoria" a borrar
	 * @throws MyException Esta es una excepción propia en caso de inconvenientes
	 */
	public void eliminar(Categoria categoria) throws MyException;

}
