package QuestoesAnexo.Questao02;

public class Circulo implements FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double getPerimetro() {
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    @Override
    public String getDados() {
        return "Raio do círculo: " + this.raio;
    }
    
}
