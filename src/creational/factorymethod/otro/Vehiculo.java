package creational.factorymethod.otro;

public abstract class Vehiculo {

	protected boolean tieneRuedas;
	
	protected boolean tieneMotor;
	
	protected String tipo;
	
	public void ponerRuedas() {
		tieneRuedas = true;
	}
	
	public void ponerMotor() {
		tieneMotor = true;
	}
	
	public void quitarRuedas() {
		tieneRuedas = false;
	}
	
	public void quitarMotor() {
		tieneMotor = false;
	}
	
	public void mostrarVehiculo() {
		System.out.println("Esto es un "+this.tipo);
	}
}
