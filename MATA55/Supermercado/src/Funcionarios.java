public class Funcionarios {

    private String nome;
    private String cpf;
    private double salario;

    public Funcionarios(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public double getSalario(){
        return salario;
    }

    public double calculaSalario(){
        return salario;
    }


}
