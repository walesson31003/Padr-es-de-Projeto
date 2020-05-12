package Singleton;

public class TesteRelogio {

	public static void main(String[] args) {
		Data data = new Data();
		
		Horario horario = new Horario();
		
		System.out.println(data);
		
		System.out.println(horario);
		
		Relogio relogio0 = Relogio.getInstanse();
		Relogio relogio1 = Relogio.getInstanse();
		Relogio relogio2 = Relogio.getInstanse();
		Relogio relogio3 = Relogio.getInstanse();
		Relogio relogio4 = Relogio.getInstanse();
		Relogio relogio5 = Relogio.getInstanse();
		
		System.out.println(relogio0);
		System.out.println(relogio1);
		System.out.println(relogio2);
		System.out.println(relogio3);
		System.out.println(relogio4);
		System.out.println(relogio5);

	}

}