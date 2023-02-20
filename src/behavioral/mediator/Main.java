package behavioral.mediator;

public class Main {

	private static Radio radio;
	private static Telefono telefono;
	private static Coche coche;
	
	public static void main(String[] args) {
		radio = new Radio();
		telefono = new Telefono();
		coche = new Coche();
		
		new Coordinador(telefono, coche, radio);
		
		// encender_apagar_coche
		System.out.println(radio.encendida());
		System.out.println(telefono.musicaEncendida());
		
		telefono.enciendeMusica();
		System.out.println(telefono.musicaEncendida());
		
		coche.enciende();
		
		System.out.println(radio.encendida());
		System.out.println(telefono.musicaEncendida());
	
		coche.apaga();
		System.out.println(radio.encendida());

		// suena telefono
		
		radio.enciende();
		System.out.println(radio.encendida());
		
		telefono.recibeLlamada();
		
		System.out.println(radio.encendida());
		
		// enciende radio 
		telefono.enciendeMusica();
		System.out.println(telefono.musicaEncendida());
		
		radio.enciende();
		
		System.out.println(telefono.musicaEncendida());
	}

}
