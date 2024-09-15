package CalcularSalarioDocentes;

public class ProbandoDocentes {

	public static void main(String[] args) {
		
		DocentePorHora DocenteHoras = new DocentePorHora("Benny","Del Amparo","2004102520231525",39);
		System.out.println("Informacion del empleado por hora: "); DocenteHoras.InformacionEmpleado();
		
		DocenteContratoFijo DocenteFijo = new DocenteContratoFijo("Esteubin","Medrano","2007013020250101",15000, true);
		System.out.println("Informacion del empleado por hora: ");DocenteFijo.InformacionEmpleado();
		
		EmpleadoAdministrativo EmpleadoAdministrativo = new EmpleadoAdministrativo("Randy","Acevedo","2000121620231414",15000, false);
		System.out.println("Informacion del empleado por hora: "); EmpleadoAdministrativo.InformacionEmpleado();
	}

}
