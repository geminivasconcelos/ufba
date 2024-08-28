public class Animal {
    private String tipo;  // mamífero, anfíbio, ave
    private String nome;
    private int idade;

    // Construtor
    public Animal(String tipo, String nome, int idade) {
        this.tipo = tipo;
        this.nome = nome;
        this.idade = idade;
    }

    // Método para calcular a quantidade de alimento consumido por dia
    public double calcularAlimentoDiario() {
        switch (tipo.toLowerCase()) {
            case "mamífero":
                return 2 * idade;  // 2 kg por dia por ano de vida
            case "ave":
                return 0.1 * idade;  // 100g por dia por ano de vida
            case "anfíbio":
                return 0.02 * idade;  // 20g por dia por ano de vida
            default:
                return 0;  // Se o tipo for desconhecido, retorna 0
        }
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
