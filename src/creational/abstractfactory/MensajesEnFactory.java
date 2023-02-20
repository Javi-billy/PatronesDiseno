package creational.abstractfactory;

public class MensajesEnFactory implements MensajesAbstractFactory {

	@Override
	public Preguntas getPreguntas() {
		return new PreguntasEn();
	}

	@Override
	public Saludos getSaludos() {
		return new SaludosEn();
	}

	@Override
	public Respuestas getRespuesta() {
		return new RespuestasEn();
	}

}
