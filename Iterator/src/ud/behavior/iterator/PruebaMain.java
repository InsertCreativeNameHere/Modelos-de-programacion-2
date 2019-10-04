package ud.behavior.iterator;

public class PruebaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClienteFija clienteFija = new ClienteFija();
ClienteMovil clienteMovil = new ClienteMovil();
Comercial comercial= new Comercial(clienteFija, clienteMovil);
comercial.printClientes();
	
	}

}
