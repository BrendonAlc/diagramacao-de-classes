package telefone;

public interface IAparelhoTelefonico {
    String numero = "";
    boolean estadoLigacao = false;

    void ligar(String numero);
    void atender();
    void iniciarCorreioDeVoz();

}
