/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Asignatura {
	private Integer horasSemanales;
	private Character nivel;
	private String nombre;
	
	//Gettters y Setters
	public Integer getHorasSemanales() {
		return horasSemanales;
	}
	public void setHorasSemanales(Integer horasSemanales) {
		this.horasSemanales = horasSemanales;
	}
	public Character getNivel() {
		return nivel;
	}
	public void setNivel(Character nivel) {
		this.nivel = nivel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Constructor
	public Asignatura(Integer horasSemanales, Character nivel, String nombre) {
		this.horasSemanales = horasSemanales;
		this.nivel = nivel;
		this.nombre = nombre;
	}
	
	
	
}
