package Singleton;

public class Relogio {
	private static Relogio instanse;

	private Data data;
	private Horario horario;

	private Relogio() {
		data = new Data();
		horario = new Horario();
	}

	public static Relogio getInstanse() {
		if (instanse == null) {
			instanse = new Relogio();
		}
		return instanse;
	}

}
