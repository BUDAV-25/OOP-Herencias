package Escuela;

import java.util.ArrayList;

//Clase de los Cursos
class Cursos{
	private String Nombre;
	private int recuentoClases;
	private int recuentoEjercicios;
	
	public Cursos(String nombre, int recuentoClases, int recuentoEjercicios) {
		this.Nombre = nombre;
		this.recuentoClases = recuentoClases;
		this.recuentoEjercicios = recuentoEjercicios;
	}
	public String getNombre() {
		return Nombre;
	}
	public int getRecuentoClases() {
		return recuentoClases;
	}
	public int getRecuentoEjercicios() {
		return recuentoEjercicios;
	}
}

//Clase de Clase "Clase de Clase jajaja", O sea donde est[an los estudiantes y profesores
class Clase {
	private String Identificador;
	private ArrayList<String> Estudiantes = new ArrayList<>();
	private ArrayList<String> Profesores = new ArrayList<>();
	
	public Clase(String identificador, ArrayList<String> estudiantes, ArrayList<String> profesores) {
		super();
		this.Identificador = identificador;
		this.Estudiantes = estudiantes;
		this.Profesores = profesores;
	}
	
	public String getIdentificador() {
		return Identificador;
	}
	public ArrayList<String> getEstudiantes(){
		return Estudiantes;
	}
	public ArrayList<String> getProfesores(){
		return Profesores;
	}
}