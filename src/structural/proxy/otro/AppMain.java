package structural.proxy.otro;

public class AppMain {

	public static void main(String[] args) {

		ExpensiveObject object = new ExpensiveObjectProxy();
        Cuenta c1 = object.process();
        System.out.println(c1.getCantidad());
        c1 = object.process();        
        System.out.println(c1.getCantidad());
	}

}
