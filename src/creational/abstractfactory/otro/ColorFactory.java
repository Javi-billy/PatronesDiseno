package creational.abstractfactory.otro;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String type) {
		if ("White".equals(type))
			return new White();
		else if ("Black".equals(type))
			return new Black();		
		return null;
	}

}
