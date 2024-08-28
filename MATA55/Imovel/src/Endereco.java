public class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, int numero, String cep, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.cidade = (cidade != null) ? cidade : "Salvador";
        this.estado = (estado != null) ? estado : "Bahia";
    }

    public void atualizaEndereco(String rua, int numero, String cep, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        if (cidade != null) this.cidade = cidade;
        if (estado != null) this.estado = estado;
    }

    // Getters e Setters
    public String getRua() { return rua; }
    public int getNumero() { return numero; }
    public String getCidade() { return cidade; }
    public String getEstado() { return estado; }
    public String getCep() { return cep; }

    public void setRua(String rua) { this.rua = rua; }
    public void setNumero(int numero) { this.numero = numero; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setCep(String cep) { this.cep = cep; }
}
