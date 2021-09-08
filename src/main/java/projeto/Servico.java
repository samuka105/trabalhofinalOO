package projeto;

import java.util.ArrayList;
import java.util.List;

public class Servico implements Catalogo
{
    private Dono dono;
    private String nome;
    private float precoDaAssinatura;

    private List<Produto> ListaDeProdutos;
    private List<Usuario> ListaDeUsuarios;

    public Servico(Dono dono, String nome, float precoDaAssinatura) {

        if (dono == null) {
            throw new IllegalArgumentException("Serviço precisa de um Dono");
        } else {
            this.dono = dono;
        }

        if (nome.length() < 4) {
            throw new IllegalArgumentException("O nome deve ter mais que 4 caracteres");
        } else {
            this.nome = nome;
        }

        if (precoDaAssinatura < 5.0f) {
            throw new IllegalArgumentException("A assinatura tem de custar mais do que 5,00 reais");
        } else
        {
            this.precoDaAssinatura = precoDaAssinatura;
        }

        this.ListaDeProdutos = new ArrayList<Produto>();
        this.ListaDeUsuarios = new ArrayList<Usuario>();
    }

    public void insereListaDeProdutos(Produto produto)
    {
        ListaDeProdutos.add(produto);
        produto.setIndiceNoCatalogo(ListaDeProdutos.indexOf(produto));
    }

    public void removeListaDeProdutos(int indice)
    {
        ListaDeProdutos.remove(indice);
    }

    public int retornaNumeroProdutos()
    {
        return ListaDeProdutos.size();
    }

    public Produto retornaProdutoLista(int indice)
    {
        return ListaDeProdutos.get(indice);
    }

    public int retornaIndiceProdutoLista(Produto produto)
    {
        return ListaDeProdutos.indexOf(produto);
    }


    public void insereListaDeUsuarios(Usuario usuario)
    {
        ListaDeUsuarios.add(usuario);
        usuario.setNumeroUsuario(ListaDeUsuarios.indexOf(usuario));
    }

    public void removeListaDeUsuarios(int indice)
    {
        ListaDeUsuarios.remove(indice);
    }

    public int retornaNumeroUsuarios()
    {
        return ListaDeUsuarios.size();
    }

    public Usuario retornaUsuarioLista(int indice)
    {
        return ListaDeUsuarios.get(indice);
    }

    public int retornaIndiceUsuarioLista(Usuario usuario)
    {
        return ListaDeUsuarios.indexOf(usuario);
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoDaAssinatura() {
        return precoDaAssinatura;
    }

    public void setPrecoDaAssinatura(float precoDaAssinatura) {
        this.precoDaAssinatura = precoDaAssinatura;
    }

}
