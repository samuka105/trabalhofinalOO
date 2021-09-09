import org.junit.jupiter.api.Test;
import projeto.Pessoa;
import projeto.Produto;
import projeto.Serie;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class SerieTest
{
    @Test
    void verificaListaSeriesParecidas()
    {
        Serie a = new Serie(5.4f, "Game Of Thrones");

        List<Serie> b = a.getListaSeriesParecidas();
        assertEquals(b, a.getListaSeriesParecidas());
    }

    @Test
    void verificaListaSerieParecidaInsereNulo()
    {
        try {
            Serie a = new Serie(5.4f, "Westworld");
            a.insereListaSeriesParecidas(null);

            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Deve inserir uma série parecida valida", e.getMessage());
        }
    }
}
