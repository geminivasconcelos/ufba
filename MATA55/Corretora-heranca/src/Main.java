public class Main {
    public static void main(String[] args) {

        Corretora corretora = new Corretora();

        Pessoa pessoa = new Pessoa("João Silva", "12345678900");
        Empregade empregado = new Empregade("Maria Oliveira", "98765432100", 3000);
        Empregade chefe = new Chefia("Carlos Souza", "11122233344", 5000, 2000);


        corretora.adicionarCliente(pessoa);
        corretora.adicionarCliente(empregado);
        corretora.adicionarCliente(chefe);


        corretora.listarClientes();
    }
}