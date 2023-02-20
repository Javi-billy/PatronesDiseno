package creational.abstractfactory;

public class RespuestasEn implements Respuestas {

	@Override
	public String responder(String respuesta) {		
		return "Traducido al ingles "+respuesta;
	}

	

}
