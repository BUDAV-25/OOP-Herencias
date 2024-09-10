package Forma;

//Clase padre abstracta para definir el ancho y alto de la figura
public abstract class Shape {
	
	protected double Ancho;
	protected double Alto;
	
	public Shape(double ancho, double alto) {
		this.Ancho = ancho;
		this.Alto = alto;
	}
	public abstract double calculateSurface();
}

//Clase hija que hereda de Shape y el metodo para calcular
class Triangle extends Shape{

	public Triangle(double ancho, double alto) {
		super(ancho, alto);
	}
	
	@Override
	public double calculateSurface(){
		return (Ancho*Alto)/2;
	}
}

//Clase hija que hereda de Shape y el metodo para calcular
class Rectangle extends Shape{

	public Rectangle(double ancho, double alto) {
		super(ancho, alto);
	}
	
	@Override
	public double calculateSurface(){
		return (Ancho*Alto);
	}
}

//Clase hija que hereda de Shape y el metodo para calcular
class Circle extends Shape{
	
	public Circle(double radio) {
		super(radio, radio); //ancho y alto son igual al radio
	}
	
	@Override
	public double calculateSurface() {
		return Math.PI * Ancho*Alto; // Área del círculo: π * r^2
	}
}

