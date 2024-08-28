public class Empacotadores extends Funcionarios{

    private boolean possuiDeficiencia;

    public Empacotadores(String nome, String cpf, double salario, boolean possuiDeficiencia){
        super(nome, cpf, salario);
        this.possuiDeficiencia = possuiDeficiencia;
    }

    @Override
    public double calculaSalario(){
        if(getPossuiDeficiencia()){
            return (getSalario() * 0.10) + getSalario();
        }else{
            return getSalario();
        }
    }

    public boolean getPossuiDeficiencia(){
        return possuiDeficiencia;
    }
}
