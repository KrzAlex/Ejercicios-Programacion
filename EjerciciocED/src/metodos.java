
public class metodos {

	public int metodo(boolean a, boolean b) {
		int ret = 0;
		if (a && b) {
			ret = 1;
		} else {
			ret = 2;
		}
		return ret;
	}

	int contar_letra(String cadena, String letra) {
		int contador, n, longitud;
		n = 0;
		contador = 0;
		longitud = cadena.length();
		if (longitud > 0) {
			do {
				if (cadena.substring(contador, contador + 1).equals(letra)) {
					n++;
				}
				contador++;
				longitud--;
			} while (longitud > 0);
		}
		return n;
	}

	Boolean cod_Area(String numero) {
		Boolean correcto = false;
		for (int i = 0; i < numero.length(); i++) {
			if ("0123456789".indexOf(numero.substring(i, i + 1)) != -1) {
				correcto = true;
			} else {
				correcto = false;
				break;
			}
		}
		if (correcto) {
			int numerocorrecto = Integer.parseInt(numero);
			if (200 <= numerocorrecto && numerocorrecto <= 999) {
			}else {
				correcto=false;
			}
		}
		return correcto;
	}

	Boolean cont_caracteres(String cadena){
		Boolean correcto = false;
		if(cadena.length()==6){
			correcto=true;
		}
		return correcto;
	}
	
	Boolean verificador(String cadena){
		Boolean correcto = false;
		cadena=cadena.toLowerCase();
		if(cadena.equals("cheque")||cadena.equals("depósito")||cadena.equals("pago factura")||cadena.equals("retirada de fondos")){
			correcto=true;
		}
		return correcto;
	}
	
	
	
	
}