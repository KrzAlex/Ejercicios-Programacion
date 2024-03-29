/**
 * 
 */

/**
 * @author yo
 *
 */
public class Cuentacorriente {
	private String numero;
	private Double saldo;
	private String cliente;
	private static Integer siguiente = 1;
	private static Integer numCuentas = 0;

	/**
	 * @param numero
	 * @param saldo
	 * @param cliente
	 */
	public Cuentacorriente(Double saldo, String cliente) {
		String num = "0000" + siguiente;
		this.numero = num.substring(num.length() - 3);
		this.saldo = saldo;
		this.cliente = cliente;
		siguiente++;
		numCuentas++;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the saldo
	 */
	public Double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the siguiente
	 */
	public static Integer getSiguiente() {
		return siguiente;
	}

	/**
	 * @param siguiente
	 *            the siguiente to set
	 */
	public static void setSiguiente(Integer siguiente) {
		Cuentacorriente.siguiente = siguiente;
	}

	public static Integer getNumCuentas() {
		return numCuentas;
	}

	public static void setNumCuentas(Integer numCuentas) {
		Cuentacorriente.numCuentas = numCuentas;
	}

	/**
	 * @param importe
	 *            the importe a ingresar
	 */
	public void ingresarEfectivo(Double importe) {
		this.saldo = saldo + importe;
	}

	/**
	 * @param importe
	 *            the importe a retirar
	 */
	public Boolean retirarEfectivo(Double importe) {
		if (importe > this.saldo) {
			return false;
		} else {
			this.saldo = saldo - importe;
			return true;
		}
	}

	public String Visualizacion() {
		String texto;
		texto = "Actualmente hay " + this.numCuentas + " cuentas abiertas.";
		return texto;
	}

	public void cerrarCuentas() {
		this.cliente = this.cliente+"CERRADA";
		this.saldo = 0.0;
		numCuentas--;
	}

	public Cuentacorriente fusionarCuentas(Cuentacorriente cuenta2) {
		Cuentacorriente nueva = null;
		if (cuenta2.getNumero() != this.numero && this.cliente.equals(cuenta2.getCliente())) {
			this.saldo = this.saldo + cuenta2.getSaldo();
			nueva = new Cuentacorriente(saldo, cliente);
			Leer.mensaje("Se ha fusionado la cuenta " + this.numero + " con la cuenta " + cuenta2.getNumero()
					+ ", cuyo propietario es " + this.cliente);
			this.cerrarCuentas();
			cuenta2.cerrarCuentas();
			return nueva;
		}
		System.out.println("Las cuentas, tienen el mismo numero, o son de personas distintas");
		return nueva;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	/*
	 * @Override public String toString() { return "Cuentacorriente [numero=" +
	 * numero + ", saldo=" + saldo + ", cliente=" + cliente + "]"; }
	 */
	/**
	 * @param siguiente
	 *            the siguiente to set
	 */
	public String visualiza() {
		return "Cuentacorriente [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}

}
