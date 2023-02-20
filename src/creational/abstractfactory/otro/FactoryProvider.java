package creational.abstractfactory.otro;

public class FactoryProvider {

	public static AbstractFactory<?> getFactory(String choice) {
		if ("Animal".equals(choice)) {
			return new AnimalFactory();
		} else if ("Color".equals(choice)) {
			return new ColorFactory();
		}
		return null;
	}
}
