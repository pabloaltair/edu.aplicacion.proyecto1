package dto;

/**
 * Atributos de la Sede
 * @author prosdez
 * 17/10/2024
*/

public class SedeDto {
	
	//ATRIBUTOS
	private long idSede;
	private String nombreSede;
	private String descripcionSede;
	private String localizacionSede;
	private long idClub;
	
	//CONSTRUCTOR
	public SedeDto(long idSede, String nombreSede, String descripcionSede, String localizacionSede, long idClub) {
		super();
		this.idSede = idSede;
		this.nombreSede = nombreSede;
		this.descripcionSede = descripcionSede;
		this.localizacionSede = localizacionSede;
		this.idClub = idClub;
	}

	//GETTERS Y SETTERS
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

	public long getIdClub() {
		return idClub;
	}

	public void setIdClub(long idClub) {
		this.idClub = idClub;
	}
	
	
}
