package CalcularSalario;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{

	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String nSS) {
		super(primerNombre, apellidoPaterno, nSS);
	}
	
	double PagoEmpleado = 0;
	double salarioBase = 0;
	
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	double calcularSalario() {
		PagoEmpleado = salarioBase + super.calcularSalario();
		return PagoEmpleado;
	}
}
