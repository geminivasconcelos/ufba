public class OperadoresCaixa extends Funcionarios{

    private double quantidadeHorasExtra;

    public OperadoresCaixa(String nome, String cpf, double salario, double quantidadeHorasExtra){
        super(nome, cpf, salario);
        this.quantidadeHorasExtra = quantidadeHorasExtra;
    }

    public double getQuantidadeHorasExtra(){
        return quantidadeHorasExtra;
    }

    @Override
    public double calculaSalario(){
        if(getQuantidadeHorasExtra() > 0){
            return (getQuantidadeHorasExtra() * 10) + getQuantidadeHorasExtra();
        }else{
            return getQuantidadeHorasExtra();
        }
    }
}
