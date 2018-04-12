import java.util.TreeSet;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> listaPalabras=new TreeSet<String>();
		String palabra="";
		while (!palabra.equals("*")) {
			palabra=Leer.pedirCadena("Introduce una palabra");
			listaPalabras.add(palabra);			
		}
		listaPalabras.remove("*");
		Integer num=0;
		while (num==0||num>listaPalabras.size()) {
			num=Leer.pedirEntero("Introduce cuantas palabras deseas imprimir");
		}
		Integer contador=0;
		for (String i : listaPalabras) {
			if (contador==num) {
				break;
			}
			Leer.mensaje(i);
			contador++;
		}
		
	}

}
