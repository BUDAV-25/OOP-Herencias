package CalcularSalario;

public class EmpleadoPorHora extends Empleado {
	
	public EmpleadoPorHora(String primerNombre, String apellidoPaterno, String nSS) {
		super(primerNombre, apellidoPaterno, nSS);
	}
	
	int horasBase = 40;
	int horasTrabajadas = 0;
	double Pago = 0;
	float porcentaje = 1.5f;
	double salario = 0;
	
	
	public int getHorasBase() {
		return horasBase;
	}
	public void setHorasBase(int horasBase) {
		this.horasBase = horasBase;
	}

	public float getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	double calcularSalario() {
		
		if(this.horasTrabajadas <= this.horasBase) {
			Pago = salario * horasTrabajadas;
		}
		if (this.horasTrabajadas > this.horasBase) {
			
			Pago = (salario * horasBase) + ((horasTrabajadas-horasBase)*salario*porcentaje);
		}
		
		return Pago;
	}
}
