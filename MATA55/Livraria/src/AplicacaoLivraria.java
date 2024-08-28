public class AplicacaoLivraria {
    private static String nomeLivraria = "Livraria Exemplar";

    public static Revista criarRevista(String nome, String editora, double preco, String periodicidade) {
        return new Revista(nome, editora, preco, periodicidade);
    }

    public static LivroDidatico criarLivroDidatico(String nome, String autorPrincipal, String editora, String resumo, double preco, String area) {
        return new LivroDidatico(nome, autorPrincipal, preco, resumo, editora, area);
    }

    public static void emitirNotaFiscal(Titulo titulo, int qtd, boolean vip) {
        double precoFinal = titulo.calcularPrecoFinal();
        double desconto = 0;

        if (vip) {
            if (titulo instanceof LivroDidatico) {
                desconto = 0.10;
                LivroDidatico livroDidatico = (LivroDidatico) titulo;
                if (livroDidatico.getArea().equalsIgnoreCase("História") || livroDidatico.getArea().equalsIgnoreCase("Filosofia")) {
                    desconto += 0.05;
                }
            } else if (titulo instanceof Livro) {
                desconto = 0.03;
            } else if (titulo instanceof Revista) {
                desconto = 0.02;
            }
        }

        double valorTotal = precoFinal * qtd * (1 - desconto);

        System.out.println("Nota Fiscal");
        System.out.println("Livraria: " + nomeLivraria);
        System.out.println("Título: " + titulo.getNome());
        System.out.println("Quantidade: " + qtd);
        System.out.println("Preço Total: R$ " + valorTotal);
    }

}
