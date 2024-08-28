public class Voo {
    private int numeroVoo;
    private String dataVoo; // data no formato "dia/mês/ano"
    private int passageiros;
    private static final int CAPACIDADE_MAXIMA = 100;

    // Construtor
    public Voo(int numeroVoo, String dataVoo) {
        this.numeroVoo = numeroVoo;
        this.dataVoo = dataVoo;
        this.passageiros = 0; // Inicializa com zero passageiros
    }

    // Método para retornar o número do voo
    public int getNumeroVoo() {
        return numeroVoo;
    }

    // Método para retornar a data do voo
    public String getDataVoo() {
        return dataVoo;
    }

    // Método para comprar uma passagem
    public boolean comprarPassagem() {
        if (passageiros < CAPACIDADE_MAXIMA) {
            passageiros++; // Incrementa o número de passageiros
            return true; // Sucesso na compra da passagem
        }
        return false; // Voo cheio, não pode comprar mais passagens
    }
}
