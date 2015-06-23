package com.udea.logica;

import java.util.List;

import com.udea.dto.Usuario;
import com.udea.exception.MyException;

public interface UsuarioLogn {
	public List<Usuario> obtener() throws MyException;

	public void guardarUsuario(int idUsuario, String nombre, String apellido,
			String telefono, String email, String username, String password,
			String grupoInvestigacion) throws MyException;

	public void actualizarUsuario(int idUsuario, String nombre,
			String apellido, String telefono, String email, String username,
			String password, String grupoInvestigacion) throws MyException;

	public void eliminarUsuario(int idUsuario) throws MyException;
	public boolean  validar (String username, String password) throws MyException;

}
