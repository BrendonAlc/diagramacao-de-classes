import reprodutor.Musica;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Testar os métodos da interface IReprodutorMusical
        iphone.tocar();
        iphone.selecionarMusica(new Musica());
        iphone.pausar();

        //Testar os métodos da interface IAparelhoTelefonico
        iphone.ligar("123456678");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        //Testar os métodos da interface INavegadorInternet
        iphone.exibirPagina("www.google.com.br");
        iphone.adicionarNovaAba("www.microsoft.com.br");
        iphone.atualizarPagina("www.google.com.br");
    }
}