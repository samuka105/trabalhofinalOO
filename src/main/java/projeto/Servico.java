package projeto;

import java.util.ArrayList;
import java.util.List;

public class Servico implements Catalogo
{
    private Dono dono;
    private String nome;
    private float precoAssinatura;

    private List<Produto> ListaProdutos;
    private List<Usuario> ListaUsuarios;

    public Servico(Dono dono, String nome, float precoAssinatura) {

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

        if (precoAssinatura < 5.0f) {
            throw new IllegalArgumentException("A assinatura tem de custar mais do que 5,00 reais");
        } else
        {
            this.precoAssinatura = precoAssinatura;
        }

        this.ListaProdutos = new ArrayList<Produto>();
        this.ListaUsuarios = new ArrayList<Usuario>();
    }

    public void insereListaProdutos(Produto produto)
    {
        ListaProdutos.add(produto);
        produto.setIndiceNoCatalogo(ListaProdutos.indexOf(produto));
    }

    public void removeListaProdutos(int indice)
    {
        ListaProdutos.remove(indice);
    }

    public int retornaNumeroProdutos()
    {
        return ListaProdutos.size();
    }

    public Produto retornaProdutoLista(int indice)
    {
        return ListaProdutos.get(indice);
    }

    public int retornaIndiceProdutoLista(Produto produto)
    {
        return ListaProdutos.indexOf(produto);
    }


    public void insereListaDeUsuarios(Usuario usuario)
    {
        ListaUsuarios.add(usuario);
        usuario.setNumeroUsuario(ListaUsuarios.indexOf(usuario));
    }

    public void removeListaDeUsuarios(int indice)
    {
        ListaUsuarios.remove(indice);
    }

    public int retornaNumeroUsuarios()
    {
        return ListaUsuarios.size();
    }

    public Usuario retornaUsuarioLista(int indice)
    {
        return ListaUsuarios.get(indice);
    }

    public int retornaIndiceUsuarioLista(Usuario usuario)
    {
        return ListaUsuarios.indexOf(usuario);
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

    public float getprecoAssinatura() {
        return precoAssinatura;
    }

    public void setprecoAssinatura(float precoAssinatura) {
        this.precoAssinatura = precoAssinatura;
    }

}
