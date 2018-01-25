/**
 * 
 */

/**
 * @author yo
 *
 */
public class GestionCuentas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuentacorriente[] cuentas;
		cuentas = new Cuentacorriente[100];
		String cliente;
		Double saldo;
		for (int i = 0; i < 2; i++) {
			cliente = Leer.pedirCadena("Nombre del cliente ");
			saldo = Leer.pedirDecimal("Saldo inicial ");
			cuentas[i] = new Cuentacorriente(saldo, cliente);
		}
		for (int i = 0; i < cuentas.length; i++) {
			if (i < Cuentacorriente.getSiguiente() - 1) {
				Leer.mensaje(cuentas[i].visualiza());
			}
		}
		// Menu
		int opcion;
		do {
			Leer.mensaje(" 1.- Crear cuenta");
			Leer.mensaje(" 2.- Visualizar las cuentas");
			Leer.mensaje(" 3.- Ingresar en una cuenta");
			Leer.mensaje(" 4.- Sacar de una cuenta");
			Leer.mensaje(" 5.- Visualizar numero de cuentas existentes");
			Leer.mensaje(" 6.- Cerrar cuenta");
			Leer.mensaje(" 7.- Fusionar 2 cuentas");
			Leer.mensaje(" 0.- Fin");

			opcion = Leer.pedirEntero("Elija opci�n ");
			Double importe = -1.0;
			String cuenta;
			Boolean existe = false, saldosuf;

			switch (opcion) {

			case 1:// Crear cuenta
				crearCuenta(cuentas);
				break;

			case 2:// visualizar cuentas
				mostrarCuentas(cuentas);
				break;

			case 3:// ingresar en cuenta
				ingresarCuentas(cuentas, importe, existe);
				break;

			case 4:// sacar de cuenta
				sacarCuentas(cuentas, importe, existe);
				break;

			case 5:// Visualizar cuentas existentes
				visualizarCuentas(cuentas);
				break;

			case 6: // Cerrar cuentas
				cerrarCuentas(cuentas, existe);

				break;

			case 7: // Fusionar dos cuentas
				fusionCuentas(cuentas, existe);
				break;
			}
		} while (opcion != 0);
	}

	private static void fusionCuentas(Cuentacorriente[] cuentas, Boolean existe) {
		String cuenta1 = Leer.pedirCadena("Cual es la primera cuenta que desea fusionar?");
		int i, j;
		existe = false;
		for (i = 0; i < Cuentacorriente.getSiguiente() - 1; i++) {
			if (cuentas[i].getNumero().equals(cuenta1)) {
				existe = true;

				break;
			}
		}

		if ((!existe) || cuentas[i].getCliente().equals("CERRADA")) {
			Leer.mensaje("La cuenta " + cuenta1 + " no existe o esta CERRADA ");
			return;
		}
		existe = false;
		String cuenta2 = Leer.pedirCadena("Con que cuenta desea fusionar la anterior?");
		for (j = 0; j < Cuentacorriente.getSiguiente() - 1; j++) {
			if (cuentas[j].getNumero().equals(cuenta2)) {
				existe = true;
				break;
			}
		}
		if (existe == false || cuentas[j].getCliente().equals("CERRADA")) {
			Leer.mensaje("La cuenta " + cuenta2 + " no existe o esta CERRADA ");
			return;
		}
		cuentas[cuentas[0].getSiguiente() - 1] = cuentas[i].fusionarCuentas(cuentas[j]);

	}

	private static void cerrarCuentas(Cuentacorriente[] cuentas, Boolean existe) {
		String cuenta;
		cuenta = Leer.pedirCadena("Codigo de cuenta que desea borrar");
		for (int i = 0; i < Cuentacorriente.getSiguiente() - 1; i++) {
			if (cuentas[i].getNumero().equals(cuenta)) {
				cuentas[i].cerrarCuentas();
				Leer.mensaje("Se ha eliminado la cuenta " + cuenta);
				existe = true;
			}
		}
		if (!existe) {
			Leer.mensaje("Cuenta no existente " + cuenta);
		}
	}

	private static void visualizarCuentas(Cuentacorriente[] cuentas) {
		if (Cuentacorriente.getNumCuentas() > 1) {
			Leer.mensaje(cuentas[0].Visualizacion());
		} else {
			Leer.mensaje("Cuentas insuficientes, por favor cree mas cuentas");
		}
	}

	private static void sacarCuentas(Cuentacorriente[] cuentas, Double importe, Boolean existe) {
		String cuenta;
		Boolean saldosuf;
		while (importe < 0) {
			importe = Leer.pedirDecimal("Teclee importe a retirar (mayor que cero: ");
		}
		cuenta = Leer.pedirCadena("C�digo de cuenta en la que ingresar");
		for (int i = 0; i < Cuentacorriente.getSiguiente() - 1; i++) {
			if (cuentas[i].getNumero().equals(cuenta)) {
				saldosuf = cuentas[i].retirarEfectivo(importe);
				if (!saldosuf) {
					Leer.mensaje("No hay saldo suficiente");
				}
				existe = true;
			}
		}
		if (!existe) {
			Leer.mensaje("Cuenta no existente " + cuenta);
		}
	}

	private static void ingresarCuentas(Cuentacorriente[] cuentas, Double importe, Boolean existe) {
		String cuenta;
		while (importe < 0) {
			importe = Leer.pedirDecimal("Teclee importe a ingresar (mayor que cero: ");
		}
		cuenta = Leer.pedirCadena("C�digo de cuenta en la que ingresar");
		for (int i = 0; i < Cuentacorriente.getSiguiente() - 1; i++) {
			if (cuentas[i].getNumero().equals(cuenta)) {
				cuentas[i].ingresarEfectivo(importe);
				existe = true;
			}
		}
		if (!existe) {
			Leer.mensaje("Cuenta no existente " + cuenta);
		}
	}

	private static void mostrarCuentas(Cuentacorriente[] cuentas) {
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null) {
				Leer.mensaje(cuentas[i].visualiza());
			}
		}
	}

	private static void crearCuenta(Cuentacorriente[] cuentas) {
		String cliente;
		Double saldo;
		if (Cuentacorriente.getSiguiente() == 11) {
			Leer.mensaje("L�mite de cuentas alcanzado");
		} else {
			cliente = Leer.pedirCadena("Nombre del cliente ");
			saldo = Leer.pedirDecimal("Saldo inicial ");
			cuentas[Cuentacorriente.getSiguiente() - 1] = new Cuentacorriente(saldo, cliente);
		}
	}
}
