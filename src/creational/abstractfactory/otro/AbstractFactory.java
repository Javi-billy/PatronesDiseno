package creational.abstractfactory.otro;

public interface AbstractFactory<T> {

	T create(String type);
}
