package co.edu.udea.iw.dto;

import java.util.Date;

/**
 * Permite la representaciion de los datos 
 * de la tabla cliente que se obtienen del DataSource
 * @author Yoiner Gomez yoiner.gomez22@gmail.com
 * @version 1
 * @category DTO
 */
public class Cliente {
	
	private String cedula;
	private String nombres;
	private String apellidos;
	private String email;
	private Usuario usuarioCrea;
	private Usuario usuarioModifica;
	private Usuario usuarioElimina;
	private boolean eliminado;
	private Date fechaCreacion;
	private Date fechaEliminacion;
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the usuarioCrea
	 */
	public Usuario getUsuarioCrea() {
		return usuarioCrea;
	}
	/**
	 * @param usuarioCrea the usuarioCrea to set
	 */
	public void setUsuarioCrea(Usuario usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}
	/**
	 * @return the usuarioModifica
	 */
	public Usuario getUsuarioModifica() {
		return usuarioModifica;
	}
	/**
	 * @param usuarioModifica the usuarioModifica to set
	 */
	public void setUsuarioModifica(Usuario usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}
	/**
	 * @return the usuarioElimina
	 */
	public Usuario getUsuarioElimina() {
		return usuarioElimina;
	}
	/**
	 * @param usuarioElimina the usuarioElimina to set
	 */
	public void setUsuarioElimina(Usuario usuarioElimina) {
		this.usuarioElimina = usuarioElimina;
	}
	public int getEliminado() {
		if(eliminado==true){
			return 1;
		}
		return 0;
	}
	public void setEliminado(Long eliminado) {
		if(eliminado==null || eliminado==0){
			this.eliminado = false;
			return;
	    }
		this.eliminado = true;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaEliminacion() {
		return fechaEliminacion;
	}
	public void setFechaEliminacion(Date fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}	
	
}