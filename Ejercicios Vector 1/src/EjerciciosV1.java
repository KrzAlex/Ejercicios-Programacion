/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosV1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[]=new int [20];
		float media=0;
		int inferiores=0;
		int superiores=0;
		int iguales=0;
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*21)-10;
			media=media+vector[i];
		}
		media=media/20;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]<media) {
				inferiores++;
			}else if (vector[i]>media) {
				superiores++;
			}else{
				iguales++;
			}
		}
		System.out.println("la media es "+media);
		System.out.println("Hay "+superiores+" numeros mayores a la media");
		System.out.println("Hay "+inferiores+" numeros menores a la media");
		System.out.println("Hay "+iguales+" numeros iguales a la media");
	}

}
