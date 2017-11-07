import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int a=teclado.nextInt();
		if (a % 2 ==0) {
			System.out.println("El " + a + " es par");
		}
		if (a % 2 !=0) {
			System.out.println("El " + a + " es impar");
		}
	}
}
