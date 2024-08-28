public class Imovel {
    private String tipo;
    private String utilizacao;
    private Endereco endereco;

    public Imovel(Endereco endereco, String tipo, String utilizacao) {
        this.endereco = endereco;
        this.tipo = tipo;
        this.utilizacao = utilizacao;
    }

    // Getters
    public String getTipo() { return tipo; }
    public String getUtilizacao() { return utilizacao; }
    public Endereco getEndereco(){
        return endereco;

    }

    // Setters
    public void setTipo(String tipo) { this.tipo = tipo; }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setUtilizacao(String utilizacao) { this.utilizacao = utilizacao; }
}