/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio5A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0;
		int sumaimpares=0;
		do {
			if (contador%2!=0) {
				System.out.println(contador);
				sumaimpares=sumaimpares+1;
			}
			contador++;
		} while (contador<=100);
		System.out.println("La suma de impares será"+" "+sumaimpares);
		
	}

}
