/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejercicio 29");
		int dado1= (int) (Math.random()*6)+1;int dado2= (int) (Math.random()*6)+1;
		int num10=0; int suma=0;int rep=0;
		while (rep <= 100) {
			suma = dado1 + dado2;
			if (suma == 10) {
				num10++;
			}
			suma =0;
			dado1= (int) (Math.random()*6)+1;
			dado2= (int) (Math.random()*6)+1;
			rep++;
		}
		System.out.println("Las veces que la suma de los dados a sido 10, ha sido: "+ num10);
	}

}
