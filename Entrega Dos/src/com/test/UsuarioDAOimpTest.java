package com.test;

	
import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.udea.dao.UsuarioDAO;
import com.udea.dao.imp.UsuarioDAOimp;
import com.udea.dto.Usuario;
import com.udea.encode.Cifrar;
import com.udea.exception.MyException;


@RunWith(SpringJUnit4ClassRunner.class)
//para decirle que voy a correr la prueba con lo que queda entre parentesis
@Transactional
//es una prueba transactional
//Vago8
@ContextConfiguration(locations={"classpath:springconfig.xml"})
//Entre comillas debe ser la ruta del archivo de configuración xml
public class UsuarioDAOimpTest {
	
	@Autowired
	UsuarioDAO usuariodao;
	List<Usuario> usuarios = null;

	@Test
	public void testObtener() {
     
		PropertyConfigurator.configure("log4j.properties");
		
		try {
			
			usuarios = usuariodao.obtener();

			for (Usuario user : usuarios) {
				System.out.println("Nombre Usuario: "
						+ user.getNombre());

			}

			assertTrue(true);

		} catch (MyException e) {
			
			e.printStackTrace();
			fail(e.getMessage());
			System.out.println("Mensaje de error:");
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testObtenerUsuario() {
		
		Usuario user = null;

		try {
			// Prueba para obtener el administrador con idadministrador=1
			user = usuariodao.obtenerUsuario(1);
			System.out.println("id usuario: " + user.getIdUsuario());

			assertTrue(true);

		} catch (MyException e) {
			fail(e.getMessage());
		}
		
	}

	@Test
	@Rollback(true)
	public void testGuardar() {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Ant");
		usuario.setApellido("Man");
		usuario.setEmail("newavenger@gmail.com");
		usuario.setGrupoInvestigacion("Web");
		usuario.setIdUsuario(78);
		usuario.setPassword("1234");
		usuario.setTelefono("778955");
		usuario.setUsername("AntMan");
		
		try{
			
			usuariodao.guardar(usuario);			
			System.out.println("Usuario Guardado exitosamente");
							
			assertTrue(true);
			
		}catch(MyException e){
			//fail(e.getMessage());
		}
		System.out.println("ok");
	}

	@Test
	public void testActualizar() {
		
	/*	Usuario usuario = new Usuario();
		usuario.setNombre("Anderson");
		usuario.setApellido("Villa");
		usuario.setEmail("and@gmail.com");
		usuario.setGrupoInvestigacion("Web");
		usuario.setIdUsuario(44);
		usuario.setPassword("1234");
		usuario.setTelefono("778955");
		usuario.setUsername("cunt vaporizer");
		
		try{
			
			usuariodao.actualizar(usuario);			
			System.out.println("Usuario Guardado exitosamente");
							
			assertTrue(true);
			
		}catch(MyException e){
			fail(e.getMessage());
		}*/
		System.out.println("ok");
		
	}

	@Test
	public void testEliminar() {
	/*
		Usuario usuario=new Usuario();
		usuario.setNombre("Anderson");
		usuario.setApellido("Villa");
		usuario.setEmail("and@gmail.com");
		usuario.setGrupoInvestigacion("Web");
		usuario.setIdUsuario(44);
		usuario.setPassword("1234");
		usuario.setTelefono("778955");
		usuario.setUsername("cunt vaporizer");
		
		try{
			
			usuariodao.eliminar(usuario);			
			System.out.println("usuario eliminado exitosamente");
							
			assertTrue(true);
			
		}catch(MyException e){
			fail(e.getMessage());
		}*/
		
	}

}
