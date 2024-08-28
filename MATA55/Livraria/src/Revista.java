public class Revista extends Titulo{

    private String periodicidade;

    public Revista(String nome, String editora, double preco, String periodicidade){
        super(nome, editora, preco);
        this. periodicidade = periodicidade;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    @Override
    public String toString() {
        return ", Periodicidade: " + periodicidade;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.01;

    }

    public boolean mesmaEditora(Revista outraRevista) {
        return this.getEditora().equals(outraRevista.getEditora());
    }
}