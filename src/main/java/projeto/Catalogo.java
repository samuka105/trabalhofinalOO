package projeto;

import java.util.ArrayList;
import java.util.List;

public interface Catalogo
{
    void insereListaProdutos(Produto produto);
    void removeListaProdutos(int indice);
    public int retornaNumeroProdutos();
}
