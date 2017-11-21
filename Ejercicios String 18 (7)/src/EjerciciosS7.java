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
		String abecedario="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int matriz[]=new int[27];
		System.out.println("Introduzca un texto");
		String texto=teclado.nextLine();
		texto=texto.toUpperCase();
		int comodin=0; 
		int caracesp=0;
		for (int i = 0; i < texto.length(); i++) {
			if (abecedario.indexOf(texto.substring(i, i+1))!=-1) {
				comodin=abecedario.indexOf(texto.substring(i, i+1));
				matriz[comodin]=matriz[comodin]+1;
			}else{
				caracesp++;
			}
		}
		int mayor=0;
		int letraM=0;
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i]>mayor) {
				letraM=i;
				mayor=matriz[i];
			}
		}
		System.out.println("La letra que se ha repetid mas veces a sido "+abecedario.substring(letraM, letraM+1));
		System.out.println("Y se ha repetido " + mayor+" veces");
	}

}
