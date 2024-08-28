public class ContaCorrente extends Conta{

    private float taxaConta;
    private float limiteEspecial;


    public ContaCorrente(String titular, String numeroConta, String numeroAgencia, float saldo, float taxaConta, float limiteEspecial){
        super(titular, numeroConta, numeroAgencia, saldo);
        this.taxaConta = taxaConta;
        this.limiteEspecial = limiteEspecial;
    }

    public void ManutencaoMensa(){
        this.saldo -= taxaConta;
    }

    @Override
    public void saque(float valor){
        if (valor > 0 && valor <= (this.saldo + this.limiteEspecial)) {
            this.saldo -= valor;
        }
    }

    public double getTaxaConta(){
        return taxaConta;
    }

    public double limiteEspecial(){
        return limiteEspecial;
    }
}