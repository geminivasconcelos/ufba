import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Criando autores
        Autor autor1 = new Autor("Alice Santos", "Doutora");
        Autor autor2 = new Autor("Carlos Silva", "Mestre");

        // Criando publicações
        Livro livro = new Livro("Programação Java", "2023-01-15", Arrays.asList(autor1), 3, "Editora ABC", "123-4567891234");
        Artigo artigo = new Artigo("Java e Polimorfismo", "2024-05-10", Arrays.asList(autor2), "Este artigo explora o conceito de polimorfismo em Java.");

        // Criando biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Rua das Flores, 123");

        // Adicionando publicações à biblioteca
        biblioteca.adicionarPublicacao(livro);
        biblioteca.adicionarPublicacao(artigo);

        // Listando publicações
        biblioteca.listarPublicacoes();

        // Locando publicações
        biblioteca.locarPublicacao(livro);
        biblioteca.locarPublicacao(artigo);
    }
}