package ejercicio1;

public class Persona {
	//Atributos con valor por defecto EXCEPTO el DNI
	private String nombre="";
	private int edad=0;
	private String DNI;
	private char sexo='H';
	private int peso=0;
	private int altura=0;
	
	/*
	 * Constructor por defecto
	 */
	public Persona() {
		
	}
	
	/*
	 * Constructor con nombre, edad y sexo, el resto por defecto
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, int edad, char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;		
	}
	
	/*
	 * Constructor con todos los atributos por parametro
	 * @param nombre
	 * @param DNI
	 * @param sexo
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, String DNI, char sexo, int peso, int altura) {
		this.nombre=nombre;
		this.DNI=DNI;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}	
	
}
