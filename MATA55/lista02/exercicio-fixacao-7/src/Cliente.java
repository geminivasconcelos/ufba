public class Cliente extends Pessoa{
    private String senha;
    public Cliente(String nome, String senha) {
        super(nome);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
}
