package creational.abstractfactory;

public class Main {

	public static void main(String[] args) {

		MensajesAbstractFactory factoryEs = new MensajesEsFactory();
		
		System.out.println(factoryEs.getRespuesta().responder("pregunta"));

		Saludos s = factoryEs.getSaludos();
		
		System.out.println(s.buenasTardes());
		System.out.println(s.buenosDias());
		
		
		MensajesAbstractFactory factoryEn = new MensajesEnFactory();
		
		System.out.println(factoryEn.getRespuesta().responder("ask"));

		Saludos e = factoryEn.getSaludos();
		
		System.out.println(e.buenasTardes());
		System.out.println(e.buenosDias());
	}

	
	/*
	 * MensajesAbstractFactory factory = new MensajesEsFactory(); 
		
		Preguntas preguntas = factory.getPreguntas();
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		
		Saludos saludos = factory.getSaludos();
		
		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	 */
}
