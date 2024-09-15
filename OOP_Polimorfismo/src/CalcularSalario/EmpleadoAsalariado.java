package CalcularSalario;

class EmpleadoAsalariado extends Empleado{
	
	private float salarioSemanal;

	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String nSS) {
		super(primerNombre, apellidoPaterno, nSS);
	}
	
	public float getSalarioSemanal() {
		return salarioSemanal;
	}
	public void setSalarioSemanal(float salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	double calcularSalario(){
		return salarioSemanal;
	}
}
