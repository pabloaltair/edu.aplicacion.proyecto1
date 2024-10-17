package dto;

/**
 * Atributos del Club
 * @author prosdez
 * 15/10/2024
*/
public class ClubDto {
	
	//ATRIBUTOS
	private long idClub;
	private String nombreClub = "aaaaa";
	private String contrasenaClub = "aaaaa";
	private String descripcionClub = "aaaaaa";
	private String enlaceImagen = "aaaaaa";
	private boolean esPrivado;
	
	//CONSTRUCTOR
	public ClubDto(long idClub, String nombreClub, String contrasenaClub, String descripcionClub, String enlaceImagen,
			boolean esPrivado) {
		super();
		this.idClub = idClub;
		this.nombreClub = nombreClub;
		this.contrasenaClub = contrasenaClub;
		this.descripcionClub = descripcionClub;
		this.enlaceImagen = enlaceImagen;
		this.esPrivado = esPrivado;
	}
	
	//GETTERS Y SETTERS
	public long getIdClub() {
		return idClub;
	}
	public void setIdClub(long idClub) {
		this.idClub = idClub;
	}
	public String getNombreClub() {
		return nombreClub;
	}
	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}
	public String getContrasenaClub() {
		return contrasenaClub;
	}
	public void setContrasenaClub(String contrasenaClub) {
		this.contrasenaClub = contrasenaClub;
	}
	public String getDescripcionClub() {
		return descripcionClub;
	}
	public void setDescripcionClub(String descripcionClub) {
		this.descripcionClub = descripcionClub;
	}
	public String getEnlaceImagen() {
		return enlaceImagen;
	}
	public void setEnlaceImagen(String enlaceImagen) {
		this.enlaceImagen = enlaceImagen;
	}
	public boolean EsPrivado() {
		return esPrivado;
	}
	public void setEsPrivado(boolean esPrivado) {
		this.esPrivado = esPrivado;
	}
}
	