package structural.proxy.otro;

public class ExpensiveObjectProxy implements ExpensiveObject {
	
	private static ExpensiveObject object;

	@Override
	public Cuenta process() {
		System.out.println("Proxy");
		if (object == null) {
			object = new ExpensiveObjectImpl();
		}
		return object.process();
	}

}
