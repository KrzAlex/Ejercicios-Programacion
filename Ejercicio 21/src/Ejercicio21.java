/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejercicio 21");
		int pos=1; int par=0; int imp=0;
		while (pos <=1000) {
			switch (pos % 2 ) {
			case 0:
				par ++;
				break;
				
			default:
				imp ++;
				break;
			} 
		pos ++;
		}
		System.out.println("Hay "+ par + " numeros pares");
		System.out.println("Hay "+ imp + " numeros impares");
	}

}
