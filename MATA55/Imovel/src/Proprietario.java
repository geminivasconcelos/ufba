public class Proprietario {
    private String nome;
    private String cpf;
    private String identidade;
//    private String rua;
//    private int numero;
//    private String cep;
//    private String estado;
//    private String cidade;
private String telefone;
    private Endereco endereco;


    public Proprietario(String nome, String cpf, String identidade, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.identidade = identidade;
        this.endereco = endereco;
//        this.rua = rua;
//        this.numero = numero;
//        this.cep = cep;
//        this.estado = estado;
//        this.cidade = cidade;
        this.telefone = telefone;
    }

    // Getters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getIdentidade() { return identidade; }
    public Endereco getEndereco(){
        return endereco;
    }
//    public String getRua() { return rua; }
//    public int getNumero() { return numero; }
//    public String getCep() { return cep; }
//    public String getEstado() { return estado; }
//    public String getCidade() { return cidade; }
    public String getTelefone() { return telefone; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setIdentidade(String identidade) { this.identidade = identidade; }
//    public void setRua(String rua) { this.rua = rua; }
//    public void setNumero(int numero) { this.numero = numero; }
//    public void setCep(String cep) { this.cep = cep; }
//    public void setEstado(String estado) { this.estado = estado; }
//    public void setCidade(String cidade) { this.cidade = cidade; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}