import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ejercicio 31");
		int x1= teclado.nextInt();
		int x2= teclado.nextInt();
		int comodin=0;
		int x3 =0;
		int suma=0, resta=0, multiplicacion=0, dividir=0;
		while (comodin<1) {
			if (x2 > x1) {
				System.out.println("Por favor, el primer numero debe ser mayor que el segundo");
				x1= teclado.nextInt();
				x2= teclado.nextInt();
			}
			if (x2 < x1) {
				comodin++;
			}
		}
		System.out.println("Pulse 1 para sumar");
		System.out.println("Pulse 2 para restar");
		System.out.println("Pulse 3 para multiplicar");
		if (x2 !=0) {
			System.out.println("Pulse 4 para dividir");
		}
		x3= teclado.nextInt();
		comodin=0;
		switch (x3 + comodin) {
		case 1:
			comodin= x1 +x2;
			System.out.println(x1 + "+" + x2 + "=" + comodin);
			break;
		case 2:
			comodin= x1 - x2;
			System.out.println(x1 + "-" + x2 + "=" + comodin);
			break;
		case 3:
			comodin= x1 * x2;
			System.out.println(x1 + "*" + x2 + "=" + comodin);
			break;
		case 4:
			comodin= x1 / x2;
			System.out.println(x1 + "/" + x2 + "=" + comodin);
			break;

		default:
			break;
		}
	}

}