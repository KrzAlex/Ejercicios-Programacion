import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		String texto=teclado.nextLine();
		int comodin=0; 
		while  (comodin <1){
			if (texto.length()>80) {
				System.out.println("Por favor , Introduzca un texto de menos de 80 caracteres");
				texto=teclado.nextLine();
			}
			if (texto.length()<80) {
				comodin=1;
			}
		}
		int comodinVocales=0;
		int comodinConsonantes=0;
		int comodinumeros=0;
		for (int i = 0; i < texto.length()-1; i++) {
			if ("AEIOUaeiou����������".indexOf(texto.substring(i, i+1))!=-1){
				comodinVocales++;
			}
			if ("QWRTYPSDFGHJKL�ZXCVBNMqwrtypsdfghjkl�zxcvbnm".indexOf(texto.substring(i, i+1))!=-1){
				comodinConsonantes++;
			}

			if ("1234567890".indexOf(texto.substring(i, i+1))!=-1){
				comodinumeros++;
			}
		}
		System.out.println("Hay "+comodinConsonantes+" Consolantes, "+comodinVocales+" Vocales y"+comodinumeros+" Numeros, En la frase");
	}

}
