```mermaid
graph TD

classDiagram
    class ReprodutorMusical {
        + tocar() void
        + pausar() void
        + selecionarMusica() void
    }
    <<interface>> ReprodutorMusical

    class AparelhoTelefonico {
        + ligar(numero String) void
        + atender() void  
        + iniciarCorreioVoz() void
    }
    <<interface>> AparelhoTelefonico

    class NavegadorInternet {
        + exibirPagina(url String) void
        + adicionarNovaAba() void
        + atualizarPagina() void 
    }
    <<interface>> NavegadorInternet

    class iPhone {
        - numero  String
        + ligar(numero String)  void 
        + atender()  void
        + iniciarCorreioVoz()  void
        + exibirPagina(url String)  void
        + adicionarNovaAba()  void
        + atualizarPagina()  void
        + tocar()  void
        + pausar()  void
        + selecionarMusica()  void
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```