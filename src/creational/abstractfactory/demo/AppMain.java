package creational.abstractfactory.demo;

public class AppMain {

	public static void main(String[] args) {
		//Application app;
		//GUIFactory gf = new 
		
        GUIFactory factory;
        String osName = "mac";
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        Button b = factory.createButton();
        Checkbox c = factory.createCheckbox();
        c.paint();
        b.paint();

	}

}
