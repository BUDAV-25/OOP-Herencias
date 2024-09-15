package CalcularSalario;

public class ProbarEmpleados {

	public static void main(String[] args) {
		
		EmpleadoAsalariado PrimerEmpleadoAsalariado = new EmpleadoAsalariado("Benny","Del Amparo","20041025");
		PrimerEmpleadoAsalariado.setSalarioSemanal(50000);
		
		System.out.println("Empleado Asalariado: "+PrimerEmpleadoAsalariado.calcularSalario());
		
		EmpleadoPorHora PrimerEmpleadoPorHora = new EmpleadoPorHora("Randy","Acevedo","20001216");
		PrimerEmpleadoPorHora.setSalario(1500);
		PrimerEmpleadoPorHora.setHorasTrabajadas(39);
		
		System.out.println("Empleado por hora: "+PrimerEmpleadoPorHora.calcularSalario());
		
		EmpleadoPorHora SegundoEmpleadoPorHora = new EmpleadoPorHora("Benjamin","Tennison","20001010");
		SegundoEmpleadoPorHora.setSalario(1500);
		SegundoEmpleadoPorHora.setHorasTrabajadas(45);
		
		System.out.println("Empleado por horas extras: "+SegundoEmpleadoPorHora.calcularSalario());

		EmpleadoPorComision PrimerEmpleadoPorComision = new EmpleadoPorComision("Esteubin","Medrano","20070130");
		PrimerEmpleadoPorComision.setVentasBrutas(60000);
		PrimerEmpleadoPorComision.setTarifaComision(70);
		
		System.out.println("Empleado por comision: "+PrimerEmpleadoPorComision.calcularSalario());
		
		EmpleadoBaseMasComision PrimerEmpleadoBaseMasComision = new EmpleadoBaseMasComision("Jefferson","De Leon","20040215");
		PrimerEmpleadoBaseMasComision.setTarifaComision(10);
		PrimerEmpleadoBaseMasComision.setVentasBrutas(60000);
		PrimerEmpleadoBaseMasComision.setSalarioBase(40000);
		
		System.out.println("Empleado asalariado mas comision(10%): "+PrimerEmpleadoBaseMasComision.calcularSalario());
	}

}
