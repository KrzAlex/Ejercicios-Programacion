import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ejercicio 32");
		int x = teclado.nextInt();
		int a =1; int cont=0;
		while (a < x) {
			if (x % a ==0) {
				cont++;
			}
		a++;
		}
		if (cont ==0) {
			System.out.println("El " + x + " es primo");
		}else{
			System.out.println("El " + x + " no es primo");
		}
		cont = 0;
		a = 0;
		System.out.println("Tabla de multiplicar");
		while (a <=10) {
			cont = x * a;
			System.out.println(x + "*" + a + "=" + cont);
			a++;
		}
	}

}
