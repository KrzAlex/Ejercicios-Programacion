import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Probando {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
	/*	System.out.println("CONVERSOR A LCD. Introduzca una frase:");
		String frase=teclado.nextLine();
		Letras_LCD letras= new Letras_LCD(frase);		*/	
		
		Fecha fecha;
		int opcion=2;
		System.out.println("Bienvenido al programa para calcular las fechas");
		Thread.sleep(1000);
		while(opcion!=0){
		System.out.println("────────────────────────────────────────────────────────────────");
		System.out.println("1. Introduce una fecha");
		System.out.println("2. Comprovar si es bisiesto");
		System.out.println("3. Averiguar que mes es");
		System.out.println("4. Decir cuantos dias tiene el mes de la fecha introducida");
		System.out.println("5. Imprimir la fecha");
		System.out.println("6. No implementado");
		System.out.println("7. No implementado");
		System.out.println("8. Mostrar fecha introducida");
		System.out.println("0. Salir");
		System.out.println("────────────────────────────────────────────────────────────────");
		opcion=teclado.nextInt();
		fecha=new Fecha(opcion);
		}
		
		
		
		
		
		
	}

}
