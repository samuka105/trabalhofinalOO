import org.junit.jupiter.api.Test;
import projeto.*;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoTest {

    @Test
    void deveRetornarMensagemSemDono()
    {
        try {
            Servico s1 = new Servico(
                    null,
                    "UFJFflix",
                    40.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço precisa de um Dono", e.getMessage());
        }
    }

    @Test
    void deveRetornarMensagemPrecoMenor()
    {
        Dono d1 = new Dono("Carlos", "857826", "Timóteo");

        try {
            Servico s1 = new Servico(
                    d1,
                    "UFJFflix",
                    4.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A assinatura tem de custar mais do que 5,00 reais", e.getMessage());
        }
    }

    @Test
    void deveRetornarMensagemNomeMenor()
    {
        Dono d1 = new Dono("Carlos", "857826", "Timóteo");

        try {
            Servico s1 = new Servico(
                    d1,
                    "UF",
                    40.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O nome deve ter mais que 4 caracteres", e.getMessage());
        }
    }

    @Test
    void deveRetornarIndiceCorretoListaProduto()
    {
        Produto a = new Filme(2.0f, "Chaves");
        Dono d1 = new Dono("Carlos", "857826", "Timóteo");

        d1.criaServico("UFJFflix", 40.0f);
        Servico s1 = d1.getServico();

        s1.insereListaProdutos(a);

        assertEquals(0,s1.retornaIndiceProdutoLista(a));

    }

    @Test
    void deveRetornarProdutoCorretoListaProduto()
    {
        Produto a = new Filme(2.0f, "Coraline");
        Dono d1 = new Dono("Carlos", "857826", "Timóteo");

        d1.criaServico("UFJFflix", 40.0f);
        Servico s1 = d1.getServico();

        s1.insereListaProdutos(a);

        assertEquals(a,s1.retornaProdutoLista(0));
    }

    @Test
    void deveRetornarIndiceCorretoListaUsuario()
    {
        Produto a = new Filme(2.0f, "Espadachim Negro");
        Dono d1 = new Dono("Carlos", "857826", "Timóteo");

        Usuario u1 = new Usuario("Samuel","1223","Belo Horizonte", "Premium");

        d1.criaServico("UFJFflix", 40.0f);
        Servico s1 = d1.getServico();

        s1.insereListaDeUsuarios(u1);

        assertEquals(0,s1.retornaIndiceUsuarioLista(u1));

    }

    @Test
    void deveRetornarUsuarioCorretoListaUsuario()
    {
        Produto a = new Filme(2.0f, "Um Dia");
        Dono d1 = new Dono("Carlos", "857826", "Timóteo");

        Usuario u1 = new Usuario("Samuel","1223","Belo Horizonte", "Premium");

        d1.criaServico("UFJFflix", 40.0f);
        Servico s1 = d1.getServico();

        s1.insereListaDeUsuarios(u1);

        assertEquals(u1,s1.retornaUsuarioLista(0));
    }

}

