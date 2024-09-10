package Escuela;

import java.util.ArrayList;

//Clase padre abstracta Personas para heredar
abstract public class Personas {
	
	private String Nombre;
	private String Apellido;
	
	public Personas(String nombre, String apellido) {
		
		this.Nombre = nombre;
		this.Apellido = apellido;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getApellido() {
		return Apellido;
	}
}

//Clase hija Estudiante hereda de Personas
class Estudiante extends Personas{
	
	private String Matricula;
	
	public Estudiante(String nombre, String apellido, String matricula) {
		super(nombre, apellido);
		this.Matricula = matricula;
	}
	public String getMatricula() {
		return Matricula;
	}
}

//Clase hija Profesor hereda de Personas
class Profesor extends Personas{
	
	private ArrayList<String> Cursos = new ArrayList<>();

	public Profesor(String nombre, String apellido, ArrayList<String> cursos) {
		super(nombre, apellido);
		
		this.Cursos = cursos;	
	}
	public ArrayList<String> getCusos(){
		return Cursos;
	}
}