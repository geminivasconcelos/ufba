public class Chefia extends Empregade{
    private double bonus;

    public Chefia(String nome, String cpf, double bonus, double salario){
        super(nome, cpf, salario);
        this.bonus = bonus;
    }

    //@Override indica que estamos sobrescrevendo o metodo da classe pai
    @Override
    public double calcularEmprestimo(){
        return (getSalario() * 2) + bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
