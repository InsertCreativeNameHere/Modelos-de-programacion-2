package ud.behavior.iterator;

import java.util.ArrayList;

public class ClienteMovil {
static final int MAX_Item=6;
int numeroDeItem=0;
ArrayList clientesTelefonia;

/**
 * 
 */
public ClienteMovil() {
clientesTelefonia = new ArrayList();
addCliente("JosÈ Mora",321456789,true,35.4);
addCliente("Juan Roa",314887890,false,0.0);
addCliente("MarÌa PeÒa",35611789,true,18.9);
addCliente("Pame Lugo",456333789,true,32.0);
}
public void addCliente (String nombre, int numero, boolean postPago, double pagoMes) {
	ClienteTelefonia clienteTelefonia = new ClienteTelefonia(nombre, numero, postPago, pagoMes);
	if(numeroDeItem>=MAX_Item) {
		System.err.println("La capacidad m√°xima de clientes est√° cubierta ");
		}else {
			clientesTelefonia.add(clienteTelefonia);
			numeroDeItem=numeroDeItem+1;
		}		
}
public ArrayList getClientesTelefonia() {
	return clientesTelefonia;
}

public Iterador creaIterador() {
	return new ClienteMovilIterador(clientesTelefonia);
}

}
