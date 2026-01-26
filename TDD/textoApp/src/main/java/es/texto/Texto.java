package es.texto;
/* #########################
 * #  Notas rápidas para que el alumnado haga TDD “bien”
 * #################
    - Empieza implementando constructores + getters + longitud().
    - Luego anadirFinal(char) y anadirInicio(char).
    - Después anadirFinal(String) y anadirInicio(String) con regla “todo o nada” (si no cabe, no modifica).
    - Finalmente contarVocales().
 */
/**
 * Diseñar la clase Texto que gestione una cadena de caracteres:

La longitud máxima se especifica en el constructor.
Permite añadir un carácter al principio o al final si hay espacio disponible.
Permite añadir una cadena al principio o al final sin rebasar el tamaño máximo.
Debe poder indicar cuántas vocales (mayúsculas y minúsculas) contiene el texto.
 */
public class Texto {

	private int maxLongitud;
	private String contenido;
	
	public Texto(int maxLongitud) {
		if(maxLongitud<=0)
			throw new IllegalArgumentException("maxLongitud debe ser > 0");
		this.maxLongitud = maxLongitud;
		this.contenido = "";
	}


	public Texto(String contenido, int maxLongitud) {
		if (contenido == null)
			throw new IllegalArgumentException("contenidoInicial no puede ser null");
		if (maxLongitud <= 0)
			throw new IllegalArgumentException("maxLongitud debe ser > 0");
		if (contenido.length() > maxLongitud)
			throw new IllegalArgumentException("contenidoInicial supera maxLongitud");
		
		this.maxLongitud = maxLongitud;
		this.contenido = contenido;
	}


	public String getContenido() {
		return contenido;
	}


	public int longitud() {
		return contenido.length();
	}
	
	public boolean anadirFinal(char caracter) {
		if (maxLongitud - contenido.length() > 0) {
			contenido += caracter;
			return true;
		}
		return false;
	}
	
	public boolean anadirInicio(char caracter) {
		if (maxLongitud - contenido.length() > 0) {
			contenido = caracter + contenido;
			return true;
		}
		return false;
	}
	
	public boolean anadirFinal(String cadena) {
		if (cadena == null) {
			throw new IllegalArgumentException("cadena no puede ser null");
		}
		if (maxLongitud - contenido.length() >= cadena.length()) {
			contenido += cadena;
			return true;
		}
		return false;
	}
	
	public boolean anadirInicio(String cadena) {
		if (cadena == null) {
			throw new IllegalArgumentException("cadena no puede ser null");
		}
		if (maxLongitud - contenido.length() >= cadena.length()) {
			contenido = cadena + contenido;
			return true;
		}
		return false;
	}
	
	public int contarVocales() {
		int contador = 0;
		char[] vocales =  {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', 'Á', 'É', 'Í', 'Ó', 'Ú'};
		for (int i = 0; i < contenido.length(); i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (contenido.charAt(i) == vocales[j]) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public String toString() {
		return contenido;
	}
}

