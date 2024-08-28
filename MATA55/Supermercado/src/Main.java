public class Main {
    public static void main(String[] args) {

        Funcionarios funcionarios = new Funcionarios("Sheldon", "1234567890", 2324.423);
        Empacotadores empacotador = new Empacotadores("Bernadete", "2342342342", 23423.24, true);
        OperadoresCaixa operadorCaixa = new OperadoresCaixa("Leonard", "2423423534", 4534.345, 23);


        System.out.println("Dados Funcionario: " + "\nNome: " + funcionarios.getNome() + "\nCPF: " + funcionarios.getCpf()  + "\nSalario: " + funcionarios.getSalario());
        System.out.println("");
        System.out.println("Dados Empacotador: " + "\nNome: " + empacotador.getNome() + "\nCPF: " + empacotador.getCpf()  + "\nSalario: " + empacotador.getSalario() + "\nPossui Deficiência: " + empacotador.getPossuiDeficiencia());
        System.out.println("");
        System.out.println("Dados Operador de Caixa: " + "\nNome: " + operadorCaixa.getNome() + "\nCPF: " + operadorCaixa.getCpf()  + "\nSalario: " + operadorCaixa.getSalario() + "\nQuantidade de Horas Extras: " + operadorCaixa.getQuantidadeHorasExtra());
    }
}