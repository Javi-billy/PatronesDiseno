package structural.decorator.otro;

public class AppMain {

	public static void main(String[] args) {
		ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
		System.out.println(tree1.decorate());
		
		ChristmasTree tree2 = new BubbleLights(new ChristmasTreeImpl());
		System.out.println(tree2.decorate());

	}

}
