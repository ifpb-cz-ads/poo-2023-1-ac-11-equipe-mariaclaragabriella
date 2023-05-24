package QuestoesAnexo.Questao01;

public class Carro implements PegadaDeCarbono{
    private String marca;
    private String modelo;
    private double consumoDeCombustivel;

    
    public Carro(String marca, String modelo, double consumoDeCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoDeCombustivel = consumoDeCombustivel;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoDeCombustivel() {
        return consumoDeCombustivel;
    }

    public void setConsumoDeCombustivel(double consumoDeCombustivel) {
        this.consumoDeCombustivel = consumoDeCombustivel;
    }
    
    @Override
    public double getPegadaDeCarbono() {
        double pegadaDeCarbono = this.consumoDeCombustivel * 2.3;
        return pegadaDeCarbono;
    }

    @Override
    public String getDados() {
        return "Carro\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nConsumo de combustível: " + this.consumoDeCombustivel;
    }
}