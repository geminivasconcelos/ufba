public class Empregade extends Pessoa{
    private double salario;

    public Empregade(String nome, String cpf, double salario){
        super(nome, cpf);
        this.salario = salario;
    }


    public double getSalario(){
        return salario;
    }

    @Override
    public double calcularEmprestimo(){
        return getSalario() * 2;
    }


}
