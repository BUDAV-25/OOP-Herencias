package CalcularSalario;

public class EmpleadoPorComision extends Empleado {

	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String nSS) {
		super(primerNombre, apellidoPaterno, nSS);
	}
	
	double Pago = 0;
	float tarifaComision = 0;
	float ventasBrutas = 0;

	public float getTarifaComision() {
		return tarifaComision;
	}
	public void setTarifaComision(float tarifaComision) {
		this.tarifaComision = tarifaComision;
	}

	public float getVentasBrutas() {
		return ventasBrutas;
	}
	public void setVentasBrutas(float ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}

	double calcularSalario() {
		Pago = ventasBrutas * (tarifaComision/100);
		return Pago;
	}
}
