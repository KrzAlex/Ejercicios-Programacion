import java.util.Scanner;

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
		Scanner teclado = new Scanner(System.in);
		String mitexto=" ";
		int a = 1 ;
		while (a > 0) {
			mitexto=teclado.nextLine();
			if (mitexto.equals("S") || mitexto.equals("N")) {
				System.out.println("Gracias");
				a --;
			}else{
				System.out.println("Introduce una S o una N por favor");
			}
			
		}
		
	}

}
