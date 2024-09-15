package CalcularSalarioDocentes;

public abstract class Empleados_Docente {
	
	protected String primerNombre;
	protected String apellidoPaterno;
	protected String NSS;
	protected double SalarioBaseSemanal;
	
	public Empleados_Docente(String primerNombre, String apellidoPaterno, String nSS, double salarioBaseSemanal) {
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.NSS = nSS;
		this.SalarioBaseSemanal = salarioBaseSemanal;
	}
	
	public abstract double calcularSalario();
	
	public void InformacionEmpleado() {
		System.out.println(primerNombre+ " " + apellidoPaterno + ", " + NSS + ", " + "Salario al mes: " + calcularSalario());
		System.out.println("");
	}
}
