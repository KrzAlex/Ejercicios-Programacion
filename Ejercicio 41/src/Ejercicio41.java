import java.awt.Cursor;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio41 {

	/**
	 * @param args
	 * Se dispone de una tabla de 5 p�ginas, 10 filas y 20 columnas, que se refieren al centro, 
	 * al curso y al n�mero de alumnos de un colegio respectivamente. 
	 * Imprimir la nota media por curso y la nota media m�xima y su centro de pertenencia.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz1[][][]= new int [5][10][20];
		float media=0, suma=0; float mediaMax=0; float mediacentro=0; float Mcentro=0; float Scurso=0;
		int matriz2[][][]= new int [5][10][20];
		int ce2=0, cu2=0;int curso;
		for (int centro = 0; centro < matriz1.length; centro++) {
			System.out.println();
			System.out.println("Centro" + (centro +1));
			for (curso = 0; curso < matriz1[0].length; curso++) {
				System.out.println();
				System.out.println("Curso " + (curso +1));
				for (int alumno = 0; alumno < matriz1[0][0].length; alumno++) {
					matriz1[centro][curso][alumno]=(int) (Math.random()*10)+1;
					suma = suma + matriz1[centro][curso][alumno];
					System.out.print(matriz1[centro][curso][alumno] + " ");
				}
				media= suma/matriz1[0][0].length;
				
				Scurso= Scurso + media;
				
				if (media>mediaMax) {
					mediaMax=media;
					ce2=centro;
					cu2=curso;
					
				}
				System.out.println(" ");
				System.out.println("La media del curso " + (curso + 1 )+ " es de " + media);
				media=0;
				suma=0;
			}
			Mcentro=Scurso/matriz1[0].length;
			System.out.println();
			System.out.println("La media maxima del centro " + (centro +1) + " es del curso " + (curso +1) + " con la media de " + Mcentro);
			Mcentro=0;
			Scurso=0;
		}
		System.out.println();
		System.out.println("La media maxima es del centro " + (ce2 +1) + " del curso " + (cu2 +1) + " con la media de " + mediaMax);
	
	}

}
