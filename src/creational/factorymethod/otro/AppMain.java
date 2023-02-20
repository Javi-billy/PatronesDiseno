package creational.factorymethod.otro;

public class AppMain {

	public static void main(String[] args) {

		VehiculoFactory vehiculo = new CocheFactory();
		
		Vehiculo v = vehiculo.crea();
		v.ponerRuedas();
		
		v.mostrarVehiculo();

	}

}
