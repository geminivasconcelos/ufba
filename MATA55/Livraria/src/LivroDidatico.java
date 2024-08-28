public class LivroDidatico extends Livro{

    private String area;

    public LivroDidatico(String nome, String editora, double preco, String area, String autoPrincipal, String resumo){
        super(nome, editora, preco, autoPrincipal, resumo);
        this.area = area;
    }

    public String getArea(){
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + ", Área: " + area;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.005;
    }




}
