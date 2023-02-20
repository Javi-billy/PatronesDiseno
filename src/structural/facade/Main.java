package structural.facade;

public class Main {

	private static String nombreCliente = "Antonia";
	private static String emailCliente = "antonia@email.com";
	
	public static void main(String[] args) {
		BBDD.INSTANCE.clear();
		
		ServicioConfiguracion configuracion = new ServicioConfiguracion();
		ServicioFidelizacion fidelizacion = new ServicioFidelizacion();
		ServicioComunicacion comunicacion = new ServicioComunicacion();

		fidelizacion.crearTarjeta(nombreCliente, ServicioFidelizacion.Tipo.BASICA);
		configuracion.addEmail(nombreCliente, emailCliente);
		PreferenciasComunicacion preferencias = new PreferenciasComunicacion(false, true, true);
		comunicacion.setPreferencias(nombreCliente, preferencias);
		
		compruebaInscripion();
		
		BBDD.INSTANCE.clear();
		
		new FacadeService().inscripcionExpress(nombreCliente, emailCliente);
		
		compruebaInscripion();

	}

	private static void compruebaInscripion() {
		/*assertEquals(BBDD.INSTANCE.getTarjeta(nombreCliente), ServicioFidelizacion.Tipo.BASICA);
		assertEquals(BBDD.INSTANCE.getEmail(nombreCliente), emailCliente);
		PreferenciasComunicacion preferencias = BBDD.INSTANCE.getPreferencias(nombreCliente);
		assertNotNull(preferencias);
		assertFalse("no recibe email diario", preferencias.isEmailDiario());
		assertTrue("recibe email semanal", preferencias.isEmailSemanal());
		assertTrue("recibe email html", preferencias.isEmailHtml());*/
	}
}
