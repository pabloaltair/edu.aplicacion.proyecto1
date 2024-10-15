package dto;

public class MotosDto {

	//ATRIBUTOS
	private long idMoto;
	private long id_propietario;
	private String nombreMoto;
	private String marcaMoto;
	private String modeloMoto;
	private String descripcionMoto;
	private String enlaceImagen;
	
	//CONSTRUCTOR
	public MotosDto(long idMoto, long id_propietario, String nombreMoto, String marcaMoto, String modeloMoto,
			String descripcionMoto, String enlaceImagen) {
		super();
		this.idMoto = idMoto;
		this.id_propietario = id_propietario;
		this.nombreMoto = nombreMoto;
		this.marcaMoto = marcaMoto;
		this.modeloMoto = modeloMoto;
		this.descripcionMoto = descripcionMoto;
		this.enlaceImagen = enlaceImagen;
	}
	//GETTERS AND SETTERS
	public long getIdMoto() {
		return idMoto;
	}
	public void setIdMoto(long idMoto) {
		this.idMoto = idMoto;
	}
	public long getId_propietario() {
		return id_propietario;
	}
	public void setId_propietario(long id_propietario) {
		this.id_propietario = id_propietario;
	}
	public String getNombreMoto() {
		return nombreMoto;
	}
	public void setNombreMoto(String nombreMoto) {
		this.nombreMoto = nombreMoto;
	}
	public String getMarcaMoto() {
		return marcaMoto;
	}
	public void setMarcaMoto(String marcaMoto) {
		this.marcaMoto = marcaMoto;
	}
	public String getModeloMoto() {
		return modeloMoto;
	}
	public void setModeloMoto(String modeloMoto) {
		this.modeloMoto = modeloMoto;
	}
	public String getDescripcionMoto() {
		return descripcionMoto;
	}
	public void setDescripcionMoto(String descripcionMoto) {
		this.descripcionMoto = descripcionMoto;
	}
	public String getEnlaceImagen() {
		return enlaceImagen;
	}
	public void setEnlaceImagen(String enlaceImagen) {
		this.enlaceImagen = enlaceImagen;
	}
	
}
