package co.edu.udea.iw.dto;
/**
 * Representa la entidad Rol de la base de datos
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 * @version 1.0
 */
public class Rol {
	
	private String codigo;
	private String nombre;
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
