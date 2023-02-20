package creational.factorymethod.otro;

public class CamionFactory extends VehiculoFactory {

	@Override
	protected Vehiculo crea() {		
		return new Camion();
	}

	
}
