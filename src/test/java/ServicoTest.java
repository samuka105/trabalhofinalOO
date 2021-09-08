import org.junit.jupiter.api.Test;
import projeto.Dono;
import projeto.Produto;
import projeto.Servico;

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

}

