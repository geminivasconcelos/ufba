import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private String endereco;
    private List<Publicacoes> colecao;


    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.colecao = new ArrayList<>();
    }

    public void adicionarPublicacao(Publicacoes publicacao) {
        colecao.add(publicacao);
    }

    public void listarPublicacoes() {
        for (Publicacoes publicacao : colecao) {
            System.out.println(publicacao);
        }
    }

    public void locarPublicacao(Publicacoes publicacao) {
        System.out.println("Publicação locada: " + publicacao.getTitulo());
//        System.out.println("Duração da locação: " + publicacao.getDuracaoLocacao() + " dias.");
    }
}
