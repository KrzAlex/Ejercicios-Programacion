import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ejercicio 22");
		System.out.println("Introduce un texto");
		String texto = teclado.nextLine();
		String tab="\t"; int cont=1; 
		System.out.println("");
		System.out.println(texto);
		while (cont <=5) {
			System.out.println(tab + texto);
			tab = tab + "\t";
			cont++;
		}
	}

}