/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Autor {
	public String numero;
	public String nombre;
	public String email;
	public char sexo;
	public String fechanacimiento;
	public static Integer siguiente = 1;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public static Integer getSiguiente() {
		return siguiente;
	}

	public static void setSiguiente(Integer siguiente) {
		Autor.siguiente = siguiente;
	}

	@Override
	public String toString() {
		return "Autor [Numero="+numero+", nombre=" + nombre + ", email=" + email + ", sexo=" + sexo + ", fechanacimiento="
				+ fechanacimiento + "]";
	}

	public Autor(String nombre, String email, char sexo, String fechanacimiento) {
		String num = "0000" + siguiente;
		this.numero = num.substring(num.length() - 3);
		this.nombre = nombre;
		this.email = email;
		this.sexo = sexo;
		this.fechanacimiento = fechanacimiento;
		siguiente++;
	}
	
	public void modificarnombre(String nuevonombre){
		this.nombre=nuevonombre;
	}
	
	public void modificaremail(String nuevomail){
		this.email=nuevomail;
	}
	
	public void modificarfecha(String nuevafechanacimiento){
		this.fechanacimiento=nuevafechanacimiento;
	}
}