package structural.adapter.otro;

public class PiezaCuadrada {

	private double tamanio;

    public PiezaCuadrada(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return tamanio;
    }

    public double getCuadrado() {
        double result;
        result = Math.pow(this.tamanio, 2);
        return result;
    }
}
