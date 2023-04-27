package br.com.loggin;

//import java.util.UUID;
import java.util.logging.Level;

public class principal {

	public static void main(String[] args) { //throws InterruptedException {
		// TODO Auto-generated method stub

		try {
			Log meuLogger = new Log("Log.txt");
			meuLogger.logger.setLevel(Level.FINE);
			//meuLogger.logger.setLevel(Level.WARNING);
			meuLogger.logger.info("Log de informação");
			meuLogger.logger.warning("Log de Aviso");
			meuLogger.logger.severe("Log Severo");
			

		} catch (Exception e) {
			

		}
		
		//profiling
	    //metodoRuim();
		
	}
	
	/*public static void metodoRuim() throws InterruptedException
	{
		String texto = "teste teste teste ";
		
		for (int i = 0; i < 15000; i++) 
		{
			texto += "texto " + i + " texto " + UUID.randomUUID().toString();
			Thread.sleep(1000);
		}
		
		System.out.println(texto);
	} */

}
