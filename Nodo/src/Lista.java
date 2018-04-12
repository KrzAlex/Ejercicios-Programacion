/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Lista {
	Nodo lista;

	public Nodo getLista() {
		return lista;
	}

	public void setLista(Nodo lista) {
		this.lista = lista;
	}

	
	public Lista() {
		this.lista = null;
	}
	
	public void añadirnodo(Integer valor){
		Nodo nodo=new Nodo(valor);
		if (this.lista==null) {
			this.lista=nodo;
			return;
		}
		Nodo aux=this.lista;
		while (aux.getsiguiente()!=null) {
			aux=aux.getsiguiente();
		}			
		aux.setsiguiente(nodo);
		
	}
	
	public String listar(){
		return lista.toString();
	}
	
	public String borrarnodo(Integer valor){
		Nodo aux=this.lista;
		Nodo aux1=aux.getsiguiente();
		if (buscadorNodo(valor)) {
			while (aux.getsiguiente()!=null) {
			if (aux1.getValor()==valor) {
				aux.setsiguiente(aux1.getsiguiente());				
				break;
			}
			aux=aux.getsiguiente();
			aux1=aux.getsiguiente();
			}
			
			return "El valor "+valor+" se ha borrado exitosamente";
		} else {
			return "Ese valor es inexistente";
		}
		
	}
	
	public Boolean buscadorNodo(Integer valor){
		Boolean encontrado=false;
		Nodo aux=this.lista;
		while (aux.getsiguiente()!=null) {
			if (aux.getValor()==valor) {
				encontrado=true;
				break;
			}				
			aux=aux.getsiguiente();
		}
		return encontrado;
	}
	
	
	
	
	
}
