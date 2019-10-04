package ud.behavior.iterator;

public class Comercial {
ClienteFija clienteFija;
ClienteMovil clienteMovil;
/**
 * @param clienteFija
 * @param clienteMovil
 */
public Comercial(ClienteFija clienteFija, ClienteMovil clienteMovil) {
	super();
	this.clienteFija = clienteFija;
	this.clienteMovil = clienteMovil;
}
public void printClientes() {
	Iterador fijaIterador = clienteFija.creaIterador();
	Iterador movilIterador = clienteMovil.creaIterador();
	System.out.println("-------  Clientes Telefonia Fija ----------- ");
	printClientes(fijaIterador);
	System.out.println("-------  Clientes Telefonia Movil ----------- ");
	printClientes(movilIterador);
	
}
private void printClientes(Iterador iterador) {
	while(iterador.hasNext()) {
		ClienteTelefonia clienteTelefonia = (ClienteTelefonia)iterador.next();
		System.out.println("Nombre "+clienteTelefonia.getNombre()+", ");
		System.out.println("Telefono "+clienteTelefonia.getNumero()+", ");
		System.out.println("Pago mensual "+clienteTelefonia.getPagoMes()+", ");
	}
}
}
