import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS2 {

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
		int comodinM=0;
		int comodinm=0;
		for (int i = 0; i < texto.length()-1; i++) {
			if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ�".indexOf(texto.substring(i, i+1))!=-1){
				comodinM++;
			}
			if ("qwertyuiopasdfghjkl�zxcvbnm".indexOf(texto.substring(i, i+1))!=-1){
				comodinm++;
			}
		}
		System.out.println("Hay "+comodinm+" Minusculas, y "+comodinM+" Mayusculas");
		
		
		
	}

}
