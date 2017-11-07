import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		String texto=teclado.nextLine();
		int comodinMinusculas=0;
		int comodinMayusculas=0;
		int comodinumeros=0;
		for (int i = 0; i < texto.length()-1; i++) {
			if ("aeiouáéíúóaeiouqwrtypsdfghjklñzxcvbnm".indexOf(texto.substring(i, i+1))!=-1){
				comodinMinusculas++;
			}
			if ("AEIOUQWRTYPSDFGHJKLÑZXCVBNMÁÉÍÓÚ".indexOf(texto.substring(i, i+1))!=-1){
				comodinMayusculas++;
			}

			if ("1234567890".indexOf(texto.substring(i, i+1))!=-1){
				comodinumeros++;
			}
		}
		System.out.println("Hay "+comodinMayusculas+" Mayusculas, "+comodinMinusculas+" Minusculas y"+comodinumeros+" Numeros, En la frase");
	
	}

}
