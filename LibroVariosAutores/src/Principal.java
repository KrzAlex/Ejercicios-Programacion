import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor autores[] = new Autor[10];
		Libro libros[] = new Libro[10];
		base_datos(autores, libros);
		Scanner teclado = new Scanner(System.in);
		int opcion = 10;
		while (opcion != 0) {
			Leer.mensaje("");
			Leer.mensaje("1. Crear libro");
			Leer.mensaje("2. Modificar Autor");
			Leer.mensaje("3. Modificar libro");
			Leer.mensaje("4. Listado de Libros");
			Leer.mensaje("5. Listado de Autores");
			Leer.mensaje("0. Salir");
			opcion = Leer.pedirEntero("");
			menu(opcion, autores, libros);
		}
	}

	private static void menu(int opcion, Autor[] autores, Libro[] libros) {
		switch (opcion) {
		case 1:
			crearLibro(autores, libros);
			break;
		case 2:
			modificarAutor(autores, libros);
			break;
		case 3:
			modificarLibro(autores, libros);
			break;
		case 4:
			mostrar_libros(libros);
			break;
		case 5:
			mostrar_Autores(autores);
			break;
		default:
			break;
		}
	}

	private static void crearLibro(Autor[] autores, Libro[] libros) {
		Scanner teclado = new Scanner(System.in);
		int contador, contador2 = 1;
		Boolean encontrado = true;
		contador = Leer.pedirEntero("Cuantos libros desea crear?");
		Autor autorNew = null;
		while (contador != 0) {
			String nombreLibro = Leer.pedirCadena("Cual es el nombre del libro " + contador2);
			Leer.mensaje("A continuacion se mostraran los autores que se pueden seleccionar para su libro");
			for (int i = 0; i < autores.length; i++) {
				if (autores[i] == null) {
					break;
				}
				Leer.mensaje(autores[i].getNumero() + ". " + autores[i].getNombre());
			}
			Leer.mensaje("000. Crear un nuevo autor");
			String numero = Leer.pedirCadena("");
			if (numero.equals("000")) {
				autorNew = crearNuevoAutor(autores);
			} else {
				encontrado = false;
				for (int i = 0; i < autores.length; i++) {
					if (autores[i] == null) {
						break;
					}
					if (numero.equals(autores[i].getNumero())) {
						autorNew = autores[i];
						encontrado = true;
						break;
					}
				}
				if (!encontrado) {
					Leer.mensaje("Lo sentimos, el codigo que ha introducido no existe");
					return;
				}
			}
			if (encontrado) {
				Double preciolibro = Leer.pedirDecimal("Cual es el precio del libro " + contador2);
				Integer cantidadLibro = Leer.pedirEntero("De cuanto es el stock?");

				libros[Libro.getSiguiente() - 1] = new Libro(nombreLibro, autorNew, preciolibro, cantidadLibro);
				contador--;
			}
			contador2++;
		}
	}

	private static void modificarAutor(Autor[] autores, Libro[] libros) {
		Scanner teclado = new Scanner(System.in);
		String texto = "";
		String codigo = "";
		Integer numer = 0;
		Boolean encontrado = false;
		Integer opci = Leer.pedirEntero(
				"Que desea realizar?\n" + "1. Crear nuevo autor\n" + "2. Modificar Autor\n" + "3. Eliminar Autor");
		switch (opci) {
		case 1:
			autores[Autor.getSiguiente() - 1] = crearNuevoAutor(autores);
			break;
		case 2:
			Leer.mensaje("Que autor desea modificar?");
			mostrar_Autores(autores);
			codigo = Leer.pedirCadena("");
			numer = 0;
			encontrado = false;
			for (int i = 0; i < autores.length; i++) {
				if (autores[i] == null) {
					break;
				}
				if (codigo.equals(autores[i].getNumero())) {
					encontrado = true;
					numer = i;
					break;
				}
			}
			if (!encontrado) {
				Leer.mensaje("Autor no encontrado");
				return;
			}
			opci = Leer.pedirEntero("Que desea modificar?\n" + "1. Nombre del autor\n" + "2. Email del autor\n"
					+ "3. Fecha del autor\n" + "4. Todo");

			switch (opci) {
			case 1:
				modificarnombreAutor(autores, numer);
				break;
			case 2:
				modificaremailAutor(autores, numer);
				break;
			case 3:
				modificarfechaAutor(autores, numer);
				break;
			case 4:
				modificarnombreAutor(autores, numer);
				modificaremailAutor(autores, numer);
				modificarfechaAutor(autores, numer);
				break;
			default:
				break;
			}
			break;
		case 3:
			Leer.mensaje("Que autor desea eliminar?");
			mostrar_Autores(autores);
			codigo = Leer.pedirCadena("");
			numer = 0;
			encontrado = false;
			for (int i = 0; i < autores.length; i++) {
				if (autores[i] == null) {
					break;
				}
				if (codigo.equals(autores[i].getNumero())) {
					encontrado = true;
					numer = i;
					break;
				}
			}
			if (!encontrado) {
				Leer.mensaje("Autor no encontrado");
				return;
			}
			for (int i = 0; i < libros.length; i++) {
				if (libros[i]==null) {
					break;
				}
				libros[i].eliminarAutor(autores[numer]);
				
			}
			Leer.mensaje("Se ha eliminado al autor " + codigo);
			autores[numer] = null;
			for (int i = numer; i < autores.length - 1; i++) {
				if (autores[i] == null) {
					autores[i] = autores[i + 1];
					autores[i + 1] = null;
				}
			}
			break;
		default:
			Leer.mensaje("Opcion no valida");
			break;
		}
	}

	private static void modificarfechaAutor(Autor[] autores, Integer numer) {
		Fecha fechas=new Fecha();
		Leer.mensaje("Que nueva Fecha desea darle al autor ");
		autores[numer].modificarfecha(fechas.verificadorFecha());
	}

	private static void modificaremailAutor(Autor[] autores, Integer numer) {
		String texto;
		texto = Leer.pedirCadena("Que Email desea darle al autor ");
		autores[numer].modificaremail(texto);
	}

	private static void modificarnombreAutor(Autor[] autores, Integer numer) {
		String texto;
		texto = Leer.pedirCadena("Que Nombre desea darle al autor ");
		autores[numer].modificarnombre(texto);
	}

	private static void modificarLibro(Autor[] autores, Libro[] libros) {
		Leer.mensaje("Que libro desea modificar?");
		mostrar_libros(libros);
		String opcion = Leer.pedirCadena("");
		Integer num = 0;
		Boolean encontrado = false;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] == null) {
				break;
			}
			if (opcion.equals(libros[i].getNumero())) {
				encontrado = true;
				num = i;
				break;
			}
		}
		if (!encontrado) {
			Leer.mensaje("Lo sentimos, ese libro no esta");
			return;
		}
		Leer.mensaje("Que desea modificar?");
		Leer.mensaje("1. Titulo del libro");
		Leer.mensaje("2. Sus autores");
		Leer.mensaje("3. Su precio");
		Leer.mensaje("4. Su cantidad");
		Leer.mensaje("5. Todo");
		Leer.mensaje("6. Eliminar");
		Leer.mensaje("0. Nada (Le he dado sin querer :P)");
		opcion = Leer.pedirCadena("");
		menu_MOD_LIB(libros, opcion, num, autores);
	}

	private static void menu_MOD_LIB(Libro[] libros, String opcion, Integer num, Autor[] autores){
		switch (opcion) {
		case "1":
			Modificartitulodelibro(libros, num);
			break;
		case "2":
			ModificarAutoresLibros(libros, num, autores);
			break;
		case "3":
			ModificarPrecioLibros(libros, num);
			break;
		case "4":
			ModificarCantidadLibros(libros, num);
			break;
		case "5":
			Modificartitulodelibro(libros, num);
			ModificarAutoresLibros(libros, num, autores);
			ModificarPrecioLibros(libros, num);
			ModificarCantidadLibros(libros, num);
			break;
		case "6":
			EliminarLibro(libros, num);
			break;
		default:
			break;
		}

	}
	
	private static void EliminarLibro(Libro[] libros, Integer num){
		Leer.mensaje("Se ha elimindao el libro "+libros[num].getTitulo());
		libros[num]=null;
		for (int i = num; i < libros.length-1; i++) {
			libros[i]=libros[i+1];
		}
		Libro.setSiguiente(Libro.getSiguiente()-1);
	}
	
	private static void ModificarCantidadLibros(Libro[] libros, Integer num) {
		Integer nuevaCant = 0;
		nuevaCant = Leer.pedirEntero("De cuanta cantidad sera el Stock del libro" + libros[num].getNumero());
		libros[num].modificarlibrocantidad(nuevaCant);
	}

	private static void ModificarPrecioLibros(Libro[] libros, Integer num) {
		Double Newprecio = 0.0;
		Newprecio=Leer.pedirDecimal("De cuanto sera el nuevo precio?");
		libros[num].modificarlibroprecio(Newprecio);
	}

	private static void ModificarAutoresLibros(Libro[] libros, Integer num, Autor[] autores) {
		String opcion;
		opcion = Leer.pedirCadena("Que desea realizar al autor/es? \n001. Añadir un nuevo autor al libro \n"
				+ "002. Eliminar un autor del libro");
		Boolean encontrado = false;
		Integer numAut=0;
		if (opcion.equals("001")) {
			Leer.mensaje("Que autor desea añadir?");
			mostrar_Autores(autores);
			String nume=Leer.pedirCadena("");
			for (int i = 0; i < autores.length; i++) {
				if (autores[i]==null) {
					break;
				}
				if (nume.equals(autores[i].getNumero())) {
					numAut = i;
					encontrado = true;
					break;
				}
			}
			if (!encontrado) {
				Leer.mensaje("No se ha encontrado ese autor");
				return;
			}
		}
		if (!(opcion.equals("001")||opcion.equals("002"))) {
			return;
		}
		libros[num].modificarlibroautores(opcion, autores[numAut]);
	}

	private static void Modificartitulodelibro(Libro[] libros, Integer num) {
		String opcion;
		opcion = Leer.pedirCadena("Que nuevo titulo le introduces al libro " + libros[num].getNumero());
		libros[num].modificarlibrotitulo(opcion);
	}

	private static void mostrar_Autores(Autor[] autores) {
		for (int i = 0; i < autores.length; i++) {
			if (autores[i] == null) {
				break;
			}
			Leer.mensaje(autores[i].toString());
		}
	}

	private static void mostrar_libros(Libro[] libros) {
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] == null) {
				break;
			}
			Leer.mensaje(libros[i].toString());
		}
	}
	private static Autor crearNuevoAutor(Autor[] autores) {
		Fecha fechas=new Fecha();
		Boolean testEmail=false;
		String email="";
		Autor autorNew;
		String nombreAutor = Leer.pedirCadena("Cual es el nombre del autor?");
		do{
		email = Leer.pedirCadena("Cual es el email del autor?");
		testEmail=VerificadorEmail(email);
		}while(!testEmail);
		String sexo = Leer.pedirCadena("Es masculino(m) o femenino(f)?");
		while (!(sexo.equals("m") || sexo.equals("f") || sexo.equals("M") || sexo.equals("F"))) {
			Leer.mensaje("Por favor ponga una M o una F");
			sexo = Leer.pedirCadena("");
		}
		Leer.mensaje("Cual es su fecha de nacimiento?");
		String fechanacimiento = fechas.verificadorFecha();;
		autores[Autor.getSiguiente() - 1] = new Autor(nombreAutor, email, sexo.charAt(0), fechanacimiento);
		autorNew = autores[Autor.getSiguiente() - 2];
		return autorNew;
		}
	
	private static boolean VerificadorEmail(String email) {
		int at = 0, puntos = 0;
		int error = 0;
		String partelocal, dominio, aceptadas = "zxcvbnmasdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP1234567890.-_";
		String correo = email;
		for (int i = 0; i < correo.length(); i++) { // Recorremos todo el string para comprobar existe un sólo '@'
			if (correo.charAt(i) == '@') {
				at++;
			}
		}
		if (at != 1 || correo.indexOf("@") == 0 || correo.indexOf("@") == correo.length() - 1) {
			error = 1;
		} else { // Cuando solo hay un '@'
			partelocal = correo.substring(0, correo.indexOf("@"));
			dominio = correo.substring(correo.indexOf("@") + 1);
			for (int i = 0; i < partelocal.length(); i++) {
				if (aceptadas.indexOf(partelocal.charAt(i)) == -1) { // Si contiene puntos seguidos o carácteres no válidos
					error = 1;
				}
			}
			if (partelocal.contains("..") || dominio.contains("_") || dominio.contains("..")) {
				error = 1;
			}
			for (int i = 0; i < partelocal.length(); i++) {
				if (aceptadas.indexOf(partelocal.charAt(i)) == -1 || partelocal.charAt(0) == '.'
						|| correo.charAt(correo.indexOf("@") - 1) == '.') { // Verificamos
																			// errores
					error = 1;
				}
			}
			for (int i = 0; i < dominio.length(); i++) {
				if (aceptadas.indexOf(dominio.charAt(i)) == -1 || dominio.charAt(0) == '.'
						|| dominio.charAt(dominio.length() - 1) == '.') { // Verificamos
																			// errores
					error = 1;
				}
			}
		}
		if (error == 1) {
			System.out.println("Formato incorrecto");
			return false;
		} else {
			System.out.println("Formato correcto");
			return true;
		}

	}

	private static void base_datos(Autor[] autores, Libro[] libros) {
		autores[Autor.getSiguiente() - 1] = new Autor("Adrian", "adrian@gmail.com", 'm', "15/04/1999");
		autores[Autor.getSiguiente() - 1] = new Autor("Alejanro", "alejandro@gmail.com", 'm', "20/04/1997");
		autores[Autor.getSiguiente() - 1] = new Autor("Alex", "aledeac@gmail.com", 'm', "26/12/1999");
		libros[Libro.getSiguiente() - 1] = new Libro("En busca del Jungla perdido", autores[0], 45.00, 15);
		libros[Libro.getSiguiente() - 1] = new Libro("La historia de PIPO", autores[1], 15.00, 20);
		libros[Libro.getSiguiente() - 1] = new Libro("Como manquear en el LOL", autores[2], 45.00, 15);
	}
}