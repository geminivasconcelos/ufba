public class Main {
    public static void main(String[] args) {
        Televisao tvSimples = new Televisao("LG", "Modelo123");
        Televisao smartTV = new Televisao("Sony", "SmartModel456");
        smartTV.ligarTv(); // Liga a TV simples sem parâmetros
        System.out.println("TV simples ligada: " + tvSimples.isLigada());

        // Configura a senha para Smart TV para fins de teste
        smartTV.senha = "1234";
        boolean ligada = smartTV.ligarTv("1234", 10); // Tentativa de ligar a Smart TV com senha e canal
        System.out.println("Smart TV ligada com senha: " + ligada + " no canal " + smartTV.getCanalAtual());
    }
}