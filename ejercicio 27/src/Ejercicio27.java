import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ejercicio 27");
		int x1=teclado.nextInt();
		int b=0; int comodin=0;
		while (comodin <=10) {
			b = x1 * comodin;
			System.out.println(x1 + " * " + comodin + " = " +b);
			comodin++;
		}
	}

}
