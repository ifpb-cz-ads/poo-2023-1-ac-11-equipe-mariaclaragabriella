package CTQuestao02;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.setNome(nome);
        if (this.setCpf(cpf) != true) System.out.println("CPF invalido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
            return true;
        }
        return false;
    }
}
