import java.util.TreeSet;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> listanumero=new TreeSet<Integer>();
		Integer numero=0;
		while (numero!=-9999) {
			numero=Leer.pedirEntero("Introduce un numero");
			listanumero.add(numero);
		}
		listanumero.remove(-9999);
		Leer.mensaje(listanumero.toString());
	}

}
