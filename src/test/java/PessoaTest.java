import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import projeto.Pessoa;

public class PessoaTest {

    @Test
    void deveRetornarMensagemSemCidade()
    {
        try {
            Pessoa pessoa = new Pessoa(
                    "Samuel",
                    "12333",
                    null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Pessoa precisa ter Nome, Cpf e Cidade", e.getMessage());
        }
    }

    @Test
    void deveRetornarMensagemSemCpf()
    {
        try {
            Pessoa pessoa = new Pessoa(
                    "Samuel",
                    null,
                    "Juiz de Fora");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Pessoa precisa ter Nome, Cpf e Cidade", e.getMessage());
        }
    }

    @Test
    void deveRetornarMensagemSemNome()
    {
        try {
            Pessoa pessoa = new Pessoa(
                    null,
                    "12333",
                    "Juiz de Fora");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Pessoa precisa ter Nome, Cpf e Cidade", e.getMessage());
        }
    }
}
