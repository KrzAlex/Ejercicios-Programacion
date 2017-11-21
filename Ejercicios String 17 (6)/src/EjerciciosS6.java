import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS6 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.println("Inroduzca una frase");
		String texto=teclado.nextLine();
		System.out.println("Ahora se estan sustituyendo todos los \"si\" por un \"no\"");
		Thread.sleep(1000);
		texto=texto.toLowerCase();
		texto=texto.replaceAll("si", "no");
		System.out.println(texto);
	}

}
