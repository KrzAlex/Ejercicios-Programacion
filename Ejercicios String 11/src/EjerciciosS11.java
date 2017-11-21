import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca un texto");
		String texto=teclado.nextLine();

		int comodin=0; 
		while  (texto.length()>20){
				System.out.println("Por favor , Introduzca un texto de menos de 20 caracteres");
				texto=teclado.nextLine();
		}
		
		System.out.println(texto);
		while (comodin < texto.length()) {
			texto= texto.substring((texto.length()-1))+texto.substring(0,(texto.length()-1));
			comodin++;
			System.out.println(texto);
		}
		
		
	}

}
