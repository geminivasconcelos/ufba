class Fiador {
    private String nome;
    private String cpf;
    private String telefone;
    private float renda;
    private String status;

    public Fiador(String nome, String cpf, String telefone, float renda) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.renda = renda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public float getRenda() {
        return this.renda;
    }
}