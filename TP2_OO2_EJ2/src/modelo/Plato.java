package modelo;

public class Plato {
	public int precio;
	public String nombrePlato;
	
	public Plato (int precio, String nombrePlato) {
		this.precio = precio;
		this.nombrePlato = nombrePlato;
	}

	public String getPlato () {
		return this.nombrePlato;
	}
	public float getPrecio() {
		return this.precio;
	}

}
