package creational.prototype;

import java.util.ArrayList;
import java.util.List;

import creational.prototype.Hamburguesa.Carne;
import creational.prototype.Hamburguesa.Extra;
import creational.prototype.Hamburguesa.Pan;
import creational.prototype.Hamburguesa.Size;

public class HamburguesaFactory {

	private Carne carne;
	private Size size;
	private Pan pan;
	private List<Extra> extras = new ArrayList<>();
	
	public Hamburguesa crea() {
		return new Hamburguesa(carne, size, pan, extras.toArray(new Extra[extras.size()]));
	}
	
	// El metodo from permite usar un "prototipo" de partida para nuestra nueva hamburguesa.
	// Fijaos que este metodo no devuele una Hamburguesa, sino una HamburguesaFactory para que aun
	// se pueda configurar la hamburguesa que crearemos
	public static HamburguesaFactory from (Hamburguesa plantilla) {
		HamburguesaFactory factory = new HamburguesaFactory();
		factory.carne = plantilla.getCarne();
		factory.pan = plantilla.getPan();
		factory.size = plantilla.getSize();
		factory.extras.addAll(plantilla.getExtras());
		return factory;
	}
	
	public HamburguesaFactory setCarne(Carne carne) {
		this.carne = carne;
		return this;
	}

	public HamburguesaFactory setSize(Size size) {
		this.size = size;
		return this;
	}

	public HamburguesaFactory setPan(Pan pan) {
		this.pan = pan;
		return this;
	}

	public HamburguesaFactory addExtra(Extra extra) {
		this.extras.add(extra);
		return this;
	}

	public HamburguesaFactory removeExtra(Extra extra) {
		this.extras.remove(extra);
		return this;
	}



	// -- hamburguesas de la carta
	public static Hamburguesa royal() {
		return new Hamburguesa ( Carne.VACUNO, Size.GRANDE, Pan.NORMAL, Extra.CEBOLLA, Extra.QUESO);
	}

	public static Hamburguesa king() {
		return new Hamburguesa ( Carne.VACUNO, Size.EXTRA_GRANDE, Pan.NORMAL, Extra.CEBOLLA, Extra.HUEVO);
	}


}
