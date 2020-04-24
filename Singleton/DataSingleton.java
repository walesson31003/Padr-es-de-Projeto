package Singleton;


import java.time.LocalDate;

public class DataSingleton {
	
	private LocalDate dataAtual = LocalDate.now();

	public LocalDate getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(LocalDate dataAtual) {
		this.dataAtual = dataAtual;
	}
}
