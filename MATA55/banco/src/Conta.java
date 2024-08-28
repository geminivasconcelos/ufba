public abstract class Conta{

    protected String titular;
    protected String numeroConta;
    protected String numeroAgencia;
    protected float saldo;

    public Conta(String titular, String numeroConta, String numeroAgencia, float saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public String getNumeroAgencia(){
        return numeroAgencia;
    }

    public float getSaldo(){
        return saldo;
    }

    public void depositarConta(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }

    public abstract void saque(float valor);



    public String toString() {
        // Corrigido para formatar corretamente o saldo e evitar exceções
        return String.format("Titular: %s, Conta: %s, Agência: %s, Saldo: %.2f", titular, numeroConta, numeroAgencia, saldo);
    }
}