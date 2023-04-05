package main;

import modelo.Pedido;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Tarjeta;
import modelo.Visa;
import modelo.Bebida;
import modelo.Plato;
import persistencia.ArchivoTextoRegistro;

public class Main {

	public static void main(String[] args) {
		
			try {
				Plato plato3 = new Plato(900, "Pizza");
				Bebida bebida1 = new Bebida(300, "Gaseosa");
				
				List<Plato> comidaPedida = new ArrayList<>();
				comidaPedida.add(plato3);
				List<Bebida> bebidaPedida = new ArrayList<>();
				bebidaPedida.add(bebida1);
				
				Pedido nuevoPago = new Pedido(comidaPedida, bebidaPedida, new ArchivoTextoRegistro ("pruebaPedido"));
				
				Tarjeta tarjeta = new Visa(3);
				
				nuevoPago.pedirCuenta(tarjeta, 0);
			} catch (IOException e) {
			}
		}

}
