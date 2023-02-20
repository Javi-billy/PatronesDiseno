package behavioral.strategy;

import java.util.HashSet;
import java.util.Set;

public class AppMain {

	
	
	public static void main(String[] args) {
		
		Set<AnimalStrategy> animalStrategy = new HashSet<>();
		animalStrategy.add(new IamACat());
		animalStrategy.add(new IamADog());
		
		StrategyFactory strategyFactory = new StrategyFactory(animalStrategy);

		String type = "dog";
		AnimalStrategy animal;
		if (type.equalsIgnoreCase("cat")) {
			animal = strategyFactory.findAnimalStrategy(StrategyType.CAT);			
		} else {
			animal = strategyFactory.findAnimalStrategy(StrategyType.DOG);
		}		
		animal.doStuff();
	}

}
