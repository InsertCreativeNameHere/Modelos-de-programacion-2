package ud.behavior.iterator;

public class ClientesTelefoniaIterador implements Iterador {
	ClienteTelefonia[] item;
	int posicion=0;
	
	
	public ClientesTelefoniaIterador(ClienteTelefonia[] item) {
		
		this.item = item;
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(posicion>=item.length||item[posicion]==null) {
		return false;
		}else {
		return true;
	}
		}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		ClienteTelefonia clienteTelefonia = item[posicion];
		posicion=posicion+1;
			
		return clienteTelefonia;
	}

}
