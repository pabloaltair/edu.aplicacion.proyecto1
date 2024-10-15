package dto;

public class SedeDto {
	
	//ATRIBUTOS
	private long idSede;
	private String nombreSede;
	private String descripcionSede;
	private String localizacionSede;
	
	//CONSTRUCTOR
	public SedeDto(long idSede, String nombreSede, String descripcionSede, String localizacionSede) {
		super();
		this.idSede = idSede;
		this.nombreSede = nombreSede;
		this.descripcionSede = descripcionSede;
		this.localizacionSede = localizacionSede;
	}
	//GETTERS AND SETTERS
	public long getIdSede() {
		return idSede;
	}
	public void setIdSede(long idSede) {
		this.idSede = idSede;
	}
	public String getNombreSede() {
		return nombreSede;
	}
	public void setNombreSede(String nombreSede) {
		this.nombreSede = nombreSede;
	}
	public String getDescripcionSede() {
		return descripcionSede;
	}
	public void setDescripcionSede(String descripcionSede) {
		this.descripcionSede = descripcionSede;
	}
	public String getLocalizacionSede() {
		return localizacionSede;
	}
	public void setLocalizacionSede(String localizacionSede) {
		this.localizacionSede = localizacionSede;
	}
	
}
