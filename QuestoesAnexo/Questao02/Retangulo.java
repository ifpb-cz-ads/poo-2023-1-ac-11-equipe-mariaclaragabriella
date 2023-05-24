package QuestoesAnexo.Questao02;

public class Retangulo extends Quadrilatero{
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        super(altura, base, altura, base);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double getArea() {
        double area = this.altura * this.base;
        return area;
    }

    @Override
    public String getDados() {
        return "Altura do retângulo: " + this.altura + "\nBase do retângulo: " + this.base;
    }

}
