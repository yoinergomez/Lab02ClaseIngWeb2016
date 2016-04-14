package co.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.dto.CiudadDAO;
import co.edu.udea.iw.util.exception.ExceptionAplication;

import java.util.List;

import org.junit.Test;

/**
 * Permite realizar las pruebas unitarias
 * de la implementacion de CiudadDAO
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 * @version 1.0
 */
public class CiudadDAOImplTest {
	
	@Test
	public void testObtener(){
		List<Ciudad> ciudades = null;
		CiudadDAO ciudadDAO = null;
		try{
			ciudadDAO = new CiudadDAOImpl();
			ciudades = ciudadDAO.obtenerTodas();
			
			assertTrue(ciudades.size()>0);
		} catch(ExceptionAplication e){
			fail(e.getMessage());
			e.printStackTrace();
		}
	}

}
