package dto;

/**
 * Atributos del Evento
 * @author prosdez
 * 17/10/2024
*/
public class EventoDto {
	private long idEvento;
	private String nombreEvento;
	private String descripcionEvento;
	private Boolean esPrivado;
	private double precioEvento;
	private String contrasenaEvento;
	
	//CONSTRUCTOR
	public EventoDto(long idEvento, String nombreEvento, String descripcionEvento, Boolean esPrivado,
			double precioEvento, String contrasenaEvento) {
		super();
		this.idEvento = idEvento;
		this.nombreEvento = nombreEvento;
		this.descripcionEvento = descripcionEvento;
		this.esPrivado = esPrivado;
		this.precioEvento = precioEvento;
		this.contrasenaEvento = contrasenaEvento;
	}
	
	//GETTERS Y SETTERS
	public long getIdEvento() {
		return idEvento;
	}
	
	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public String getDescripcionEvento() {
		return descripcionEvento;
	}

	public void setDescripcionEvento(String descripcionEvento) {
		this.descripcionEvento = descripcionEvento;
	}

	public Boolean getEsPrivado() {
		return esPrivado;
	}

	public void setEsPrivado(Boolean esPrivado) {
		this.esPrivado = esPrivado;
	}

	public double getPrecioEvento() {
		return precioEvento;
	}

	public void setPrecioEvento(double precioEvento) {
		this.precioEvento = precioEvento;
	}

	public String getContrasenaEvento() {
		return contrasenaEvento;
	}

	public void setContrasenaEvento(String contrasenaEvento) {
		this.contrasenaEvento = contrasenaEvento;
	}
	
}
