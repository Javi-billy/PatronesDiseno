package creational.abstractfactory.otro;

public class Dog implements Animal {

	@Override
	public String getAnimal() {
		return "Dog";
	}

	@Override
	public String makeSound() {
		return "Gua";
	}
	
	

}
