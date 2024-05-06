package navegador;

import java.util.ArrayList;
import java.util.List;

public interface INavegadorInternet {
    List<Pagina> historico = new ArrayList<>();
    Pagina abaAtual = null;

    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina(String url);
}
