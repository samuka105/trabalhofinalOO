package projeto;

public class Usuario extends Pessoa
{
    private int NumeroUsuario;
    private String TipodeAssinatura;

    public Usuario(String nome, String cpf, String cidade, String tipodeAssinatura) {
        super(nome, cpf, cidade);
        if (
                        (tipodeAssinatura.equals("Basico")) ||
                        (tipodeAssinatura.equals("Premium")) ||
                        (tipodeAssinatura.equals("Elite"))
        ) {
            throw new IllegalArgumentException("O tipo de assinatura tem de ser Basico, Premium ou Elite");
        } else {
            TipodeAssinatura = tipodeAssinatura;
        }
    }

    public int getNumeroUsuario() {
        return NumeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        NumeroUsuario = numeroUsuario;
    }

    public String getTipodeAssinatura() {
        return TipodeAssinatura;
    }

    public void setTipodeAssinatura(String tipodeAssinatura) {
        TipodeAssinatura = tipodeAssinatura;
    }
}
