package creational.factorymethod;

public class LavadoraCargaSuperiorFactory extends LavadoraFactory {

	@Override
	protected Lavadora creaLavadora() {
		return new LavadoraCargaSuperior();
	}

}
