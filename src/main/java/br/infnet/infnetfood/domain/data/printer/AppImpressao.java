package br.infnet.infnetfood.domain.data.printer;

public class AppImpressao {

    public static void relatorio(final String message, final IPrinter printer) {
        System.out.println(message);
        printer.impressao();
    }
}
