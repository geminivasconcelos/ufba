public class Caixa extends Pessoa{

    private int numeroCaixa;
    public Caixa(String nome, int numeroCaixa) {
        super(nome);
        this.numeroCaixa = numeroCaixa;
    }

    public int getNumeroCaixa() {
        return numeroCaixa;
    }

    public void chamarCliente(Cliente cliente) {
        System.out.println("Cliente " + cliente.getSenha() + " dirija-se para o Caixa " + numeroCaixa);
    }
}
