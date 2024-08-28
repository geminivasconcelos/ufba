public class Main {
    public static void main(String[] args) {

        Revista revista1 = AplicacaoLivraria.criarRevista("Revista Tecnologia", "Editora Tech", 15.00, "Mensal");

        Livro livro1 = new Livro("Java para Iniciantes", "João Silva", 324234, "Um guia para iniciantes em Java", "asdasdaa");

        LivroDidatico livroDidatico1 = AplicacaoLivraria.criarLivroDidatico("História Antiga", "Maria Pereira", "Editora Saber", "Livro didático sobre História Antiga", 60.00, "História");

        System.out.println("Resumo do Livro: " + livro1.getResumo());

        Revista revista2 = AplicacaoLivraria.criarRevista("Revista Ciência", "Editora Tech", 20.00, "Bimestral");
        boolean mesmaEditora = revista1.mesmaEditora(revista2);
        System.out.println("As revistas têm a mesma editora? " + (mesmaEditora ? "Sim" : "Não"));

        System.out.println(livro1);
        System.out.println(livroDidatico1);
        System.out.println(revista1);

        AplicacaoLivraria.emitirNotaFiscal(livroDidatico1, 3, true);

        AplicacaoLivraria.emitirNotaFiscal(revista1, 5, false);
    }
}