public class TesteIphone {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando as funcionalidades do telefone
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando as funcionalidades do navegador
        meuIphone.exibirPagina("http://www.exemplo.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        // Testando as funcionalidades do reprodutor musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica();
    }
}
