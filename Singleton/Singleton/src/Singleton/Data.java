package Singleton;


public class Data {
	private short ano;
	private byte mes;
	private byte dia;

	public Data() {
		ano = 1;
		mes = 1;
		dia = 1;
	}

	public Data(int dia, int mes, int ano) {
		setAno((short) ano);
		setMes((byte) mes);
		setDia((byte) dia);
	}

	public short getAno() {
		return ano;
	}

	public byte getMes() {
		return mes;
	}

	public byte getDia() {
		return dia;
	}

	private void setDia(byte dia) {
		if (dia > 0 && dia <= 31) {
			this.dia = dia;
		}

	}

	private void setMes(byte mes) {
		if (mes > 0 && mes <= 12) {
			this.mes = mes;
		}

	}

	private void setAno(short ano) {
		if (ano > 0 && ano <= 9999) {
			this.ano = ano;
		}

	}

	@Override
	public String toString() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
		
	}

}