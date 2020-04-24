package triangulo;

import java.util.HashSet;
import java.util.Set;


public class TipoTriangulo {

	public static Set validarTriangulo(double a, double b, double c) {
	        
	        Set<String> propriedades = new HashSet<String>();
	        
	        double hipotenusa = a;

	        if (hipotenusa < b) {
	            hipotenusa = b;
	        }

	        if (hipotenusa < c) {
	            hipotenusa = c;
	        }

	        if ((a + b + c - hipotenusa) > hipotenusa) {
	            propriedades.add("Válido");
	        } else {
	            propriedades.add("Inválido");
	            return propriedades;
	        }

	        if (a == b || b == c || c == a) {
	            if (a == b && b == c) {
	                propriedades.add("Equilátero");
	            } else {
	                propriedades.add("Isósceles");
	            }
	        }

	        if (a != b && b != c && c != a) {
	            propriedades.add("Escaleno");
	        }

	        return propriedades;
	    }

	    public static void mostrarPropriedades(Set set) {
	        for (Object s : set) {
	            System.out.print(s + "   ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	       Set set1 = validarTriangulo(10, 12, 16);
	       Set set2 = validarTriangulo(4, 3, 3);
	       Set set3 = validarTriangulo(4, 6, 2);
	       Set set4 = validarTriangulo(3, 4, 5);
	       
	       mostrarPropriedades(set1);
	       mostrarPropriedades(set2);
	       mostrarPropriedades(set3);
	       mostrarPropriedades(set4);
	    }
	}
