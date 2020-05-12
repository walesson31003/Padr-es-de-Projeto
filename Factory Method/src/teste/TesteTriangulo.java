package teste;
import triangulo.FabricaFiguraGeometricaBidimensional;
import triangulo.FabricaTriangulos;
import triangulo.FiguraGeometricaBidimensional;
public class TesteTriangulo {

	public static void main(String[] args) {
		FabricaFiguraGeometricaBidimensional fb = new FabricaTriangulos();
		
		FiguraGeometricaBidimensional triangulo = fb.criarFigura("Equilátero");
		FiguraGeometricaBidimensional triangulo2 = fb.criarFigura("Escaleno");
		FiguraGeometricaBidimensional triangulo3 =fb.criarFigura("Isosceles");
		
		System.out.println(triangulo.getTipoFigura());
		System.out.println(triangulo2.getTipoFigura());
		System.out.println(triangulo3.getTipoFigura());
		
	}

}