import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un texto");
		String texto=teclado.nextLine();
		System.out.println("Introduce la palabra que desea buscar");
		String palabra=teclado.nextLine();
		int contador1=0;
		int comodin2=0;
		int n=0; //posici�n dela palabra a buscar
		while (n!=-1){
			n=texto.indexOf(palabra);
			if (n!=-1){
				comodin2=comodin2+n;
				contador1++;
				System.out.println("Est� en la posici�n "+(comodin2+contador1));

				texto= texto.substring(n+1);
			}
		}
		if (contador1==0){
			System.out.println("La palabra que buscas no esta");
		}	
	}
}
