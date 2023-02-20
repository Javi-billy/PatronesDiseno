package structural.proxy;

public class Main {

	public static void main(String[] args) {

		Cuenta cuentaUna = new CuentaNueva("Javi");
		cuentaUna.movimiento(1000);
		System.out.println(cuentaUna.getCliente() +" "+cuentaUna.getCantidad());
		
		cuentaUna.movimiento(-500);
		System.out.println(cuentaUna.getCantidad());
		
		cuentaUna.movimiento(-1500);
		System.out.println(cuentaUna.getCantidad());
		
		/*
		Cuenta cuentaNormal = new CuentaNormal("normal");
		cuentaNormal.movimiento(1000);
		System.out.println(cuentaNueva.getCantidad());
		
		cuentaNormal.movimiento(-500);
		System.out.println(cuentaNormal.getCantidad());*/

	}

}
