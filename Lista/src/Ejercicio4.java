import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listaArray=new ArrayList<String>();
		LinkedList<String> listaLinked=new LinkedList<String>();
		listaArray.add("este");
		listaArray.add("este");
		listaArray.add("bajo");
		listaLinked.add("este");
		listaLinked.add("este");
		listaLinked.add("bajo");
		Leer.mensaje("Valores de objLinkedList: "+listaLinked.toString());
		Leer.mensaje("Valores de objArrayList: "+listaArray.toString());
	}

}
