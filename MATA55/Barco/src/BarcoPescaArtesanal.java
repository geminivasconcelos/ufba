public class BarcoPescaArtesanal implements Embarcacoes{
    String nome;
    double capacidadeMaxima;

    public BarcoPescaArtesanal(String nome, double capacidade){
        this.nome = nome;
        this.capacidadeMaxima = capacidade;
    }

    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public double getCapacidadeMaxima(){
        return capacidadeMaxima;
    }

    @Override
    public double calcularQuantidadePeixeTransportada(double tempoPesca){
        return Math.min(tempoPesca * 10, capacidadeMaxima);
    }
}
