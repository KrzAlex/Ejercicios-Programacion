import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejecicio 17");
		Scanner teclado = new Scanner(System.in);
		int x1=teclado.nextInt();
		int x2=teclado.nextInt();
		int cont=0; int suma=0;
		while (x2 < x1) {
			System.out.println("Por favor, introduce primero un numero peque�o, y despues uno grande.");
			x1=teclado.nextInt();
			x2=teclado.nextInt();
		}
		while (x1 <= x2) {
			if (x1 % 2 ==0) {
				System.out.println(x1);
				cont ++;
				suma = suma + x1;
			}
		x1 ++;
		}
		System.out.println("Hay " + cont + " numeros pares");
		System.out.println(suma + " es la suma de multiplos de 2");
	}

}
