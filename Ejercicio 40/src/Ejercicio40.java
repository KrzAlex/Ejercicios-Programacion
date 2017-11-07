/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][][]= new int[3][4][5];
		int cont=1;
		for (int p = 0; p < matriz.length ; p++) {
			System.out.println("Pág " + (p + 1));
			for (int f = 0; f < matriz[0].length; f++) {
				for (int c = 0; c < matriz[0][0].length; c++) {
					matriz[p][f][c]=cont;
					cont ++;
					System.out.print(matriz[p][f][c] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
