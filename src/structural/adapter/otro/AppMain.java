package structural.adapter.otro;

public class AppMain {

	public static void main(String[] args) {

		AgujeroRedondo agujero = new AgujeroRedondo(5); 
		PiezaRedonda pieza = new PiezaRedonda(5);
		
		if (agujero.encajar(pieza)) { 
			System.out.println("encaja");
		} else {
			System.out.println("NO encaja");
		}
		
		PiezaCuadrada cuadrado = new PiezaCuadrada(20);
		PiezaCuadradaAdapter adapter = new PiezaCuadradaAdapter(cuadrado);
	
		if (agujero.encajar(adapter)) {
			System.out.println("encaja");
		} else {
			System.out.println("NO encaja");
		}
	}

}
