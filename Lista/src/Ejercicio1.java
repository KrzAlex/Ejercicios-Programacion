import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> listaHashSet = new HashSet<Integer>();
		LinkedHashSet<Integer> listaLinkedHashSet = new LinkedHashSet<Integer>();
		TreeSet<Integer> listaTreeSet = new TreeSet<Integer>();
		Integer NumAleat = 0;
		String numerosHashSet = "";
		String numerosLinkedHashSet = "";
		String numerosTreeSet = "";
		for (int i = 0; i < 6; i++) {
			NumAleat = (int) (Math.random() * 15) + 1;
			listaHashSet.add(NumAleat);
			numerosHashSet = numerosHashSet + NumAleat + " * ";

			NumAleat = (int) (Math.random() * 15) + 1;
			listaLinkedHashSet.add(NumAleat);
			numerosLinkedHashSet = numerosLinkedHashSet + NumAleat + " * ";

			NumAleat = (int) (Math.random() * 15) + 1;
			listaTreeSet.add(NumAleat);
			numerosTreeSet = numerosTreeSet + NumAleat + " * ";
		}

		Leer.mensaje("Se van a generar 6 datos para la lista Linked \nInsertando:\n" + numerosHashSet);
		Leer.mensaje("");
		Leer.mensaje("Se van a generar 6 datos para la lista Array \nInsertando:\n" + numerosLinkedHashSet);
		Leer.mensaje("");
		Leer.mensaje("Se van a generar 6 datos para la lista Array \nInsertando:\n" + numerosTreeSet);
		Leer.mensaje("");
		String HashSetNum = "";
		for (Integer i : listaHashSet) {
			HashSetNum = HashSetNum + i + " ";
		}
		String LinkedHashSetNum = "";
		for (Integer i : listaLinkedHashSet) {
			LinkedHashSetNum = LinkedHashSetNum + i + " ";
		}
		String TreeSetNum = "";
		for (Integer i : listaTreeSet) {
			TreeSetNum = TreeSetNum + i + " ";
		}

		Leer.mensaje("Valores de HashSet:\n" + HashSetNum);
		Leer.mensaje("");
		Leer.mensaje("Valores de LinkedHashSet:\n" + LinkedHashSetNum);
		Leer.mensaje("");
		Leer.mensaje("Valores de TreeSet:\n" + TreeSetNum);
		Leer.mensaje("");

		Leer.mensaje("Valores de HashSet: " + listaHashSet.toString());
		Leer.mensaje("Valores de LinkedHashSet: " + listaLinkedHashSet.toString());
		Leer.mensaje("Valores de TreeSet: " + listaTreeSet.toString());

	}

}
