package teste;

public class Teste {
	public static void main(String[]args) {
		Data data = new Adapter(2020, 5, 2);
		System.out.println(data);
		
		((Adapter)data).setDiaMes(11, 8);
		System.out.println(data);
		
		((Adapter)data).setMesAno(11, 2022);
		System.out.println(data);
		
		((Adapter)data).setDiaAno(19, 2021);
		System.out.println(data);
		
		
		((AdapterData)data).setDiaMesAno(18, 6, 2020);
		System.out.println(data);
		
	}
}