package CTQuestao01;

public class Pessoa {
    private String nome, endereço;

    public Pessoa(String nome) {
        this.setNome(nome);
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
