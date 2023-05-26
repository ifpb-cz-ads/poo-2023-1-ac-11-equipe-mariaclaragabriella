package QuestoesAnexo.Questao01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PegadaDeCarbono> lista = new ArrayList<>();
        lista.add(new Bicicleta("Soul cycles"));
        lista.add(new Edificio(50, 500, "Rua das Flores, 123, Cidade X"));
        lista.add(new Carro("Honda", "Honda Civic", 12.5));
        for(PegadaDeCarbono objeto : lista){
            System.out.println();
            System.out.println(objeto.getDados());
            System.out.printf("Pegada de carbono: %.1f", objeto.getPegadaDeCarbono());
            System.out.println();
        }
    }
    
}
