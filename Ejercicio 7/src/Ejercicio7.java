import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejercicio 7");
		Scanner teclado = new Scanner(System.in);
		String mitexto=" ";
		byte a =-1;
		while (!mitexto.equals("")) {
			mitexto=teclado.nextLine();
			a ++;
		}
		System.out.println("el numero de lineas es " + a);
	}
}
