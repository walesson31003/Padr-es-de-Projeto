package triangulo;

public class FabricaTriangulos implements FabricaFiguraGeometricaBidimensional{

	@Override
	public FiguraGeometricaBidimensional criarFigura(String tipo) {
		if(tipo.equals("equilatero"))	
			return new Triangulo();
		else if(tipo.equals("escaleno"))
			return new Triangulo(2, 2, 2);
		else if(tipo.equals("isosceles"))
			return new Triangulo(4, 4, 2);
		
		throw new IllegalArgumentException("Tipo inexistente");
	}

}