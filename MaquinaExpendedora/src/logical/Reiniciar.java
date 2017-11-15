package logical;

public class Reiniciar extends Thread{
	
	
	@Override
	public void run()
	{
		try
		{
			System.out.println("Devolviendo dinero...");
			sleep(2000);
			System.out.println("Reiniciando máquina...");
			sleep(2000);
			Main.main(null);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
