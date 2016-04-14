package co.edu.udea.iw.dto;

/**
 * Representa la entidad Usuario de la base de datos
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 * @version 1.0
 */
public class Usuario {
	
	private String login;
	private String nombres;
	private String apellidos;
	private String contrasena;
	private Rol rol;
	
	
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return the apellido
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellidos(String apellido) {
		this.apellidos = apellido;
	}
	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}
	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	/**
	 * @return the rol
	 */
	public Rol getRol() {
		return rol;
	}
	/**
	 * @param rol the rol to set
	 */
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	
}
