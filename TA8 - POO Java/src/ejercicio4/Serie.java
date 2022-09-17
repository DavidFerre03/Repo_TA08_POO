package ejercicio4;

public class Serie {
	private String titulo;
	private int num_temporadas= 3;
	private boolean entregado= false;
	private String genero;
	private String creador;
	
	/*
	 * Constructor por defecto
	 */
	public Serie() {
		
	}
	
	/*
	 * Constructor con titulo y creador. El resto por defecto
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		this.titulo= titulo;
		this.creador=creador;
	}
	
	/*
	 * Constructor con todos los atributos, excepto entregado
	 * @param titulo
	 * @param num_temporadas
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int num_temporadas, String genero, String creador) {
		this.titulo= titulo;
		this.num_temporadas= num_temporadas;
		this.genero= genero;
		this.creador= creador;
	}
}
