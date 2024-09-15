package CalcularSalarioDocentes;

public class DocentePorHora extends Empleados_Docente {
	
	private int HorasSemanalesTrabajadas;
	private final double TarifaPorHoras = 800;
	
	public DocentePorHora(String primerNombre, String apellidoPaterno, String nSS, int horasSemanalesTrabajadas) {
		super(primerNombre, apellidoPaterno, nSS,0);
		
		this.HorasSemanalesTrabajadas = horasSemanalesTrabajadas;
	}
	
	@Override
	public double calcularSalario() {
		return (HorasSemanalesTrabajadas*TarifaPorHoras)*4;
	}
	
}
