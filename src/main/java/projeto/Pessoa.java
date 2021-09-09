package projeto;

public class Pessoa
{
    private String nome;
    private String cpf;
    private String cidade;

    public Pessoa(String nome, String cpf, String cidade) {
        if (nome == null || cpf == null || cidade == null)
        {
            throw new IllegalArgumentException("Pessoa precisa ter Nome, Cpf e Cidade");
        }
        else if(nome.length() < 3)
        {
            throw new IllegalArgumentException("O nome deve ter pelo menos 3 caracteres");
        } else {
            this.nome = nome;
            this.cpf= cpf;
            this.cidade = cidade;
        }

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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
