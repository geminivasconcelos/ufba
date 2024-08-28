public class ContaPoupanca extends Conta{

    private float rendimentoMensal;

    public ContaPoupanca(String titular, String numeroConta, String numeroAgencia, float saldo, float rendimentoMensal){
        super(titular, numeroConta, numeroAgencia, saldo);
        this.rendimentoMensal = rendimentoMensal;
    }

    public float getRendimentoMensal(){
        return rendimentoMensal;
    }


    @Override
    public void saque(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void aplicarRendimento(){
        double rendimento = saldo * (rendimentoMensal / 100);
        this.saldo += rendimento;
    }
}