/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector1[]=new int[10];
		int vector2[]=new int[10];
		int vectorsuma[]=new int [10];
		
		for (int i = 0; i < vector1.length; i++) {
			vector1[i]=(int)(Math.random()*10)+1;
			vector2[i]=(int)(Math.random()*10)+1;
			vectorsuma[i]=vector1[i]+vector2[i];
		}
		
		
	}

}
