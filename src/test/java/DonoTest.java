import org.junit.jupiter.api.Test;
import projeto.Dono;
import projeto.Servico;

import static org.junit.jupiter.api.Assertions.*;

public class DonoTest
{
    @Test
    void deveVerificarDonoCriandoServico()
    {
        Dono d1 = new Dono("Carlos", "857826", "Timóteo");

        d1.criaServico("UFJFflix", 40.0f);
        Servico s1 = d1.getServico();

        assertEquals(s1, d1.getServico());
    }

    @Test
    void deveVerificarDonoPeloServico()
    {
        Dono d1 = new Dono("Carlos", "857826", "Timóteo");

        d1.criaServico("UFJFflix", 40.0f);
        Servico s1 = d1.getServico();

        assertEquals(s1.getDono(),d1);
    }

    @Test
    void deveVerificarServicoPeloDono()
    {
        Dono d1 = new Dono("Carlos", "857826", "Timóteo");

        d1.criaServico("UFJFflix", 40.0f);
        Servico s1 = d1.getServico();

        assertEquals(d1, s1.getDono());
    }
}
