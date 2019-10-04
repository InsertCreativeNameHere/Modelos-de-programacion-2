package ud.behavior.iterator;

public class ClienteFija {
static final int MAX_Item=6;
int numeroDeItem=0;
ClienteTelefonia[] clientesTelefonia;
public ClienteFija() {
	clientesTelefonia = new ClienteTelefonia[MAX_Item];
	addItem("Karen Perez",1789452,true,5.4);
	addItem("Alan Brito",1273459,true,8.4);
	addItem("Rosa Gomez",1085673,true,9.4);
	addItem("Elver Martinez",1127658,true,6.4);
	addItem("Nancy Roso",1456789,true,9.4);
}

public void addItem (String nombre, int numero, boolean postPago, double pagoMes) {
	ClienteTelefonia clienteTelefonia = new ClienteTelefonia(nombre, numero, postPago, pagoMes);
	if(numeroDeItem>=MAX_Item) {
		System.err.println("La capacidad máxima de clientes está cubierta ");
		}else {
			clientesTelefonia[numeroDeItem]= clienteTelefonia;
			numeroDeItem=numeroDeItem+1;
		}	
}

public ClienteTelefonia[] getClientesTelefonia() {
	return clientesTelefonia;
}
public Iterador creaIterador() {
	return new ClienteFijaIterador(clientesTelefonia);
}
}
