package structural.proxy;

public interface Cuenta {

	String getCliente();

	int getCantidad();

	void movimiento(int importe);

}