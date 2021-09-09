package projeto;

public class Usuario extends Pessoa
{
    private int NumeroUsuario;
    private String TipoAssinatura;

    public Usuario(String nome, String cpf, String cidade, String TipoAssinatura) {
        super(nome, cpf, cidade);
        if (TipoAssinatura.length() < 4) {
            throw new IllegalArgumentException("O tipo de assinatura tem de ter mais que 4 caracteres");
        } else {
            TipoAssinatura = TipoAssinatura;
        }
    }

    public int getNumeroUsuario() {
        return NumeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        NumeroUsuario = numeroUsuario;
    }

    public String getTipoAssinatura() {
        return TipoAssinatura;
    }

    public void setTipoAssinatura(String TipoAssinatura) {
        TipoAssinatura = TipoAssinatura;
    }
}
