package dto;

/**
 * Atributos del Usuario
 * @author prosdez
 * 15/10/2024
*/
public class UsuarioDto {
	
	//ATRIBUTOS
	private long idUsuario;
	private String nombreUsuario;
	private String emailUsuario;
	private String contrasenaUsuario;
	private String descripcionUsuario;
	private String enlaceImagen;
	
	//CONSTRUCTOR
	public UsuarioDto(long idUsuario, String nombreUsuario, String emailUsuario, String contrasenaUsuario,
			String descripcionUsuario, String enlaceImagen) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.emailUsuario = emailUsuario;
		this.contrasenaUsuario = contrasenaUsuario;
		this.descripcionUsuario = descripcionUsuario;
		this.enlaceImagen = enlaceImagen;
	}
	
	//GETTERS Y SETTERS
	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
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
	
	
}