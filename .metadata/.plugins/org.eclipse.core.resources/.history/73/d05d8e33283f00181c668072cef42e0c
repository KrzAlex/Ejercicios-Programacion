import java.util.Iterator;
import java.util.TreeMap;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Double, String> boletin=new TreeMap<>();
		String texto="";
		double numero=0;
		
		while(!texto.equals("*")){
			texto=Leer.pedirCadena("Introduce el apellidos del alumno");
			if (texto.equals("*")) {
				break;
			}
			numero=Leer.pedirEntero("Introduce la nota del alumno: "+texto);
			while (numero<0||numero>10) {
				numero=Leer.pedirEntero("Vuelvea introducir la nota del alumno: "+texto);
			}
			boletin.put(numero,texto);
		}
		Leer.mensaje(boletin.toString());
		Iterator<String> itr=boletin.iterator();
	}

}
