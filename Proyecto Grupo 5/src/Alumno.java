/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Alumno {
	private Asignatura asignaturas[] = new Asignatura[10];
	private Integer notas[] = new Integer[10];
	private String nombre;
	private Fecha fechaNac;

	// Getters y Setters
	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Integer[] getNotas() {
		return notas;
	}

	public void setNotas(Integer[] notas) {
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fecha getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Fecha fechaNac) {
		this.fechaNac = fechaNac;
	}

	// Getters y Setters
	public Alumno(String nombre, Fecha fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	// Metodos
	public String modNombre(String nombre) {
		if (nombre.equals(this.nombre)) {
			return "El nombre no se puede modificar porque es el mismo.";
		} else {
			this.nombre = nombre;
			return "El nombre se ha modificado correctamente";
		}

	}

	public String mostrarNombre() {
		return this.nombre;
	}

	public String modFechaNacimiento(Integer dia, Integer mes, Integer anyo) {
		Fecha nuevaFecha = new Fecha(dia, mes, anyo);
		if (this.fechaNac == nuevaFecha) {
			return "La fecha de nacimiento no se puede modificar ya que es la misma";
		} else {
			this.fechaNac = nuevaFecha;
			return "La fecha de nacimiento se ha modificado";
		}
	}

	public Integer mostraredad(Fecha hoy) {
		Integer edad = this.fechaNac.difFechas(hoy);
		edad = edad / 365;
		return edad;
	}

	public String añadirasignaturas(Asignatura nuevaAsignatura) {
		Boolean encontrado = true;
		Integer localizacion = -1;
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i] == null) {
				localizacion = i;
				break;
			}
			if (asignaturas[i] == nuevaAsignatura) {
				encontrado = false;
			}
		}
		if (encontrado && (localizacion != -1)) {
			asignaturas[localizacion] = nuevaAsignatura;
			return "Se ha añadido la asignatura correctamente";
		} else {
			if (localizacion == 0) {
				return "No se puede matricular a ninguna asignatura más";
			} else {
				return "No se puede añadir la asignatura porque ya existe";

			}
		}

	}

	public String introducirNota(Integer nota, Asignatura asignaturaN) {
		Integer posicion = 0;
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i] == asignaturaN) {
				posicion = i;
				break;
			}
		}
		this.notas[posicion] = nota;
		return "Se ha introducido una nueva nota";
	}

	public String mostrarNota(Asignatura asignaturaN) {
		Integer posicion = 0;
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i] == asignaturaN) {
				posicion = i;
			}
		}

		return "La nota es " + this.notas[posicion];
	}

	public Integer mostrarMedia() {
		Integer notaTotal = 0;
		Integer numAsignaturas = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] == null) {
				break;
			}
			notaTotal = notas[i] + notaTotal;
			numAsignaturas++;
		}
		if (numAsignaturas==0) {
			return 0;
		} else {
			return notaTotal / numAsignaturas;
		}
		
	}

	public String calificacion(Asignatura asignaturaN) {
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i] == asignaturaN) {
				if (this.notas[i] >= 6) {
					return "Aprobado";
				} else {
					return "Suspenso";
				}
			}
		}
		return "Asignatura no encontrada";
	}

	public String boletin(Fecha fechaactual) {
		String textoboletin = this.nombre + " Edad: " + this.mostraredad(fechaactual) + "\n";
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i] == null) {
				break;
			}
			if (notas[i] != null) {
				textoboletin = textoboletin + (i + 1) + ". " + this.asignaturas[i].getNombre() + ":  " + this.notas[i]
						+ "    " + this.calificacion(this.asignaturas[i]) + " \n";
			}else{
				textoboletin = textoboletin + (i + 1) + ". " + this.asignaturas[i].getNombre() + ":  No introducido     \n";
			}
		}
		textoboletin = textoboletin + "Nota Media: " + this.mostrarMedia();
		return textoboletin;
	}

	public String mostrarAsignaturas() {
		String texto = "";
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i] == null) {
				break;
			}
			texto = texto + (i+1) + ". " + asignaturas[i].getNombre() + "\n";
		}
		return texto;
	}
	
	public Integer contadorAsignaturas(){
		Integer contador=0;
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i]==null) {
				break;
			}
			contador++;
		}
		return contador;
	}
}
