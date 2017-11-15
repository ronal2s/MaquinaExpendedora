package logical;

import java.io.IOException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dinero = 0, n=1;
		String productoAComprar="";
		Map<String, Integer> productos = new TreeMap<String, Integer>();
		productos.put("Cocacola", 100);
		productos.put("Seven up", 90);
		Maquina maquina = new Maquina(productos);
		
		
		System.out.print("Ingresa el dinero: ");
		dinero = teclado.nextInt();
		maquina.setDinero(dinero);

		//Mostrando los productos
		// Imprimimos el Map con un Iterador
		System.out.println("Productos:");
		for (Entry<String, Integer> p : productos.entrySet()) {
			System.out.println(n + " - Producto: " + p.getKey() + " Valor: " +p.getValue());
		}
		System.out.print("Ingresa el número de producto a comprar: ");
		n = teclado.nextInt();
		switch(n)
		{
		case 1: productoAComprar = "Cocacola"; break;
		case 2: productoAComprar = "Seven up"; break;
		}
		maquina.setArticulo(productoAComprar);
		maquina.run();
	}

}
