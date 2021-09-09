package projeto;

public class Dono extends Pessoa
{
    private Servico servico;

    public Dono(String nome, String cpf, String cidade) {
        super(nome, cpf, cidade);
    }

    public void criaServico(String nome, float precoDaAssinatura)
    {
        servico = new Servico(this, nome, precoDaAssinatura);
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

}
