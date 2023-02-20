package creational.abstractfactory.otro;

public class OtroMain {

	public static void main(String[] args) {
		
		AbstractFactory<?> af = FactoryProvider.getFactory("Color");
		
		Color c = (Color)af.create("White");
		
		af = FactoryProvider.getFactory("Animal");
		Animal a = (Animal)af.create("Dog");
		
		System.out.println(c.getColor()+" "+a.getAnimal()+" "+a.makeSound());
		
		//----------------------------------------------------------
		
		AbstractFactory<Color> cf = new ColorFactory();
		
		Color cb = cf.create("Black");				
		
		AbstractFactory<Animal> aff = new AnimalFactory();
		
		Animal duck = aff.create("Duck");
		
		System.out.println(cb.getColor()+" "+duck.getAnimal()+" "+duck.makeSound());
		
	}

}
