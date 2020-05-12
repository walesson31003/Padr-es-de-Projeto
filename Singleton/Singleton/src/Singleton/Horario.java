package Singleton;

public class Horario {
	private byte hora;
	private byte minuto;
	private byte segundo;

	public Horario() {
		super();
		hora = 0;
		minuto = 0;
		segundo = 0;
	}

	public Horario(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);

	}

	public byte getHora() {
		return hora;
	}

	public void setHora(byte hora) {
		this.hora = hora;
	}

	public byte getMinuto() {
		return minuto;
	}

	public void setMinuto(byte minuto) {
		this.minuto = minuto;
	}

	public byte getSegundo() {
		return segundo;
	}

	public void setSegundo(byte segundo) {
		this.segundo = segundo;
	}

	private void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59) {
			this.minuto = (byte) segundo;
		}

	}

	private void setMinuto(int minuto) {
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = (byte) minuto;
		}

	}

	private void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = (byte) hora;
		}

	}

	@Override
	public String toString() {
		return  String.format("%02d:%02d:%02d",hora,minuto,segundo);
	}
	
	
	

}