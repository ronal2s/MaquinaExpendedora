package logical;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Maquina extends Thread {
	private int dinero=0;
	private Map<String, Integer> articulos;
	private String articulo;
	private Reiniciar reiniciar = new Reiniciar();
	
	public Maquina(Map<String, Integer> articulos) {
		super();
		this.articulos = articulos;
	}

	
	
	public String getArticulo() {
		return articulo;
	}



	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}



	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	
	public Map<String, Integer> getArticulos() {
		return articulos;
	}

	public void setArticulos(Map<String, Integer> articulos) {
		this.articulos = articulos;
	}

	@Override
	public void run()
	{
		System.out.println("Bienvenido a la real máquina");
		if(dinero <=0)
		{
			System.out.print("Necesitas entrar dinero primero, varón");
		}
		else
		{
			if(dinero >= articulos.get(articulo))
			{
				System.out.println("Procesando pago...");
				try {
					sleep(1000);
					System.out.println("Tome su producto");
					System.out.println("Devolviendo " + (dinero- articulos.get(articulo)));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("Dinero no suficiente");
				reiniciar.run();
			}
		}
	}
}
