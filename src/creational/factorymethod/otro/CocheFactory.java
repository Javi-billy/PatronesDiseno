package creational.factorymethod.otro;

public class CocheFactory extends VehiculoFactory {

	@Override
	protected Vehiculo crea() {		
		return new Coche();
	}

	
}
