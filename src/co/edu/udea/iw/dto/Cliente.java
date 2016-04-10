package co.edu.udea.iw.dto;

import java.util.Date;

public class Cliente {
	
	private String cedula;
	private String nombres;
	private String apellidos;
	private String email;
	private String usuarioCrea;
	private String usuarioModifica;
	private String usuarioElimina;
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
	public String getUsuarioCrea() {
		return usuarioCrea;
	}
	public void setUsuarioCrea(String usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}
	public String getUsuarioModifica() {
		return usuarioModifica;
	}
	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}
	public String getUsuarioElimina() {
		return usuarioElimina;
	}
	public void setUsuarioElimina(String usuarioElimina) {
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