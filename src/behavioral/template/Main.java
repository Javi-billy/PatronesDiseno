package behavioral.template;

public class Main {

	private static Solicitud solicitud_edad_9 = new Solicitud("sol 10", 9, 40);
	private static Solicitud solicitud_edad_15_ligero = new Solicitud("sol 15 ligero", 15, 40);
	private static Solicitud solicitud_edad_15_pesado = new Solicitud("sol 15 pesado", 15, 70);
	
	private static Polideportivo polideportivo = new Polideportivo();
	private static InscripcionLucha lucha = new InscripcionLucha(polideportivo);
	private static InscripcionTenis tenis = new InscripcionTenis(polideportivo);
	
	public static void main(String[] args) {

		System.out.println(tenis.apunta(solicitud_edad_9));
		System.out.println(tenis.apunta(solicitud_edad_15_ligero));
		System.out.println(tenis.apunta(solicitud_edad_15_pesado));
		System.out.println(tenis.getTorneo().getAceptadas().size());
		
		
		System.out.println(lucha.apunta(solicitud_edad_9));
		System.out.println(lucha.apunta(solicitud_edad_15_ligero));
		System.out.println(lucha.apunta(solicitud_edad_15_pesado));
		System.out.println(lucha.getTorneo().getAceptadas().size());
		
		for (int i = 0; i < 4; i++) {
			System.out.println(tenis.apunta(new Solicitud("participante " + 1, 15, 60)));
		}
		
		System.out.println("Ya hay 4 apuntados " + tenis.apunta(solicitud_edad_15_ligero));
		
		Integer horasReservadas = polideportivo.getReservas().get(tenis.getTorneo());
		
		System.out.println("hay reserva hecha " + horasReservadas);
		System.out.println("la reserva es de 8 horas " + horasReservadas.intValue());
	}

}
