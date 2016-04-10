package co.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.ClienteDAO;
import co.edu.udea.iw.util.exception.ExceptionAplication;

public class ClienteDAOImplTest {

	@Test
	public void testObtenerTodos() {
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
	}

}
