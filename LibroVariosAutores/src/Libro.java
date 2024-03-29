/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Libro {
	public String numero;
	public String titulo;
	public Autor autor[] = new Autor[5];
	public Double precio;
	public Integer cantidad = 0;
	public static Integer siguiente = 1;
	public Integer numAutores = 0;
	public static Integer numLibros=1;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor[] getAutor() {
		return autor;
	}

	public void setAutor(Autor[] autor) {
		this.autor = autor;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public static Integer getSiguiente() {
		return siguiente;
	}

	public static void setSiguiente(Integer siguiente) {
		Libro.siguiente = siguiente;
	}

	@Override
	public String toString() {
		String autores = "";
		for (int i = 0; i < numAutores; i++) {
			if (autor[i] == null) {
				break;
			}
			autores = autores +"\n"+autor[i].toString();
		}
		return "Libro [numero=" + numero + ", titulo=" + titulo+autores + ", \nprecio=" + precio + ", cantidad="
				+ cantidad + "]\n";
	}

	public Libro(String titulo, Autor autor, Double precio, Integer cantidad) {
		String num = "0000" + numLibros;
		this.numero = num.substring(num.length() - 3);
		this.titulo = titulo;
		this.autor[numAutores] = autor;
		this.precio = precio;
		this.cantidad = cantidad;
		siguiente++;
		numLibros++;
		numAutores++;
	}

	public Libro crearLibro(String titulo, Autor autor, double precio, Integer cantidad) {
		Libro libroNEW = null;
		libroNEW = new Libro(titulo, autor, precio, cantidad);
		return libroNEW;
	}

	public void modificarlibrotitulo(String newTitulo) {
		String texto = "";
		if (newTitulo.equals(this.titulo)) {
			Leer.mensaje("Lo sentimos, ese titulo es igual, no se ha cambiado");
		} else {
			Leer.mensaje("Se ha modificado el titulo del libro " + this.numero + " cuyo nombre era " + "\""
					+ this.titulo + "\" y se ha cambiado por \"" + newTitulo + "\"");
			this.titulo = newTitulo;
		}
	}

	public void modificarlibroautores(String opcion, Autor autores2) {
		Integer numAut = 0;
		Boolean encontrado = false;
		String nume = "";
		if (opcion.equals("001")) {	
			for (int i = 0; i < autor.length; i++) {
				if (autor[i]==null) {
					break;
				}
				if (autor[i].getNumero().equals(autores2.getNumero())) {
					Leer.mensaje("Lo sentimos, ese autor ya esta en este libro");
					return;
				}
			}
			añadirAutor(autores2);
		}
		if (opcion.equals("002")) {
			Leer.mensaje(mostrarAutores());
			nume=Leer.pedirCadena("Que autor desea eliminar?");
			for (int i = 0; i < autor.length; i++) {
				if (autor[i]==null) {
					break;
				}
				if (nume.equals(autor[i].getNumero())) {
					numAut=i;
					encontrado=true;
					break;
				}
			}
			if (!encontrado) {
				Leer.mensaje("autor no encontrado");
				return;
			}
			eliminarAutor(numAut);
		}
	}

	public void modificarlibroprecio(Double newPrecio) {
		Leer.mensaje("Se ha modificado el precio del libro " + this.numero + " que anteriormente era \"" + this.precio
				+ "\" y se ha cambiado por \"" + newPrecio + "\"");
		this.precio = newPrecio+0.0;
	}

	public void modificarlibrocantidad(Integer newCant) {
		Leer.mensaje("Se ha modificado la cantidad del libro " + this.numero + " de \"" + this.cantidad + "\" por \""
				+ newCant + "\"");
		this.cantidad = newCant;
	}

	public String mostrarAutores() {
		String autores = "";
		for (int i = 0; i < autor.length; i++) {
			if (autor[i] == null) {
				break;
			}
			autores = autores + "\n" + autor[i].toString();
		}
		return autores;
	}

	public void añadirAutor(Autor newautor) {
		autor[numAutores]=newautor;
		numAutores++;
	}

	public void eliminarAutor(Integer numEAutor) {
		Leer.mensaje("El autor "+autor[numEAutor].getNumero()+", ha sido eliminado del libro "+titulo);
		autor[numEAutor] = null;
		numAutores--;
		for (int i = numEAutor; i < autor.length-1; i++) {
			autor[i]=autor[i+1];
		}
	}

	public void eliminarAutor(Autor autor2) {
		for (int i = 0; i < autor.length; i++) {
			if (autor[i] == autor2) {
				for (int j = i; j < autor.length - 1; j++) {
					autor[j] = autor[j + 1];
				}
				numAutores--;
				break;
			}
		}
		return;
	}
}