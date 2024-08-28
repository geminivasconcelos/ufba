public class Livro extends Titulo{

    private String autoPrincipal;
    private String resumo;

    public Livro(String nome, String editora, double preco, String autoPrincipal, String resumo){
        super(nome, editora, preco);
        this.autoPrincipal = autoPrincipal;
        this.resumo = resumo;
    }

    public String getAutorPrincipal(){
        return autoPrincipal;
    }

    public String getResumo(){
        return resumo;
    }


    @Override
    public String toString() {
        return "Livro: " + getNome() + ", Autor: " + getAutorPrincipal() + ", Editora: " + getEditora() + ", Preço: R$ " + getPreco();
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.008; // 0,8% de ISS
    }
}
