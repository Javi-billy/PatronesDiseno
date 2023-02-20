package creational.abstractfactory;

public class RespuestasEs implements Respuestas {

	@Override
	public String responder(String respuesta) {		
		return "Traducido al español "+respuesta;
	}

	

}
