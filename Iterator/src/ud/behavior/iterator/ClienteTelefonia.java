package ud.behavior.iterator;

public class ClienteTelefonia {
String nombre;
int numero;
boolean postPago;
double pagoMes;
/**
 * @param nombre
 * @param numero
 * @param postPago
 * @param pagoMes
 */
public ClienteTelefonia(String nombre, int numero, boolean postPago, double pagoMes) {
	//super();
	this.nombre = nombre;
	this.numero = numero;
	this.postPago = postPago;
	this.pagoMes = pagoMes;
}
public String getNombre() {
	return nombre;
}
public int getNumero() {
	return numero;
}
public boolean isPostPago() {
	return postPago;
}
public double getPagoMes() {
	return pagoMes;
}


}
