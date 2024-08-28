import java.util.List;
public class Livro extends Publicacoes{
    private int numeroEdicao;
    private String nomeEditora;
    private String isbn;

    public Livro(String titulo, String dataPublicacao, List<Autor> autores, int numeroEdicao, String nomeEditora, String isbn) {
        super(titulo, dataPublicacao, autores);
        this.numeroEdicao = numeroEdicao;
        this.nomeEditora = nomeEditora;
        this.isbn = isbn;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return super.toString() + ", Edição: " + numeroEdicao + ", Editora: " + nomeEditora + ", ISBN: " + isbn;
    }

}
