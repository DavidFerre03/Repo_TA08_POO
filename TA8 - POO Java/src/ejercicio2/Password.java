package ejercicio2;

public class Password {
	int longitud=8;
	String contraseña;
	
	/*
	 * Constructor por defecto
	 */
	public Password() {
		
	}
	
	/*
	 * Constructor que le pasamos la longitud por parametro, y que genera una contraseña aleatoria
	 * @param longitud: Longitud de la contraseña
	 */
	public Password(int longitud) {
		this.longitud=longitud;
		String posibles_valores="QWERTYUIOPASDFGHJKLÑZXCVBNMqwertyuiopasdfghjklñzxcvbnm0123456789";
		char char_aleatorio;
		String aleatorio="";
		
		for(int i=0; i<this.longitud; i++) {
			char_aleatorio=posibles_valores.charAt(i);
			aleatorio= aleatorio + char_aleatorio;
			
		}
	}
}
