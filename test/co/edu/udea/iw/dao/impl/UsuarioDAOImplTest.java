package co.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.dto.UsuarioDAO;
import co.edu.udea.iw.util.exception.ExceptionAplication;

/**
 * Permite realizar las pruebas unitarias
 * de la implementacion de UsuarioDAO
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 * @version 1.0
 */
public class UsuarioDAOImplTest {

	@Test
	public void testObtener() {
		Usuario usuario = null;
		UsuarioDAO usuarioDAO = null;
		try{
			usuarioDAO = new UsuarioDAOImpl();
			usuario = usuarioDAO.obtener("elver");
			
			System.out.println("Nombre: "+usuario.getNombres());
			System.out.println("Nombre del rol: "+usuario.getRol().getNombre());
			assertTrue(usuario!=null);
		} catch(ExceptionAplication e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
