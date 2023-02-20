package behavioral.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StrategyFactory {

	private Map<StrategyType, AnimalStrategy> strategies = new HashMap<StrategyType, AnimalStrategy>();

	public StrategyFactory(Set<AnimalStrategy> animalStrategy) {
		createStrategy(animalStrategy);
	}

	public AnimalStrategy findAnimalStrategy(StrategyType strategyType) {
		return strategies.get(strategyType);
	}

	private void createStrategy(Set<AnimalStrategy> animalStrategy) {
		animalStrategy.forEach(strategy -> strategies.put(strategy.getType(), strategy));
	}
}
