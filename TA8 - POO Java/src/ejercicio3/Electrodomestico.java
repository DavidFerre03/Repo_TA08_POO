package ejercicio3;

public class Electrodomestico {
	//------------------------------------------------Posiblement canviar de private a protected
	//Atributos
	private int precio_base= 100; //Precio expresado en €
	private String color="blanco"; //Colores disponibles: blanco, negro, rojo, azul y gris
	private char consumo_energetico='F'; //Valores A y F
	private int peso= 5; //Peso expresado en Kg
	
	/*
	 * Constructor por defecto
	 */
	public Electrodomestico() {
		
	}
	
	/*
	 * Constructor con los parametros precio y peso. El resto de parametros van por defecto
	 * @ precio
	 * @ peso
	 */
	public Electrodomestico(int precio_base, int peso) {
		this.precio_base=precio_base;
		this.peso=peso;		
	}
	
	/*
	 * Constructor con todos los atributos
	 * @param precio_base
	 * @param color
	 * @param consumo_energetico
	 * @param peso
	 */
	public Electrodomestico(int precio_base, String color, char consumo_energetico, int peso) {
		this.precio_base=precio_base;
		this.color=color;
		this.consumo_energetico=consumo_energetico;
		this.peso=peso;
	}
	
	
	
	
	
	
}
