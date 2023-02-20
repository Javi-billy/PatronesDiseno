package behavioral.strategy;

public class IamACat implements AnimalStrategy {

	@Override
	public void doStuff() {
		System.out.println("Soy un gato");
		
	}

	@Override
	public StrategyType getType() {
		return StrategyType.CAT;
	}

	
}
