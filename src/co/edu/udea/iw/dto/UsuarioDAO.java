/**
 * 
 */
package co.edu.udea.iw.dto;

import co.edu.udea.iw.util.exception.ExceptionAplication;

/**
 * Expone los metodos CRUD para operar en la entidad Usuario
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 * @version 1.0
 */
public interface UsuarioDAO {
	
	/*
	 * Obtiene un usuario dado el login
	 */
	public Usuario obtener(String login) throws ExceptionAplication;
	
}
