package creational.abstractfactory;

// factory para preguntas y saludos en distintos idiomas
public interface MensajesAbstractFactory {

	Preguntas getPreguntas();
	
	Saludos getSaludos();
	
	Respuestas getRespuesta();
}
