package projeto;

import java.util.ArrayList;
import java.util.List;

public interface Catalogo
{
    void insereListaDeProdutos(Produto produto);
    void removeListaDeProdutos(int indice);
    public int retornaNumeroProdutos();
}
