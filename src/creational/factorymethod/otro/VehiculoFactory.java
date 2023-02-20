package creational.factorymethod.otro;

public abstract class VehiculoFactory {

	public Vehiculo construye() {

		Vehiculo vehiculo = crea();

		vehiculo.ponerMotor();
		vehiculo.ponerRuedas();

		return vehiculo;
	}

	protected abstract Vehiculo crea();
}
