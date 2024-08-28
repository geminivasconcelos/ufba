public class BarcoPescaIndustrial implements Embarcacoes{

    String nome;
    double capacidadeMaxima;

    public BarcoPescaIndustrial(String nome, double capacidadeMaxima){
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
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
        return Math.min(tempoPesca * 50, capacidadeMaxima);
    }
}
