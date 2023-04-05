package modelo;

public class ComarcaPlus extends Tarjeta {
	public ComarcaPlus(int descuento) {
        super(descuento);
    }
    
    @Override
    public float aplicarDescuento(float precioPlatos, float precioBebidas) {
        return (precioPlatos + precioBebidas) * ((float) descuentoPorcentaje / 100);
    }
}