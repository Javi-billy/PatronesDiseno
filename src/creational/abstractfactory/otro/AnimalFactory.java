package creational.abstractfactory.otro;

public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String animalType) {
		if ("Dog".equals(animalType))
			return new Dog();
		else if ("Duck".equals(animalType))
			return new Duck();		
		return null;
	}

}
