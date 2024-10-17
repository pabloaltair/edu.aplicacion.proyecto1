package dto;

import java.security.Identity;
import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

/**
 * Atributos del Pago
 * @author prosdez
 * 17/10/2024
*/

public class PagoDto {
	//ATRIBUTOS
	private long idPago;
	private String nombrePago;
	private double importePago;
	private String descripcionPago;
	private long idUsuario;

	
	
	//CONSTRUCTOR
	public PagoDto(long idPago, String nombrePago, double importePago, String descripcionPago, long idUsuario) {
		super();
		this.idPago = idPago;
		this.nombrePago = nombrePago;
		this.importePago = importePago;
		this.descripcionPago = descripcionPago;
		this.idUsuario = idUsuario;
	}


	//GETTERS Y SETTERS
	public long getIdPago() {
		return idPago;
	}

	public void setIdPago(long idPago) {
		this.idPago = idPago;
	}

	public String getNombrePago() {
		return nombrePago;
	}

	public void setNombrePago(String nombrePago) {
		this.nombrePago = nombrePago;
	}

	public double getImportePago() {
		return importePago;
	}

	public void setImportePago(double importePago) {
		this.importePago = importePago;
	}

	public String getDescripcionPago() {
		return descripcionPago;
	}

	public void setDescripcionPago(String descripcionPago) {
		this.descripcionPago = descripcionPago;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
	
}
