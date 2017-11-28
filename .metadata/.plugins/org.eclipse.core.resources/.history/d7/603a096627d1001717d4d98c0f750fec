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
		int opc=1; //Opcion que das a elegir al usuario, para que eliga si quiere sumar, restar,...
		float num1 =0,num2 = 0; //Los numeros con los valores que se realizaran los calculos
		float result=0; //Resultado de las operaciones
		String numeros="1234567890"; //Esta variable se utiliza para verificar si se ha introducido un numero correcto
		String verificador=""; //Variable parecida al comodin, que toma el valor del numero introducido y lo conprueba si esta correcto o no
		
		System.out.println("Introduce un numero por favor:");
		verificador = teclado.next();
		int i = 0;
		while ( i < verificador.length()) {
			if (numeros.indexOf(verificador.substring(i,i+1))==-1) {
				System.out.println("Por favor introduzca un numero valido");
				verificador = teclado.next();
				i=0;
			}else{
				i++;
			}
		}
		num1=Integer.parseInt(verificador);
		System.out.println("OPCIONES:");
		System.out.println("Opción 1 = Suma");
		System.out.println("Opción 2 = Resta");
		System.out.println("Opción 3 = Multiplicación");
		System.out.println("Opción 4 = División");
		System.out.println("Opción 5 = Raiz");
		System.out.println("Opción 6 = Porcentaje de");
		opc = teclado.nextInt();
		while (!(opc==1||opc==2||opc==3||opc==4||opc==5||opc==6)) {
			System.out.println("Por favor introduzca una opcion valida");
			opc = teclado.nextInt();
		}
		
		while (opc==1||opc==2||opc==3||opc==4||opc==6) {
		System.out.println("introduzca el segundo numero");
		verificador = teclado.next();
		i=0;
		while ( i < verificador.length()) {
			if (numeros.indexOf(verificador.substring(i,i+1))==-1) {
				System.out.println("Por favor introduzca un numero valido");
				verificador = teclado.next();
				i=0;
			}else{
				i++;
			}
		}
		break;
		}
		num2=Integer.parseInt(verificador);
		
		
		if (opc == 1) {
			result= num1 + num2;
		System.out.println(result);	
		}
		if (opc == 2) {
			result = num1 - num2;
			System.out.println(result);
		}
		if (opc == 3) {
			result=num1*num2;
			System.out.println(result);
		}
		if (opc == 4) {
			result=num1/num2;
			System.out.println(result);	
		
		}
		if (opc == 5) {
			System.out.println("La raíz cuadrada de " + num1 + " es " + Math.sqrt(num1));
		}
		if (opc == 6) {
			result=(num1/num2)*100;
			System.out.println(num1 + " es el "+ result+ "% de "+ num2);
		}
	}

}
