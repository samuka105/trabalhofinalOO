import org.junit.jupiter.api.Test;
import projeto.Produto;
import projeto.Usuario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class UsuarioTest {

    @Test
    void retornaMensagemAssinaturaIncorreta()
    {
        try {
            Usuario u1 = new Usuario(
                    "Samuel",
                    "1223",
                    "Belo Horizonte",
                    "Especial");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O tipo de assinatura tem de ser Basico, Premium ou Elite", e.getMessage());
        }
    }

}
