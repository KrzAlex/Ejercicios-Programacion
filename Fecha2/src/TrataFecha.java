import java.util.Arrays;

/**
 * 
 */

/**
 * @author yo
 *
 */
public class TrataFecha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha [] fechas= new Fecha[10];
		Fecha fecha=null;
		Integer dia;
		Integer mes;
		Integer anio;
		int opcion=-1;
		int numFechas=0;
		int pos1, pos2, dif;
		while (opcion!=0){
			Leer.mensaje("1.- Crear una fecha");
			Leer.mensaje("2.- Imprimir las fechas");
			Leer.mensaje("3.- Diferencia entre fechas");
			Leer.mensaje("4.- Sumar dias a una fecha");
			Leer.mensaje("5.- Escribir fecha en texto");
			Leer.mensaje("0.- Salir");
			opcion=Leer.pedirEntero("escoge opción");
			if(numFechas==0 && opcion >2){
				Leer.mensaje("No hay fechas en el vector");
				opcion=9;
			}
			
			switch(opcion){
			case 1:
				dia=Leer.pedirEntero("Día");
				mes=Leer.pedirEntero("Mes");
				anio=Leer.pedirEntero("Año");
				fecha=Fecha.getInstance(dia, mes , anio);
				if(fecha==null){
					Leer.mensaje("datos erróneos de fecha");
				}else{
					fechas[numFechas]=fecha;
					numFechas++;
				}
				break;
			case 2:
				Leer.mensaje(Arrays.toString(fechas));
				break;
			case 3:
				do
					pos1=Leer.pedirEntero("Primera fecha");
				while(pos1<0 || pos1>numFechas);
				do
					pos2=Leer.pedirEntero("Primera fecha");
				while(pos2<0 || pos2>numFechas);
				dif=fechas[pos1].difFechas(fechas[pos2]);
				Leer.mensaje("la diferencia en días entre "+fechas[pos1].toString()+ " y "+fechas[pos2].toString()+ " es de "+dif);
				break;
			case 4:
				do
					pos1=Leer.pedirEntero("Fecha");
				while(pos1<0 || pos1>numFechas);
				do
					pos2=Leer.pedirEntero("Días a sumar");
				while(pos2<0);
				fecha=fechas[pos1].sumaDias(pos2);
				Leer.mensaje("La fecha resultante es "+fecha.toString());
				break;
			case 5:
				do
					pos1=Leer.pedirEntero("Fecha");
				while(pos1<0 || pos1>numFechas);
				Leer.mensaje(fechas[pos1].fechaTexto());
				break;
			}
		}
	}
}
