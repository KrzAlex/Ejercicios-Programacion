/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][]= new int[4][5];
		for (int fil = 0; fil < matriz.length; fil++) {
			for (int co = 0; co < matriz[0].length; co++) {
				matriz[fil][co]= (int) (Math.random()*100)+1;
				System.out.print(matriz[fil][co] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int co = 0; co < matriz[0].length; co++) {
			for (int fi = 0; fi < matriz.length; fi++) {
				System.out.print(matriz[fi][co] + "\t");
			}
			System.out.println();
		}
	}

}
