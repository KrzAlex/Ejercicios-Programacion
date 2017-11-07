import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		float a = (float) teclado.nextInt();
		if (a < 0) {
			System.out.println("El número "+ a +" es negativo");
		}
		if (a >= 0) {
			System.out.println("El número "+ a +" es positivo");
		}
	}

}
