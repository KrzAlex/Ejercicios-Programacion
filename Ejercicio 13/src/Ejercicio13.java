/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejecicio 13");
		int ubi=1; int temp2=0; int temp3=0; int cont2=0; int cont3=0;
		while (ubi <= 100) {
			temp2 ++;
			temp3 ++;
			if (temp2 == 2) {
				cont2 ++;
				temp2 =0;
				System.out.println("el numero " + ubi + " es multiplo de 2");
			}
			if (temp3==3) {
				cont3 ++;
				temp3 =0;
				System.out.println("el numero " + ubi + " es multiplo de 3");
			}
			ubi ++;
		}
		System.out.println("hay "+cont2 + " numeros multiplos de 2");
		System.out.println("hay "+cont3 + " numeros multiplos de 3");
	}

}
