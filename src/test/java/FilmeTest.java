import org.junit.jupiter.api.Test;
import projeto.Filme;
import projeto.Serie;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FilmeTest
{
    @Test
    void verificaListaFilmesParecidos()
    {
        Filme a = new Filme(2.0f, "Matrix");

        List<Filme> b = a.getListaFilmesParecidos();
        assertEquals(b, a.getListaFilmesParecidos());
    }

    @Test
    void verificaListaSerieParecidaInsereNulo()
    {
        try {
            Filme a = new Filme(6.0f, "Star Wars");
            a.insereListaFilmesParecidos(null);

            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Deve inserir um filme parecido valido", e.getMessage());
        }
    }
}
