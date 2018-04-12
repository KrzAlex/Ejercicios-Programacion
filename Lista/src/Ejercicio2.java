import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> listaHashSet = new HashSet<String>();
		LinkedHashSet<String> listaLinkedHashSet = new LinkedHashSet<String>();
		TreeSet<String> listaTreeSet = new TreeSet<String>();
		String palabras[]={"este" , "montaña" , "letra" , "bajo" , "frio" , "piojo" , "nube" , "aleatorio"};
		
		Integer NumAleat = 0;
		String numerosHashSet = "";
		String numerosLinkedHashSet = "";
		String numerosTreeSet = "";
		for (int i = 0; i < 8; i++) {
			NumAleat = (int) (Math.random() * 8);
			listaHashSet.add(palabras[NumAleat]);
			numerosHashSet = numerosHashSet + NumAleat + " * ";

			NumAleat = (int) (Math.random() * 8);
			listaLinkedHashSet.add(palabras[NumAleat]);
			numerosLinkedHashSet = numerosLinkedHashSet + NumAleat + " * ";

			NumAleat = (int) (Math.random() * 8);
			listaTreeSet.add(palabras[NumAleat]);
			numerosTreeSet = numerosTreeSet + NumAleat + " * ";
		}
		

		Leer.mensaje("Valores de HashSet: " + listaHashSet.toString());
		Leer.mensaje("Valores de LinkedHashSet: " + listaLinkedHashSet.toString());
		Leer.mensaje("Valores de TreeSet: " + listaTreeSet.toString());
	}

}
