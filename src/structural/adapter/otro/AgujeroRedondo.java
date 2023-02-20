package structural.adapter.otro;

public class AgujeroRedondo {

	private double radio;

    public AgujeroRedondo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public boolean encajar(PiezaRedonda peg) {
        boolean result;
        result = (this.getRadio() >= peg.getRadio());
        return result;
    }
}
