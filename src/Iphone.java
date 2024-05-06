import navegador.INavegadorInternet;
import reprodutor.IReprodutorMusical;
import reprodutor.Musica;
import telefone.IAparelhoTelefonico;

public class Iphone implements INavegadorInternet, IAparelhoTelefonico, IReprodutorMusical {
    @Override
    public void tocar() {
        // Implementação do método tocar() para o iPhone
    }

    @Override
    public void pausar() {
        // Implementação do método pausar() para o iPhone
    }

    @Override
    public void selecionarMusica(Musica musica) {
        // Implementação do método selecionarMusica() para o iPhone
    }

    @Override
    public void ligar(String numero) {
        // Implementação do método ligar() para o iPhone
    }

    @Override
    public void atender() {
        // Implementação do método atender() para o iPhone
    }

    @Override
    public void iniciarCorreioDeVoz() {

    }

    @Override
    public void exibirPagina(String url) {
        // Implementação do método exibirPagina() para o iPhone
    }

    @Override
    public void adicionarNovaAba(String url) {
        // Implementação do método adicionarNovaAba() para o iPhone
    }

    @Override
    public void atualizarPagina(String url) {
        // Implementação do método atualizarPagina() para o iPhone
    }
}
