package main;

import java.util.ArrayList;
import java.util.List;

import modelo.Bebida;
import modelo.Pedido;
import modelo.Plato;
import modelo.Tarjeta;
import modelo.Visa;
import persistencia.JdbcRegistro;

public class MainPedido {

	public static void main(String[] args) {
		Plato plato3 = new Plato (900, "Pizza");
		Bebida bebida1 = new Bebida (300, "Gaseosa");
		
		List <Plato> comidaPedida = new ArrayList <>();
		comidaPedida.add(plato3);
		List <Bebida> bebidaPedida = new ArrayList <> ();
		bebidaPedida.add(bebida1);
		
		Pedido nuevoPago = new Pedido (comidaPedida, bebidaPedida, new JdbcRegistro ("jdbc:mysql://127.0.0.1/tp2_oo2", "root", ""));
		Tarjeta tarjeta = new Visa (3);
		
		nuevoPago.pedirCuenta (tarjeta,0);

	}

}
