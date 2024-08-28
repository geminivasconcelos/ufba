public class Main {
    public static void main(String[] args) {
        Voo voo = new Voo(1234, "25/12/2024");

        System.out.println("Voo número: " + voo.getNumeroVoo());
        System.out.println("Data do voo: " + voo.getDataVoo());

        // Simular a compra de passagens
        for (int i = 0; i < 101; i++) { // Tentativa de comprar 101 passagens
            boolean resultado = voo.comprarPassagem();
            if (!resultado) {
                System.out.println("Voo cheio após " + i + " compras.");
                break;
            }
        }
    }
}
