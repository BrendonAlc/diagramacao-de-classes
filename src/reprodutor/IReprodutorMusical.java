package reprodutor;

import java.util.ArrayList;
import java.util.List;

public interface IReprodutorMusical {
    List<Musica> playlist = new ArrayList<>();
    int volume = 0;

    void tocar();
    void pausar();
    void selecionarMusica(Musica musica);
}
