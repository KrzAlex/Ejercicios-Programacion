import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String numeros="1234567890";
		int opc=1;
		String num1 = "",num2 = "";
		float result=0;
		String comprobante="";
		System.out.println("Introduce dos numeros por favor:");
		num1 = teclado.next();
		while (numeros.indexOf(num1)!=1) {
			System.out.println("Por favor introduzca un numero");
			num1 = teclado.next();
		}
		System.out.println("Introduzca el segundo numero");
		num2 = teclado.next();
		
		while (numeros.indexOf(num2)!=1) {
			System.out.println("Por favor introduzca un numero");
			num2 = teclado.next();
		}
		int comodin1=Integer.getInteger(num1);
		int comodin2=Integer.getInteger(num2);
		System.out.println("Selecciona una opción por favor:");
		
		
		System.out.println("OPCIONES:");
		System.out.println("Opción 1 = Suma");
		System.out.println("Opción 2 = Resta");
		System.out.println("Opción 3 = Multiplicación");
		System.out.println("Opción 4 = División");
		opc = teclado.nextInt();
		while (!(opc==1||opc==2||opc==3||opc==4)) {
			System.out.println("Por favor introduzca una opcion valida");
		}
		if (opc == 1) {
			result= comodin1 + comodin2;
		
		System.out.println(result);
			
		}
		if (opc == 2) {
			result = comodin1 - comodin2;
			System.out.println(result);
		}
		if (opc == 3) {
			result=comodin1*comodin2;
			System.out.println(result);
		}
		if (opc == 4) {
			result=comodin1/comodin2;
			System.out.println(result);	
		}
	}

}
