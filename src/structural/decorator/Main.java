package structural.decorator;

import java.util.List;

public class Main {

	private static Logger logger = new Logger();
	private static BaseDatos bbddMemoria = new BaseDatosMemoria();
	
	private static BaseDatos bbdd;
	
	public static void main(String[] args) {
		bbdd = new LoggerDecorator(logger, bbddMemoria);
		
		// logger_decorator
		System.out.println(logger.obtener().contains("inserta entrada"));
		bbdd.inserta("entrada");
		
		System.out.println(bbddMemoria.registros().contains("entrada"));
		System.out.println(logger.obtener().contains("inserta entrada"));
		
		List<String> registros = bbdd.registros();
		System.out.println(registros.contains("entrada"));
		
		System.out.println(logger.obtener().contains("lectura"));
	}

}
