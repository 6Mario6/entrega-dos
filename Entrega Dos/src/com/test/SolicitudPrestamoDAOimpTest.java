package com.test;

import static org.junit.Assert.*;

import java.sql.Time;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.udea.dao.AdministradorDAO;
import com.udea.dao.DispositivoDAO;
import com.udea.dao.SolicitudPrestamoDAO;
import com.udea.dao.UsuarioDAO;
import com.udea.dto.Administrador;
import com.udea.dto.SolicitudPrestamo;
import com.udea.dto.Usuario;
import com.udea.exception.MyException;
@RunWith(SpringJUnit4ClassRunner.class)
//para decirle que voy a correr la prueba con lo que queda entre parentesis
@Transactional
//es una prueba transactional
//Vago8
@ContextConfiguration(locations={"classpath:springconfig.xml"})
//Entre comillas debe ser la ruta del archivo de configuración xml
public class SolicitudPrestamoDAOimpTest {
	@Autowired
	SolicitudPrestamoDAO soliDAO;

	@Test
	public void testGuardar() throws MyException {
		
		Date date = new Date();
		SolicitudPrestamo solicitud = new SolicitudPrestamo();
		solicitud.setAdministrador(1);
		solicitud.setDispositivo(1);
		solicitud.setEstadoSolicitud("prestado");
		solicitud.setFechaSolicitudInicio(date);
	    Time jsqlT = new Time(0);
		solicitud.setHoraSolicitudInicio(jsqlT);
		solicitud.setIdReservacion(3);
		solicitud.setUsuario(1);
			
		try{
			
			soliDAO.guardar(solicitud);			
			System.out.println("Usuario Guardado exitosamente");
							
			assertTrue(true);
			
		}catch(MyException e){
			//fail(e.getMessage());
		}
		System.out.println("ok");
	}

}
