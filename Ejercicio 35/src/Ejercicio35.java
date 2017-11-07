import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ejercicio 35");
		int asignatura[]= new int[10];
		for (int i = 0; i < asignatura.length; i++) {
			asignatura[i] = teclado.nextInt();
		}
		System.out.println("Introduce la nota que desea buscar:");
		int nota=teclado.nextInt();
		for (int i = 0; i < asignatura.length; i++) {
			if (nota == asignatura[i]) {
				i = i+1;
				System.out.println("Es la asignatura " + i);
				i = i-1;
			}
		}
	}

}
