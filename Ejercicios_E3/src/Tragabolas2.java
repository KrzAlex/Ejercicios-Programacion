import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Tragabolas2 {


	public static Boolean comer(Bolas bolas, Integer comodin) throws InterruptedException {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantas bolas desea darle");
		Thread.sleep(1000);
		
		while (comodin > (bolas.getMaxBolas() - bolas.getBolasComidas())) {
			System.out.println("El tragabolas no puede comer tanto");
			System.out.println("Por favor introduzca un numero de bolas que pueda comer");
			System.out.println("Puede comer " + (bolas.getMaxBolas() - bolas.getBolasComidas()) + " bolas mas");
			return false;
		}
		System.out.println("El tragabolas se va a comer " + comodin + " bolas");
		System.out.println();
		bolas.setBolasComidas(comodin);
		return true;
	}

	public static Boolean trotar(Bolas bolas){
	
		System.out.println();
		if (bolas.getBolasComidas() > 0) {

			System.out.println("Mirame, estoy trotando");
		
			bolas.setBolasComidas(-1);
			System.out.println();
			return true;
		} else {
		
			System.out.println("No puedo trotar, tengo hambre");
			
		}
		System.out.println();
		return false;
	}

	public static Boolean dormir(Bolas bolas){
		if (bolas.getBolasComidas() == bolas.getMaxBolas()) {
		
			System.out.println("Estoy lleno, hora de dormir. ZzZzZzZz.");

			System.out.println("Me he despertado :D");

			bolas.setBolasComidas(-(bolas.maxBolas / 2));
			return true;
		} else {
		
			System.out.println("No quiero dormir");
		}
		System.out.println();

		return false;
	}

	public static Boolean verificadorCol(String color){
		Scanner teclado = new Scanner(System.in);
		String comodin = "";
		color = color.toLowerCase();
		while (!(color.equals("azul") || color.equals("amarillo") || color.equals("rojo") || color.equals("verde"))) {
			System.out.println("El Tragabola solo pueden ser azul, amarillo, rojo o verde");
			System.out.println("Por favor introduce un color adecuado");
			return false;
		}
		comodin = color;
		return true;
	}

	public static Boolean verificadorMax(Integer maxBolas){
		Scanner teclado = new Scanner(System.in);
		while (maxBolas < 1) {

			System.out.println("El numero de bolas maximas que puede comer debe ser un numero positivo");
			System.out.println("Vuelve a introducir la cantidad porfavor");
			return false;
		}
		return true;
	}

}
