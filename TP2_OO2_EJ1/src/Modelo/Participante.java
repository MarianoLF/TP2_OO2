package Modelo;

public class Participante {
	private String nombre;
	private int puntos;
	private static int auxID = 1;
	private final int ID;
	
	public Participante (String nombre,int puntos) {
		this.ID = auxID;
		auxID ++;
		this.nombre = nombre;
		this.puntos = puntos;
	}
	public void sumarPuntos(int cantidad) {
        puntos += cantidad;
    }
    public int getPuntos() {
        return puntos;
    }
	public String getNombre() {
		return nombre;
	}
	public int getID () {
		return this.ID;
	}

	
   }

