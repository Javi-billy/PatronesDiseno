package creational.builder;

public class Main {
	
	public static void main(String[] args) {
		
		Persona madre = new Persona.Builder("Maria")
                .setMunicipio("Selva")
                .setMayor(37)
                .setLugarTrabajo("Google")
                .build();

		Persona hijo = new Persona.Builder("Pedro")
                .setMenor(4)
                .setColegio("Colegio de Selva")
                .build();
		
		// esta codigo NO debe compilar
		
		/*Persona mal = new Persona.Builder("Luisa")
				    .setMayor(11)
				    .setColegio("Colegio de Villa Arriba")
				    .build();*/
        
	}

}
