package QuestoesAnexo.Questao02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> listaFormasGeo = new ArrayList<>();
        listaFormasGeo.add(new Circulo(3));
        listaFormasGeo.add(new Quadrado(5));
        listaFormasGeo.add(new Retangulo(6, 2));
        listaFormasGeo.add(new Circulo(4));
        listaFormasGeo.add(new Quadrado(10));
        listaFormasGeo.add(new Retangulo(5, 2));
        for (FormaGeometrica formaGeo : listaFormasGeo) {
            System.out.println();
            System.out.println(formaGeo.getDados()); 
            System.out.printf("Área: %.1f \n", formaGeo.getArea()); 
            System.out.printf("Perímetro: %.1f", formaGeo.getPerimetro());
            System.out.println();
        }
    }
}
