import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Bolas {
	public String color;
	public Integer bolasComidas;
	public Integer maxBolas;
	public Integer numTragabolas;
	
	
	public Integer getNumTragabolas() {
		return numTragabolas;
	}
	public void setNumTragabolas(Integer numTragabolas) {
		this.numTragabolas = numTragabolas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBolasComidas() {
		return bolasComidas;
	}
	public void setBolasComidas(Integer numero) {
		this.bolasComidas = bolasComidas+numero;
	}
	public int getMaxBolas() {
		return maxBolas;
	}
	public void setMaxBolas(int maxBolas) {
		this.maxBolas = maxBolas;
	}
	public Bolas(String color, Integer bolasComidas, Integer maxBolas, Integer numTragabolas) {
		super();
		this.color = color;
		this.bolasComidas = bolasComidas;
		this.maxBolas = maxBolas;
		this.numTragabolas = numTragabolas;
	}
	
		
}