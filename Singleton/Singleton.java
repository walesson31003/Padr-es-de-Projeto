package Singleton;

import java.time.format.DateTimeFormatter;

public class Singleton {

	 public static void main(String[] args) {
		 
		DataSingleton data = new DataSingleton();
		HoraSingleton hora= new HoraSingleton();
		
		String formataData = data.getDataAtual().format(DateTimeFormatter.ofPattern("dd-MM-yyyy "));
		String formataHora = hora.getHora().format(DateTimeFormatter.ofPattern(" HH:mm:ss"));
			
		System.out.println("Data e Hora atual: "+formataData + " " + formataHora);
		
	}
}
