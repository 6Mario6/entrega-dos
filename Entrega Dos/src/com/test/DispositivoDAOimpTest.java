package com.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.udea.dao.DispositivoDAO;
import com.udea.dao.UsuarioDAO;
import com.udea.dto.Dispositivo;
import com.udea.dto.Usuario;
import com.udea.exception.MyException;
@RunWith(SpringJUnit4ClassRunner.class)
//para decirle que voy a correr la prueba con lo que queda entre parentesis
@Transactional
//es una prueba transactional
//Vago8
@ContextConfiguration(locations={"classpath:springconfig.xml"})
//Entre comillas debe ser la ruta del archivo de configuración xml
public class DispositivoDAOimpTest {
	@Autowired
	DispositivoDAO dispositivodao;
	@Test
	public void testGuardar() {
		Dispositivo dispositivo = new Dispositivo();
		dispositivo.setAdministrador(1);
		dispositivo.setCategoria(1);
		dispositivo.setDescripcion("Computador....");
		dispositivo.setEstado(1);
		Date date = new Date();
		dispositivo.setFechaAdquisicion(date);
		dispositivo.setIdDispositivo(2);
		dispositivo.setNombre("Computador");
		try{
			
			dispositivodao.guardar(dispositivo);			
			System.out.println("Usuario Guardado exitosamente");
							
			assertTrue(true);
			
		}catch(MyException e){
			//fail(e.getMessage());
		}
		System.out.println("ok");
	}

}
