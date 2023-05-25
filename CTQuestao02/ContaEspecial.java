package CTQuestao02;

public class ContaEspecial extends Conta {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public ContaEspecial(int numero, String nomeTitular, String cpfTitular, double limite){
        super(numero, nomeTitular, cpfTitular);
        this.limite = limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
}
