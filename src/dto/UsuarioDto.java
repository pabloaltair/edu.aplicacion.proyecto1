package dto;

/**
 * Atributos del Usuario
 * @author prosdez
 * 15/10/2024
*/
public class UsuarioDto {
	
	//ATRIBUTOS
	private long idUsuario;
	private String nombreUsuario = "aaaaa";
	private String contrasenaUsuario = "aaaaa";
	private String descripcionUsuario = "aaaaa";
	private String enlaceImagen = "aaaaa";
	private boolean enClub = false;
	public long getIdUsuario() {
		return idUsuario;
	}
	
	//GETTERS Y SETTERS
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContrasenaUsuario() {
		return contrasenaUsuario;
	}
	public void setContrasenaUsuario(String contrasenaUsuario) {
		this.contrasenaUsuario = contrasenaUsuario;
	}
	public String getDescripcionUsuario() {
		return descripcionUsuario;
	}
	public void setDescripcionUsuario(String descripcionUsuario) {
		this.descripcionUsuario = descripcionUsuario;
	}
	public String getEnlaceImagen() {
		return enlaceImagen;
	}
	public void setEnlaceImagen(String enlaceImagen) {
		this.enlaceImagen = enlaceImagen;
	}
	public boolean isEnClub() {
		return enClub;
	}
	public void setEnClub(boolean enClub) {
		this.enClub = enClub;
	}


}