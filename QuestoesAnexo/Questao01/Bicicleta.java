package QuestoesAnexo.Questao01;

public class Bicicleta implements PegadaDeCarbono{
    private String marca;
    
    public Bicicleta(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public double getPegadaDeCarbono() {
        double pegadaDeCarbono = 0;
        return pegadaDeCarbono;
    }

    @Override
    public String getDados() {
        return "Bicicleta\nMarca: " + this.marca;
    }
}