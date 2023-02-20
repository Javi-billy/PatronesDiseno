package behavioral.strategy;

public class IamADog implements AnimalStrategy {

	@Override
	public void doStuff() {
		System.out.println("Soy un perro");
		
	}

	@Override
	public StrategyType getType() {		
		return StrategyType.DOG;
	}

	
}
