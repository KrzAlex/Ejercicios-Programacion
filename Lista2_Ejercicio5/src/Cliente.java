/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Cliente {
	private Integer restante;

	public Integer getRestante() {
		return restante;
	}

	public void setRestante(Integer restante) {
		this.restante = restante;
	}

	public Cliente() {
		Integer tiempo = (int) (Math.random()* 101);
		if (tiempo <= 60) {
			tiempo = 10;
		} else if (tiempo > 60 && tiempo <= 85) {
			tiempo = 15;
		} else {
			tiempo = 20;
		}
		restante=tiempo;
	}
	
	public void restarMin(){
		restante--;
	}

	@Override
	public String toString() {
		return "☺ :"+restante;
	}
	
	
}
