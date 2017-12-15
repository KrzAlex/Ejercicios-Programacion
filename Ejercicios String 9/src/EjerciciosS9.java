import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS9 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Por favor, introduzca el numero de personas que vas a introducir");
		int personas= teclado.nextInt();
		Thread.sleep(1000);
		int año=0;
		String sexo="";
		int curso=0;
		String extra;
		String matriz[]= new String [personas];
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Introduzca el a�o de la persona " +(i+1));
			año=teclado.nextInt();
			if (año==00000000) {
				break;
			}
			Thread.sleep(1000);
			while (año<1990||año>1995) {
				System.out.println("Por favor que al a�o de la persona se entre 1990 y 1995");
				año=teclado.nextInt();
			}
			matriz[i]=matriz[i] + año;
			System.out.println("La persona "+(i+1)+" es Hombre (H) o Mujer (M)");
			sexo=teclado.next();
			while (!(sexo.equals("H")||sexo.equals("h")||sexo.equals("M")||sexo.equals("m"))) {
				Thread.sleep(1000);
				System.out.println("Por favor, introduzca H o una M");
				sexo=teclado.next();
				sexo = sexo.toUpperCase();
			}
			matriz[i]=matriz[i] + sexo;
			Thread.sleep(1000);
			System.out.println("Introduzca el curso de la persona "+(i+1));
			curso=teclado.nextInt();
			while (!(año<0||año>2)) {
				Thread.sleep(1000);
				System.out.println("Por favor introduze si esta en el curso 1 o en el curso 2");
				curso=teclado.nextInt();
			}
			matriz[i]=matriz[i] + curso;
			Thread.sleep(1000);
			System.out.println("Introduce dos numeros o letras mas");
			extra=teclado.next();
			while (extra.length()>2) {
				Thread.sleep(1000);
				System.out.println("Por favor introduce solo dos caracteres");
				extra=teclado.next();
			}
			matriz[i]=matriz[i] + extra;
			Thread.sleep(1000);
			}
		
		System.out.println("Gracias por utilizar este metodo");
		
		
	}

}
