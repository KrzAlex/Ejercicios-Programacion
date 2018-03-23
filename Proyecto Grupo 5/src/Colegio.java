/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Colegio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumnos[] = new Alumno[20];
		Asignatura asignaturas[] = new Asignatura[20];
		baseDatos(alumnos, asignaturas);
		Integer opcion = 10;
		Leer.mensaje("Que dia es hoy?");
		Integer dia = Leer.pedirEntero("Dia");
		Integer mes = Leer.pedirEntero("Mes");
		Integer anio = Leer.pedirEntero("Año");
		Fecha fechaHoy = new Fecha(dia, mes, anio);

		while (opcion != 0) {
			Leer.mensaje("1. Crear Asignatura");
			Leer.mensaje("2. Crear Alumno");
			Leer.mensaje("3. Asignar Asignaturas a Alumnos");
			Leer.mensaje("4. Modificar Alumno");
			Leer.mensaje("5. Añadir nota al alumno");
			Leer.mensaje("6. Boletin");
			Leer.mensaje("7. Mostrar Alumnos");
			Leer.mensaje("8. Mostrar Asignaturas");
			Leer.mensaje("0. Salir");
			opcion = Leer.pedirEntero("");
			menu(opcion, fechaHoy, alumnos, asignaturas);
		}

	}

	public static void menu(Integer opcion, Fecha fechaHoy, Alumno[] alumnos, Asignatura[] asignaturas) {
		switch (opcion) {
		case 1:
			creacionAsignatura(asignaturas);
			break;
		case 2:
			creacionAlumno(alumnos, fechaHoy);
			break;
		case 3:
			añadirAsignatura(alumnos, asignaturas);
			break;
		case 4:
			mod_Alumno(alumnos, asignaturas);

			break;
		case 5:
			añadir_Notas(alumnos, asignaturas);
			break;
		case 6:
			for (int i = 0; i < alumnos.length; i++) {
				if (alumnos[i] == null) {
					break;
				}
				Leer.mensaje(alumnos[i].boletin(fechaHoy));
			}
			break;
		case 7:
			for (int i = 0; i < alumnos.length; i++) {
				if (alumnos[i] == null) {
					break;
				}
				Leer.mensaje((i + 1) + ". " + alumnos[i].getNombre());
			}
			Leer.mensaje("");
			break;
		case 8:
			for (int i = 0; i < asignaturas.length; i++) {
				if (asignaturas[i] == null) {
					break;
				}
				Leer.mensaje((i + 1) + ". " + asignaturas[i].getNombre());
			}
			Leer.mensaje("");
			break;
		default:
			break;
		}

	}

	private static void añadirAsignatura(Alumno[] alumnos, Asignatura[] asignaturas) {
		Integer contador = 0;
		Leer.mensaje("A que alumno desea añadir una asignatura?");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				break;
			}
			Leer.mensaje((i + 1) + ". " + alumnos[i].getNombre());
			contador++;
		}
		Integer alumno = Leer.pedirEntero("");
		while (alumno > contador) {
			alumno = Leer.pedirEntero("Alumno inexistente, porfavor introduzca un numero correcto");
		}
		contador = 0;
		Leer.mensaje("Que asignatura desea añadirle?");
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i] == null) {
				break;
			}
			Leer.mensaje(i + 1 + ". " + asignaturas[i].getNombre());
			contador++;
		}
		Integer asignatura = Leer.pedirEntero("");
		while (asignatura > contador) {
			alumno = Leer.pedirEntero("Asignatura inexistente, porfavor introduzca un numero correcto");
		}
		Leer.mensaje(alumnos[alumno - 1].añadirasignaturas(asignaturas[asignatura - 1]));
	}

	private static void creacionAsignatura(Asignatura[] asignatura) {
		String nombreAS = Leer.pedirCadena("Nombre de la asignatura");
		while (nombreAS.equals("")) {
			nombreAS = Leer.pedirCadena("No puedes dejar vacia esa opcion");
		}
		Integer horas = Leer.pedirEntero("Horas de la asignatura por semana");
		String curso = Leer.pedirCadena("A que curso corresponde la asignatura");
		while (!(curso.equals("1") || curso.equals("2"))) {
			curso = Leer.pedirCadena("Curso no existe, por favor, introduzca 1 o 2");
		}
		for (int i = 0; i < asignatura.length; i++) {
			if (asignatura[i] == null) {
				asignatura[i] = new Asignatura(horas, curso.charAt(0), nombreAS);
				break;
			}
		}
	}

	private static void creacionAlumno(Alumno[] alumnos, Fecha fechaHoy) {
		String nombreAL = Leer.pedirCadena("Cual es el nombre del alumno?");
		while (nombreAL.equals("")) {
			nombreAL = Leer.pedirCadena("No puedes dejar vacia esa opcion");
		}
		Leer.mensaje("Cual es su fecha de nacimiento?");
		Integer dia = Leer.pedirEntero("Dia");
		Integer mes = Leer.pedirEntero("Mes");
		Integer año = Leer.pedirEntero("Año");
		Fecha fechaNac = new Fecha(dia, mes, año);
		while (fechaNac.getAnio() > (fechaHoy.getAnio()-6)) {
			Leer.mensaje("El alumno debe tener como minimo 6 años.");
			dia = Leer.pedirEntero("Dia");
			mes = Leer.pedirEntero("Mes");
			año = Leer.pedirEntero("Año");
			fechaNac = new Fecha(dia, mes, año);
		}
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = new Alumno(nombreAL, fechaNac);
				break;
			}
		}
	}

	private static void mod_Alumno(Alumno[] alumnos, Asignatura[] asignaturas) {
		Integer opcion;
		Integer contador = 0;
		Leer.mensaje("A que alumno desea modificar?");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				break;
			}
			Leer.mensaje(i + 1 + ". " + alumnos[i].getNombre());
			contador = i;
		}
		Integer alumno = Leer.pedirEntero("");
		Leer.mensaje("1. Modificar nombre");
		Leer.mensaje("2. Modificar Fecha Nacimiento");
		Leer.mensaje("0. Salir");
		opcion = Leer.pedirEntero("");
		menuModificar(opcion, alumnos, asignaturas, contador);
	}

	private static void añadir_Notas(Alumno[] alumnos, Asignatura[] asignaturas) {
		Integer contador = 0;
		Leer.mensaje("A que alumno desea modificar?");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				break;
			}
			Leer.mensaje(i + 1 + ". " + alumnos[i].getNombre());
			contador ++;
		}
		contador = Leer.pedirEntero("");
		if (alumnos[contador-1].contadorAsignaturas()==0) {
			Leer.mensaje("No se ha matriculado en ninguna asignatura");
			return;
		}
		Leer.mensaje("A que asignatura desea añadirle la nota?");
		Leer.mensaje(alumnos[contador - 1].mostrarAsignaturas());
		Integer asignarura = Leer.pedirEntero("");
		Integer contadorAs = alumnos[contador - 1].contadorAsignaturas();
		if (asignarura >= contadorAs) {
			Leer.mensaje("Esa asignatura no existe");
			return;
		}

		Integer nota = Leer.pedirEntero("Que nota le introduces?");
		while (nota > 10 || nota < 0) {
			nota = Leer.pedirEntero("Nota no correcta, debe ser menor de 10");
		}
		Leer.mensaje(alumnos[contador - 1].introducirNota(nota, asignaturas[asignarura - 1]));
	}

	private static void menuModificar(Integer opcion, Alumno[] alumnos, Asignatura[] asignaturas, Integer contador) {
		switch (opcion) {
		case 1:
			String nombreNew = Leer.pedirCadena("Que nombre desea ponerle?");
			alumnos[contador].modNombre(nombreNew);
			break;
		case 2:
			Leer.mensaje("Cual es su nueva fecha de nacimiento");
			Integer dia = Leer.pedirEntero("Dia");
			Integer mes = Leer.pedirEntero("Mes");
			Integer año = Leer.pedirEntero("Año");
			alumnos[contador].modFechaNacimiento(dia, mes, año);
			break;
		default:
			break;
		}
	}

	public static void baseDatos(Alumno[] alumno, Asignatura[] asignatura) {
		Fecha fechaNac = new Fecha((17), (12), (1999));
		alumno[0] = new Alumno("Alex", fechaNac);
		fechaNac = new Fecha((29), (8), (1999));
		alumno[1] = new Alumno("Adrian", fechaNac);
		fechaNac = new Fecha((9), (4), (1997));
		alumno[2] = new Alumno("Alejandro", fechaNac);

		for (int i = 0; i < 3; i++) {
			char nivel = 1;
			asignatura[i] = new Asignatura(10, nivel, "Asignatura " + i);
		}
		for (int i = 3; i < 6; i++) {
			char nivel = 2;
			asignatura[i] = new Asignatura(10, nivel, "Asignatura " + i);
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				alumno[i].añadirasignaturas(asignatura[j]);
			}
		}
	}
}
