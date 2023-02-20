package structural.adapter.otro;

public class PiezaCuadradaAdapter extends PiezaRedonda {

	private PiezaCuadrada pieza;

    public PiezaCuadradaAdapter(PiezaCuadrada pieza) {
        this.pieza = pieza;
    }

    @Override
    public double getRadio() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((pieza.getTamanio() / 2), 2) * 2));
        return result;
    }
}
