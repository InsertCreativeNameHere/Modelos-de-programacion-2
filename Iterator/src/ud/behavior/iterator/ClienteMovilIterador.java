package ud.behavior.iterator;

import java.util.ArrayList;

public class ClienteMovilIterador implements Iterador{
	
	ArrayList<ClienteTelefonia> item ;
	int posicion=0;
	
	public ClienteMovilIterador(ArrayList item) {
		
		this.item = item;
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(posicion>=item.size()||item.get(posicion)==null) {
		return false;
		}else {
		return true;
	}
		}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		ClienteTelefonia clienteTelefonia = item.get(posicion);
		posicion=posicion+1;
			
		return clienteTelefonia;
	}

}
