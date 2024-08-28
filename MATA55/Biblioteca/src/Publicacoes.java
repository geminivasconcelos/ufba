import java.util.ArrayList;
import java.util.List;

public class Publicacoes {

    private String dataPublicacao;
    private String titulo;
    private List<Publicacoes> referencias;
    private List<Autor> autores;

    public Publicacoes(String dataPublicacao, String titulo, List<Autor> autores){
        this.dataPublicacao = dataPublicacao;
        this.titulo = titulo;
        this.referencias = new ArrayList<>();
        this.autores = autores;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDataPublicacao(){
        return dataPublicacao;
    }

    public List<Publicacoes> getReferencias() {
        return referencias;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void adicionarReferencia(Publicacoes publicacao) {
        referencias.add(publicacao);
    }

//    public abstract int getDuracaoLocacao();

    @Override
    public String toString() {
        return "Título: " + titulo + ", Data de Publicação: " + dataPublicacao + ", Autores: " + autores;
    }



}
