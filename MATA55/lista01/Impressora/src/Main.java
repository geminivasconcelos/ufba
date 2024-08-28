//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Impressora impressora = new Impressora("Epson", "Modelo XYZ", 1000, "laser", 5.0, 2);
        System.out.println("Tempo necessário para imprimir 50 páginas: " + impressora.calcularTempoImpressao(50) + " segundos.");
        impressora.imprimirTexto("Hello, world!");
        System.out.println("Páginas restantes: " + impressora.paginasRestantes());

    }
}