package creational.factorymethod;

public class Main {

	public static void main(String[] args) {
		LavadoraFactory factoryFrontal = new LavadoraCargaFrontalFactory();
		
		Lavadora l1 = factoryFrontal.crea();
		
		System.out.println(l1.tipoCarga);
		if (l1.tieneMandos) {
			System.out.println("tiene mandos");			
		} else {
			l1.ponerMandos();
		}
		l1.quitarMandos();
		if (l1.tieneMandos) {
			System.out.println("mandos puestos");
		}
		
		LavadoraFactory factorySuperior = new LavadoraCargaSuperiorFactory();
		Lavadora l2 = factorySuperior.crea();
		
		System.out.println(l2.tipoCarga);
		if (l2.tieneMandos) {
			System.out.println("tiene mandos");			
		} else {
			l2.ponerMandos();
		}
		l2.quitarMandos();
		if (l2.tieneMandos) {
			System.out.println("mandos puestos");
		}

	}

}
