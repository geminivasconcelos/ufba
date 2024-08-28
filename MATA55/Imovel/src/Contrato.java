public class Contrato {
    private Proprietario proprietario;
    private Imovel imovel;
    private float percentualDesconto;
    private int vigencia;

    public Contrato(Proprietario proprietario, Imovel imovel, float percentualDesconto, Integer vigencia) {
        this.proprietario = proprietario;
        this.imovel = imovel;
        this.percentualDesconto = percentualDesconto;
        this.vigencia = (vigencia != null) ? vigencia : 2;
    }

    // Getters
    public Proprietario getProprietario() { return proprietario; }
    public Imovel getImovel() { return imovel; }
    public float getPercentualDesconto() { return percentualDesconto; }

    public int getVigencia(){
        return  vigencia;
    }

    // Setters
    public void setProprietario(Proprietario proprietario) { this.proprietario = proprietario; }
    public void setImovel(Imovel imovel) { this.imovel = imovel; }
    public void setPercentualDesconto(float percentualDesconto) { this.percentualDesconto = percentualDesconto; }

    public void setVigencia(int vigencia){
        this.vigencia = vigencia;
    }
}