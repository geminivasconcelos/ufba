import java.util.ArrayList;
import java.util.List;

public class Corretora {

    private List<Pessoa> clientes;

    public Corretora(){
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Pessoa pessoa) {
        clientes.add(pessoa);
    }
    
    public void listarClientes() {
        for (Pessoa pessoa : clientes) {
            System.out.println("Nome: " + pessoa.getNome() +
                    ", CPF: " + pessoa.getCpf() +
                    ", Valor do Empréstimo: R$ " + pessoa.calcularEmprestimo());
        }
    }

}
