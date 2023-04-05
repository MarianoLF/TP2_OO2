package modelo;

public abstract class Tarjeta {
	 protected int descuentoPorcentaje;

	    Tarjeta(int descuentoPorcentaje) {
	        this.descuentoPorcentaje = descuentoPorcentaje;
	    }

	    public Tarjeta() {
	        this.descuentoPorcentaje = 0;
	    }

	    public float calcularCosto(float precioPlatos, float precioBebidas, int porcentajePropina) {
	        float precioTotal = precioPlatos + precioBebidas;
	        float descuento = aplicarDescuento(precioPlatos, precioBebidas);
	        float propina = precioTotal * ((float) porcentajePropina / 100);
	        precioTotal = precioTotal - descuento + propina;
	        return precioTotal;
	    }

	    public float aplicarDescuento(float precioPlatos, float precioBebidas) {
	        return 0;
	    }
}