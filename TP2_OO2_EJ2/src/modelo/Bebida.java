package modelo;

public class Bebida {
	public int precio;
	public String nombreBebida;
	
	public Bebida (int precio, String nombreBebida) {
		this.precio = precio;
		this.nombreBebida = nombreBebida;
	}
	
	public float getPrecio() {
		return precio;
	}

}
