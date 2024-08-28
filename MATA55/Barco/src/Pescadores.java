import exceptions.ExcecaoCapacidade;
import exceptions.ExcecaoLicenca;

import java.util.List;
public abstract class Pescadores {
    private String nome;
    private int idade;
    private List<Embarcacoes> barcos;

    public Pescadores(String nome, int idade, List<Embarcacoes> barcos) {
        this.nome = nome;
        this.idade = idade;
        this.barcos = barcos;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public List<Barcos> getBarcos() {
        return barcos;
    }

    public abstract void iniciarAtividadeDePesca(Barco barco, double tempoPesca) throws ExcecaoCapacidade, ExcecaoLicenca;
}
