package QuestoesAnexo.Questao02;

public class Quadrado extends Quadrilatero {
    private double lado;
    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
        this.lado = lado;
    }
    
    @Override
    public double getArea() {
        double area = this.lado * this.lado;
        return area;
    }

    @Override
    public String getDados() {
        return "Lado do quadrado: " + this.lado;
    }
}
