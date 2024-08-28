public class IPTU {

    String nome;
    String rg;
    String cpf;
    String tipoImovel;
    double tamanhoImovel;
    double valorRenda;
    String beneficioRecebido;
    double debitoIptu;
    int tempoMoradia;

    public Cadastro(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
        this.cpf = null;
        this.tipoImovel = null;
        this.tamanhoImovel = 0;
        this.valorRenda = 0;
        this.beneficioRecebido = null;
        this.debitoIptu = 0;
        this.tempoMoradia = 0;
    }

    public Cadastro(String nome, String rg, String cpf, String tipoImovel, double tamanhoImovel, double valorRenda, String beneficioRecebido, double debitoIptu, int tempoMoradia){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.tipoImovel = tipoImovel;
        this.tamanhoImovel = tamanhoImovel;
        this.valorRenda = valorRenda;
        this.beneficioRecebido = beneficioRecebido;
        this.debitoIptu = 0;
        this.tempoMoradia = tempoMoradia;
    }

    public double calcularDebitoIptu(String tipoImovel, double tamanhoImovel){
        double valorBase = switch (this.tipo) {
            case CASA -> 59.76;
            case APTO -> 72.98;
            default -> 98.58;
        };
        this.debitoIptu = valorBase * tamanhoImovel;
        return valorBase * tamanhoImovel;
    }

    public double calcularInsencao(){
        if (this.debitoIptu <= 96066.57 || this.tempoMoradia > 10) {
            return valorIPTU; // 100% de isenção
        } else if (beneficiario.getRenda() < 1024) {
            return valorIPTU * 0.5; // 50% de isenção
        } else {
            return 0;
        }
    }

}
