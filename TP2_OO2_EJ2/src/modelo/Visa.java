package modelo;

public class Visa extends Tarjeta {
	
	public Visa(int descuento) {
        super(descuento);
    }
    
    @Override
    public float aplicarDescuento(float precioPlatos, float precioBebidas) {
        return precioBebidas * ((float) descuentoPorcentaje / 100);
    }
}
