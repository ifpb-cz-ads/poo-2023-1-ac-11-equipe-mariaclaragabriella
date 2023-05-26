package CTQuestao02;

public abstract class Conta {
    private Cliente titular;
    private int numero;
    protected double saldo;

    public Conta(int numero, Cliente titular, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(int numero, Cliente titular){
        this.titular = titular;
        this.numero = numero;
        saldo = 0;
    }

    public Conta(int numero, String nomeTitular, String cpfTitular){
        this.titular = new Cliente(nomeTitular, cpfTitular);
        this.numero = numero;
        saldo = 0;
    }

    void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    abstract boolean sacar(double valor);

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return titular;
    }

    public void setCliente(Cliente titular) {
        this.titular = titular;
    }
}
