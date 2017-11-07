import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ejercicio 24");
		int x1=teclado.nextInt();
		int cont=0; int a=2;
		while (a < x1) {
			if (x1 % a ==0) {
				cont++;
			}
		a++;
		}
		if (cont ==0) {
			System.out.println("El " + x1 + " es primo");
		}else{
			System.out.println("El " + x1 + " no es primo");
		}
	}

}
