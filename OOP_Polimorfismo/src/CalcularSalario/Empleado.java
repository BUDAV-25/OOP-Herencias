package CalcularSalario;

public abstract class Empleado {
	
	private String primerNombre;
	private String apellidoPaterno;
	private String NSS;
	
	Empleado(String primerNombre, String apellidoPaterno, String nSS) {
		
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		NSS = nSS;
	}
	
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getNSS() {
		return NSS;
	}
	public void setNSS(String nSS) {
		NSS = nSS;
	}

	abstract double calcularSalario();
}
