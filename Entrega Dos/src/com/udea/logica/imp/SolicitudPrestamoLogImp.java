package com.udea.logica.imp;

import java.util.List;

import com.udea.dao.UsuarioDAO;
import com.udea.dto.SolicitudPrestamo;
import com.udea.dto.Usuario;
import com.udea.exception.MyException;
import com.udea.logica.SolicitudPrestamoLogica;

/**<h1> SolicitudPrestamoLogica</h1>
 * Es una interfaz la cual sirve para definir las funciones de la logica del negocio de las solicitudes
 * 
 * 
 * @author Jorge Mario Fernandez
 * @version 1.0
 * @since 01-06-15
 *
 */
public class SolicitudPrestamoLogImp implements SolicitudPrestamoLogica {
	private UsuarioDAO usDao;

	@Override
	public List<SolicitudPrestamo> obtener() throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SolicitudPrestamoLogImp obtenerSolicitudPrestamoLogica(
			Integer idReservacion) throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void realizarSolicitud(int idReservacion, String nombre,
			String apellido, String telefono, String email, String username,
			String password, String grupoInvestigacion) throws MyException {
		// TODO Auto-generated method stub
		
	}
	
}
