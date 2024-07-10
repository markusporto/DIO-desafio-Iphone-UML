public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String numero;

    @java.lang.Override
    public void ligar( String numero) {
        this.numero = numero;
        System.out.println("Chamando "+numero+ ". . .");
    }

    @java.lang.Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @java.lang.Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando chamada");
    }

    @java.lang.Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Pagina");
    }

    @java.lang.Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    @java.lang.Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    @java.lang.Override
    public void tocar() {
        System.out.println("Reproduzindo Audio");
    }

    @java.lang.Override
    public void pausar() {
        System.out.println("Audio Pausado");
    }

    @java.lang.Override
    public void selecionarMusica() {
        System.out.println("Selecione o Audio que deseja reproduzir");
    }
}
