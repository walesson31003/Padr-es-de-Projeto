package Singleton;
import java.time.LocalTime;

public class HoraSingleton {
	
	LocalTime hora = LocalTime.now();

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
}
