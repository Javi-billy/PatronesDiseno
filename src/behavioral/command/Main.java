package behavioral.command;

public class Main {

	public static void main(String[] args) {
		TratamientoPedido tratamientoKO = new TratamientoPedidoInternacional(new PedidoInternacional("Mordor", 100));
		System.out.println(tratamientoKO.tratar());
		
		TratamientoPedido tratamientoOK = new TratamientoPedidoInternacional(new PedidoInternacional("Comarca", 100));
		System.out.println(tratamientoOK.tratar());
	}
}
