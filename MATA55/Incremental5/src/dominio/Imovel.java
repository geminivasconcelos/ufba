package dominio;
import java.util.List;
import java.util.ArrayList;

public abstract class Imovel {
    private String endereco;
    private double valor;
    private Proprietario proprietario;
    private List<Locacao> historicoLocacao;

    public Imovel(String endereco, double valor, Proprietario proprietario) {
        this.endereco = endereco;
        this.valor = valor;
        this.proprietario = proprietario;
        this.historicoLocacao = new ArrayList<>();
    }

    // Métodos abstratos que devem ser implementados pelas subclasses
    public abstract int getNumeroQuartos();
    public abstract void setNumeroQuartos(int numeroQuartos);

    // Métodos concretos
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public List<Locacao> getHistoricoLocacao() {
        return historicoLocacao;
    }

    public void adicionarLocacao(Locacao locacao) {
        historicoLocacao.add(locacao);
    }
}