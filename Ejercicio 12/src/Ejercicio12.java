/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejecicio 12");
		int ubi=1;
		int par=0;
		int imp=0;
		while (ubi <=100) {
			System.out.println(ubi);
			if (ubi % 2 ==0) {
				par = par + ubi;
			} else {
				imp = imp + ubi;
			}
			ubi++;
		}
		System.out.println("La suma de todos los numeros pares son " + par);
		System.out.println("la suma de todos los numeros impares son " + imp);
	}

}
