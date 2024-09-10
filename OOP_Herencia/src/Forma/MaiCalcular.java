package Forma;

public class MaiCalcular {

	//Main para probar
	public static void main(String[] args) {
		
		//Arreglo de las formas "Para probar"
		Shape[] Prueba = new Shape[] {
				new Triangle(7,5), //Triangulo de Ancho 7 y Alto 5
				new Circle(10), 	//Circulo de radio 10
				new Rectangle(15,10), //Rectangulo de Ancho 15 y Alto 10
				new Triangle(8,9),	//Triangulo de Ancho 8 y Alto 9
				new Rectangle(12,9) //Rectangulo de Ancho 12 y Alto 9
		};
		
		//Arreglo para almacenar las superficies
		double[] Areas = new double[Prueba.length];
		
		//Un for para calcular cada forma
		for(int i=0; i<Prueba.length; i++) {
			Areas[i] = Prueba[i].calculateSurface();
			System.out.println("Area de la forma " +(i+1)+": "+ + Areas[i]);
		}
	}

}
