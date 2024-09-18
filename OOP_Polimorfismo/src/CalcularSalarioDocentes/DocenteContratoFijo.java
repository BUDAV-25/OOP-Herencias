package CalcularSalarioDocentes;

public class DocenteContratoFijo extends Empleados_Docente {
	
	private boolean Meta;
	private double Pago;
	private double Bonificacion = 3000;
	
	public DocenteContratoFijo(String primerNombre, String apellidoPaterno, String nSS, double salarioBaseSemanal, boolean meta) {
		super(primerNombre, apellidoPaterno, nSS, salarioBaseSemanal);
		this.Meta = meta;
	}
	
	@Override
	public double calcularSalario(){
		if(Meta == true) {
			Pago = Bonificacion + (SalarioBaseSemanal*4);
		}
		else{
			Pago = (Bonificacion/2) + (SalarioBaseSemanal*4);
		}
		
		return Pago;
	}
}
