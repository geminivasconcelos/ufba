package dominio;

public class Apartamento extends Imovel{

    private int numeroQuartos;
    private int andar;
    private double valorCondominio;

    public Apartamento(String endereco, double valor, Proprietario proprietario, int numeroQuartos, int andar, double valorCondominio) {
        super(endereco, valor, proprietario);
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

}
