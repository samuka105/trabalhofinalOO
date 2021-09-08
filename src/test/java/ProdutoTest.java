import org.junit.jupiter.api.Test;
import projeto.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest
{
    @Test
    void retornaTrueSuperclasse() {

        List<Produto> produtos = new ArrayList<Produto>();

        Produto a = new Produto(2.0f);
        produtos.add(a);
        assertEquals(true, (produtos.get(0).retornaTrueObjetoSuperclasse()));
    }

    @Test
    void retornaFalseSuperClasse()
    {
        List<Produto> lista = new ArrayList<Produto>();

        Produto a = new Filme(2.0f, "Caça ao Tesouro");
        lista.add(a);
        assertEquals(false, (lista.get(0).retornaTrueObjetoSuperclasse()));
    }

    @Test
    void deveRetornarMensagemNotaMenorQueZero() {
        try {
            Produto p = new Produto(-3);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Produto precisa de Nota maior que Zero", e.getMessage());
        }
    }

    @Test
    void deveRetornarIndiceCorretoListaProduto()
    {
        Produto a = new Filme(2.0f, "Caça ao Tesouro");
        Dono d1 = new Dono("Carlos", "857826", "Timóteo");

        d1.criaServico("UFJFflix", 40.0f);
        Servico s1 = d1.getServico();

        s1.insereListaDeProdutos(a);

        assertEquals(0,s1.retornaIndiceProdutoLista(a));

    }

    @Test
    void deveRetornarProdutoCorretoListaProduto()
    {
        Produto a = new Filme(2.0f, "Caça ao Tesouro");
        Dono d1 = new Dono("Carlos", "857826", "Timóteo");

        d1.criaServico("UFJFflix", 40.0f);
        Servico s1 = d1.getServico();

        s1.insereListaDeProdutos(a);

        assertEquals(a,s1.retornaProdutoLista(0));
    }

    @Test
    void deveRetornarIndiceCorretoListaUsuario()
    {
        Produto a = new Filme(2.0f, "Caça ao Tesouro");
        Dono d1 = new Dono("Carlos", "857826", "Timóteo");

        d1.criaServico("UFJFflix", 40.0f);
        Servico s1 = d1.getServico();

        s1.insereListaDeProdutos(a);

        assertEquals(a,s1.retornaProdutoLista(0));

    }

    @Test
    void deveRetornarUsuarioCorretoListaUsuario()
    {

    }

}


