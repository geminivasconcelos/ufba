public class Impressora {

    String fabricante;
    String modelo;
    int capacidadeImpressao;
    String tecnologia;
    Double velocidade;
    int paginasImpressas;


    public Impressora(String fabricante, String modelo, int capacidadeImpressao, String tecnologia, Double velocidade, int paginasImpressas) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidadeImpressao = capacidadeImpressao;
        this.tecnologia = tecnologia;
        this.velocidade = velocidade;
        this.paginasImpressas = paginasImpressas;
        ;
    }

    public double calcularTempoImpressao(int numeroPaginas){
        if(numeroPaginas > 0){
            return numeroPaginas / velocidade;
        }else{
            return 0;
        }
    }

    public void imprimirTexto(String texto){
        System.out.println("Imprimindo: " +texto);
        this.paginasImpressas++;
    }

    public int paginasRestantes() {
        return capacidadeImpressao - paginasImpressas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public double getVelocidade() {
        return velocidade;
    }

}
