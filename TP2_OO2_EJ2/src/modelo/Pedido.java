package modelo;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private final List<Plato> platos;
    private final List<Bebida> bebidas;
    private final Registro registro;

    public Pedido(List<Plato> platos, List<Bebida> bebidas, Registro registro) {
        this.platos = platos;
        this.bebidas = bebidas;
        this.registro = registro;
    }

    public float pedirCuenta(Tarjeta tarjeta, int porcentajePropina) {
        float total = calcularTotal();
        float cuenta = tarjeta.calcularCosto(total, 0, porcentajePropina);
        String texto = LocalDate.now().toString() + " || " + cuenta; 
        this.registro.registrar(texto);
        return cuenta;
    }

    private float calcularTotal() {
        float total = 0;
        for (Plato plato : platos) {
            total += plato.getPrecio();
        }
        for (Bebida bebida : bebidas) {
            total += bebida.getPrecio();
        }
        return total;
    }
}
    
   

