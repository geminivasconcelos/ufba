import java.util.List;
import java.util.ArrayList;
public class Beneficiario {

    private String nome;
    private String rg;
    private String cpf;
    private Double valorRenda;
    private List<Imovel> imoveis = new ArrayList<>();

    public Beneficiario(String nome, String rg, String cpf, double valorRenda) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.valorRenda = valorRenda;
    }


    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public String getNome() {
        return nome;
    }

    public double getRenda() {
        return valorRenda;
    }

    public String getRg(){
        return rg;
    }


    public String getCpf(){
        return cpf;
    }


}
