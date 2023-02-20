package structural.proxy.otro;

public class ExpensiveObjectImpl implements ExpensiveObject {

	public Cuenta cuenta;
	
	public ExpensiveObjectImpl() {
		heavyInitialConfiguration();
	}

	@Override
	public Cuenta process() {		
		System.out.println("  processing complete original.");
		this.cuenta.setCantidad(1000);
		return this.cuenta;
	}

	private void heavyInitialConfiguration() {
		System.out.println("  Loading initial configuration..");
		this.cuenta = new Cuenta();
		cuenta.setCantidad(0);
		cuenta.setCliente("Cliente");
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
}
