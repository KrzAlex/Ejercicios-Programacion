import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejecicio 11");
		Scanner teclado = new Scanner(System.in);
		int x=teclado.nextInt();
		int a=1; //Ubicacion
		int b=3; //Temporizador para averiguar los multiplos de 3
		int c=0; //Contador de M�ltiplos
		while (a<=x) {
			b--;
			if (b==0) {
				System.out.println(a);
				c++;
				b=3;
			}
			a++;
		}
		System.out.println("hay " + c + " numeros que son multiplos de tres");
	}

}
