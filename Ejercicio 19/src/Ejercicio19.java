import java.util.Scanner;

/**
 * 
 */

/**
 * @author ALEX
 *
 */
public class Ejercicio19 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ejercicio 19");
		System.out.println("Introduce:");
		System.out.println("Hora");
		int hora=teclado.nextInt();
		System.out.println("Minutos");
		int min=teclado.nextInt();
		System.out.println("Segundos");
		int sec=teclado.nextInt();
		while (hora<25) {
			System.out.println(hora + "/" + min + "/" + sec);
			sec ++;
			if (sec == 60) {
				min ++;
				sec = 0;
			}
			if (min == 60) {
				hora ++;
				min =0;
			}
			if (hora == 24) {
				hora = 0;
			}
			Thread.sleep(1000);
		}
	}

}
