package dto;
import java.time.LocalDate;


/**
 * Atributos del Usuario
 * @author prosdez
 * 03/10/2024
*/
public class UsuarioDto {
	//ATRIBUTOS
	private String nombreUsuario;
	private String apellidosUsuario;
	private String dniUsuario;
	private LocalDate fechaNacimientoUsuario;
	private String gmailUsuario;
	private int telefonoUsuario;
	
	//CONSTRUCTOR
	public UsuarioDto(String nombreUsuario, String apellidosUsuario, String dniUsuario, LocalDate fechaNacimientoUsuario, String gmailUsuario, int telefonoUsuario) {
		this.nombreUsuario = nombreUsuario;
		this.apellidosUsuario = apellidosUsuario;
		this.dniUsuario = dniUsuario;
		this.fechaNacimientoUsuario = fechaNacimientoUsuario;
		this.gmailUsuario = gmailUsuario;
		this.telefonoUsuario=telefonoUsuario;
	}
	
	//GETTERS
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}
	public String getApellidosUsuario() {
		return this.apellidosUsuario;
	}
	public String getDniUsuario() {
		return this.dniUsuario;
	}
	public LocalDate geFechaNacimientoUsuario() {
		return this.fechaNacimientoUsuario;
	}
	public String getGmailUsuario() {
		return this.gmailUsuario;
	}
	public int getTelefonoUsuario() {
		return this.telefonoUsuario;
	}
	
	//SETTERS
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}
	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}
	public void setfechaNacimientoUsuario(LocalDate fechaNacimientoUsuario) {
		this.fechaNacimientoUsuario = fechaNacimientoUsuario;
	}
	public void setGmailUsuario(String gmailUsuario) {
		this.gmailUsuario = gmailUsuario;
	}
	public void setTelefonoUsuario(int telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}
}

