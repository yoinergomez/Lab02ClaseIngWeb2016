package co.edu.udea.iw.dto;

import java.util.List;

import co.edu.udea.iw.util.exception.ExceptionAplication;

public interface ClienteDAO {
	
	/**
	 * Insertar un cliente en la base de datos,
	 * el atributo codigo debera ser diferente
	 * a los demás registros. 
	 * @param cliente
	 * @throws ExceptionAplication
	 */
	public void insertar(Cliente cliente) throws ExceptionAplication;
	
	/**
	 * Obtiene todas las tuplas de la tabla clientes
	 * @return
	 * @throws ExceptionAplication
	 */
	public List<Cliente> obtenerTodos() throws ExceptionAplication;
	
	/**
	 * Permite modificar todos los campos de un cliente
	 * excepto el atributo codigo que permite identificar
	 * a la cliente que se hace referencia
	 * 
	 */
	public void modificar(Cliente cliente) throws ExceptionAplication;
	
	/**
	 * Elimina un cliente de la base de datos
	 */
	public void eliminar(Cliente cliente) throws ExceptionAplication;
	
	/**
	 * Obtiene un cliente dado un codigo de cliente
	 */
	public Cliente obtener(String cedula) throws ExceptionAplication;
}
