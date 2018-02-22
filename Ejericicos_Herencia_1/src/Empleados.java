/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Empleados {
	public String nombre;
	public Integer saldo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getSaldo() {
		return saldo;
	}
	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	public Empleados(String nombre, Integer saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}
	public void mostrardatos(){
		System.out.print("El nombre del Empleado es="+nombre);
		System.out.println(", cuyo saldo es= "+saldo);
	}
}
