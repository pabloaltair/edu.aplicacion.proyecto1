package dto;
import java.time.LocalDate;


/**
 * Atributos del Alumno
 * @author prosdez
 * 26/09/2024
*/
public class AlumnoDto {
	//ATRIBUTOS
	private String nombreAlumno;
	private String apellidosAlumno;
	private String dniAlumno;
	private LocalDate fechaNacimientoAlumno;
	private String gmailAlumno;
	private int telefonoAlumno;
	
	//CONSTRUCTOR
	public AlumnoDto(String nombreAlumno, String apellidosAlumno, String dniAlumno, LocalDate fechaNacimientoAlumno, String gmailAlumno, int telefonoAlumno) {
		this.nombreAlumno = nombreAlumno;
		this.apellidosAlumno = apellidosAlumno;
		this.dniAlumno = dniAlumno;
		this.fechaNacimientoAlumno = fechaNacimientoAlumno;
		this.gmailAlumno = gmailAlumno;
		this.telefonoAlumno=telefonoAlumno;
	}
	
	//GETTERS
	public String getNombreAlumno() {
		return this.nombreAlumno;
	}
	public String getApellidosAlumno() {
		return this.apellidosAlumno;
	}
	public String getDniAlumno() {
		return this.dniAlumno;
	}
	public LocalDate geFechaNacimiento() {
		return this.fechaNacimientoAlumno;
	}
	public String getGmailAlumno() {
		return this.gmailAlumno;
	}
	public int getTelefonoAlumno() {
		return this.telefonoAlumno;
	}
	
	//SETTERS
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public void setApellidosAlumno(String apellidosAlumno) {
		this.apellidosAlumno = apellidosAlumno;
	}
	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}
	public void setfechaNacimientoAlumno(LocalDate fechaNacimientoAlumno) {
		this.fechaNacimientoAlumno = fechaNacimientoAlumno;
	}
	public void setGmailAlumno(String gmailAlumno) {
		this.gmailAlumno = gmailAlumno;
	}
	public void setTelefonoAlumno(int telefonoAlumno) {
		this.telefonoAlumno = telefonoAlumno;
	}
}

