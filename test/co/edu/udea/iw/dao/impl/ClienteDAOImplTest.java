package co.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.ClienteDAO;
import co.edu.udea.iw.util.exception.ExceptionAplication;

/**
 * Permite realizar las pruebas unitarias
 * de la implementacion de ClienteDAO
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 * @version 1.0
 */
public class ClienteDAOImplTest {

	@Test
	public void testObtenerTodos() {
		/*
		//Prueba Obtener todos los clientes	
		List<Cliente> clientes = null;
		ClienteDAO clienteDAO = null;
		try{
			clienteDAO = new ClienteDAOImpl();
			clientes = clienteDAO.obtenerTodos();
			
			assertTrue(clientes.size()>0);
		} catch(ExceptionAplication e){
			e.printStackTrace();
			fail(e.getMessage());
		}
		*/
		Cliente cliente = null;
		ClienteDAO clienteDAO = null;
		try{
			clienteDAO = new ClienteDAOImpl();
			cliente = clienteDAO.obtener("222");
			
			assertTrue(cliente!=null);
		} catch(ExceptionAplication e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
