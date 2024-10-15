package dto;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class PagoDto {
	//ATRIBUTOS
	private long idPago;
	private String nombrePago;
	private double importePago;
	private String descripcionPago;
	
	//CONSTRUCTOR
	public PagoDto(long idPago, String nombrePago, double importePago, String descripcionPago) {
		super();
		this.idPago = idPago;
		this.nombrePago = nombrePago;
		this.importePago = importePago;
		this.descripcionPago = descripcionPago;
	}
	//GETTERS AND SETTERS
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
}
