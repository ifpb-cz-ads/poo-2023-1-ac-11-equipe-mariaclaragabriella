package QuestoesAnexo.Questao01;

public class Edificio implements PegadaDeCarbono{
    private int numPessoas;
    private double consumoDeEnergia;
    private String endereco;

    public Edificio(int numPessoas, double consumoDeEnergia, String endereco) {
        this.numPessoas = numPessoas;
        this.consumoDeEnergia = consumoDeEnergia;
        this.endereco = endereco;
    }
    
    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public double getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    public void setConsumoDeEnergia(double consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public double getPegadaDeCarbono() {
        double pegadaDeCarbono = this.numPessoas * this.consumoDeEnergia * 0.5;
        return pegadaDeCarbono;
    }

    @Override
    public String getDados() {
        return "Edifício\nNúmero de pessoas: " + this.numPessoas + "\nEndereço: " + this.endereco + "\nConsumo de energia(kWh): " + this.consumoDeEnergia;
    }
    
}