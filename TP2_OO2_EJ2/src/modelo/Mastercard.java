package modelo;

public class Mastercard extends Tarjeta {
	
	 public Mastercard(int descuento) {
	        super(descuento);
	    }
	    
	    @Override
	    public float aplicarDescuento(float precioPlatos, float precioBebidas) {
	        return precioPlatos * ((float) descuentoPorcentaje / 100);
	    }
	}
