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
		Alumno alumnos []=new Alumno [20];
		Asignatura asignaturas []=new Asignatura [20];
		baseDatos(alumnos, asignaturas);
		Integer opcion=10;
		Leer.mensaje("Que dia es hoy?");
		Integer dia=Leer.pedirEntero("Dia");
		Integer mes=Leer.pedirEntero("Mes");
		Integer anio=Leer.pedirEntero("Año");
		Fecha fechaHoy=new Fecha(dia, mes, anio);
		
		while (opcion!=0) {
			Leer.mensaje("1. Crear Asignatura");
			Leer.mensaje("2. Crear Alumno");
			Leer.mensaje("3. Asignar Asignaturas a Alumnos");
			Leer.mensaje("4. Modificar Alumno");
			Leer.mensaje("5. Boletin");
			Leer.mensaje("0. Salir");
			opcion=Leer.pedirEntero("");
			menu(opcion, fechaHoy, alumnos,asignaturas);
		}	
		
	}
	public static void menu(Integer opcion, Fecha fechaHoy, Alumno[] alumnos, Asignatura[] asignaturas){
		switch (opcion) {
		case 1:
			creacionAsignatura(asignaturas);
			break;
		case 2:
			creacionAlumno(alumnos);
			break;
		case 3:
			añadirAsignatura(alumnos, asignaturas);
			break;
		case 4:
			Integer contador=0;
			Leer.mensaje("A que alumno desea modificar?");
			for (int i = 0; i < alumnos.length; i++) {
				if (alumnos[i]==null) {
					break;
				}
				Leer.mensaje(i+1+". "+alumnos[i].getNombre());
				contador=i;
			}
			Integer alumno=Leer.pedirEntero("");
			Leer.mensaje("1. Modificar nombre");
			Leer.mensaje("2. Modificar Fecha Nacimiento");
			Leer.mensaje("3. Introducir nota de asignatura");
			Leer.mensaje("0. Salir");
			opcion=Leer.pedirEntero("");
			menuModificar(opcion,alumnos, asignaturas, contador);
			
			break;
		case 5:
			for (int i = 0; i < alumnos.length; i++) {
				if (alumnos[i]==null) {
					break;
				}
				Leer.mensaje(alumnos[i].boletin(fechaHoy));
			}
			break;
		default:
			break;
		}
		
	}
	
	private static void menuModificar(Integer opcion, Alumno[] alumnos, Asignatura[] asignaturas, Integer contador){
		switch (opcion) {
		case 1:
			String nombreNew=Leer.pedirCadena("Que nombre desea ponerle?");
			alumnos[contador].modNombre(nombreNew);
			break;
		case 2:
			Leer.mensaje("Cual es su nueva fecha de nacimiento");
			Integer dia=Leer.pedirEntero("Dia");
			Integer mes=Leer.pedirEntero("Mes");
			Integer año=Leer.pedirEntero("Año");
			alumnos[contador].modFechaNacimiento(dia, mes, año);
			break;
		case 3:
			Leer.mensaje("A que asignatura desea añadirle la nota?");
			Integer contador2=0;
			Leer.mensaje(alumnos[contador].mostrarAsignaturas());
			Integer asignarura=Leer.pedirEntero("");
			Integer nota=Leer.pedirEntero("Que nota le introduces?");
			while (nota>10) {
				nota=Leer.pedirEntero("Nota no correcta, debe ser menor de 10");
			}
			alumnos[contador].introducirNota(nota, asignaturas[contador2]);
			break;
		default:
			break;
		}
	}
		
	
	private static void añadirAsignatura(Alumno[] alumnos, Asignatura[] asignaturas) {
		Integer contador=0;
		Leer.mensaje("A que alumno desea añadir una asignatura?");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i]==null) {
				break;
			}
			Leer.mensaje(i+1+". "+alumnos[i].getNombre());
			contador=i;
		}
		Integer alumno=Leer.pedirEntero("");
		while (alumno>contador) {
			alumno=Leer.pedirEntero("Alumno inexistente, porfavor introduzca un numero correcto");
		}
		Leer.mensaje("Que asignatura desea añadirle?");
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i]==null) {
				break;
			}
			Leer.mensaje(i+1+". "+asignaturas[i].getNombre());
		}
		Integer asignatura=Leer.pedirEntero("");
		
		alumnos[alumno-1].añadirasignaturas(asignaturas[asignatura-1]);
	}

	private static void creacionAsignatura(Asignatura[] asignatura) {
		String nombreAS=Leer.pedirCadena("Nombre de la asignatura");
		Integer horas=Leer.pedirEntero("Horas de la asignatura por semana");
		String curso=Leer.pedirCadena("A que curso corresponde la asignatura");
		
		for (int i = 0; i < asignatura.length; i++) {
			if (asignatura[i]==null) {
				asignatura[i]=new Asignatura(horas,curso.charAt(0), nombreAS);
				break;
			}
		}
	}
	
	private static void creacionAlumno(Alumno[] alumnos) {
		String nombreAL=Leer.pedirCadena("Cual es el nombre del alumno?");
		Leer.mensaje("Cual es su fecha de nacimiento?");
		Integer dia=Leer.pedirEntero("Dia");
		Integer mes=Leer.pedirEntero("Mes");
		Integer año=Leer.pedirEntero("Año");
		Fecha fechaNac=new Fecha(dia, mes, año);
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i]==null) {
				alumnos[i]=new Alumno(nombreAL, fechaNac);
				break;
			}
		}
	}
	
	public static void baseDatos(Alumno [] alumno, Asignatura [] asignatura){
		for (int i = 0; i < 3; i++) {
			Fecha fechaNac=new Fecha((15+i),(5+i),(i+1999));
			alumno[i]=new Alumno("Alumno "+(i+1), fechaNac);
		}
		for (int i = 0; i < 3; i++) {
			char nivel=1;
			asignatura[i]=new Asignatura(10,nivel, "Asignatura "+i);
		}
		for (int i = 3; i < 6; i++) {
			char nivel=2;
			asignatura[i]=new Asignatura(10,nivel, "Asignatura "+i);
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				alumno[i].añadirasignaturas(asignatura[j]);
				alumno[i].introducirNota((int)(Math.random()*9)+1, asignatura[j]);
			}				
		}
	}
}
