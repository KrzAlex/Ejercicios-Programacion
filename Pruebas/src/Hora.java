/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Hora {
	int hora;
	int min;
	int seg;
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		if (hora >=0 && hora < 24) {
			this.hora = hora;
		}
	}
	
	public int getMin() {
		return min;
	}
	
	public void setMin(int min) {
		if (min >=0 && min <60) {
			this.min = min;
		}
	}
	
	public int getSeg() {
		return seg;
	}
	
	public void setSeg(int seg) {
		if (seg >=0 && seg < 60) {
			this.seg = seg;
		}
	}
	
	
	public Hora(int hora, int min, int seg) {
		if (hora < 0 || hora >23) {
			this.hora = 0;
		}else{
			this.hora = hora;
		}
		
		if (min < 0 || min >59) {
			this.min = 0;
		}else{
			this.min = min;
		}
		
		if (seg < 0 || seg >59) {
			this.seg = 0;
		}else{
			this.seg = seg;
		}
	}
}
