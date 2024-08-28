import java.util.LinkedList;
import java.util.Queue;

public class Banco {
    private Queue<Cliente> filaDeClientes;
    private Caixa[] caixas;

    public Banco(int numeroDeCaixas) {
        filaDeClientes = new LinkedList<>();
        caixas = new Caixa[numeroDeCaixas];
    }

    public void adicionarCaixa(Caixa caixa) {
        for (int i = 0; i < caixas.length; i++) {
            if (caixas[i] == null) {
                caixas[i] = caixa;
                break;
            }
        }
    }

    public void removerCaixa(int numeroCaixa) {
        for (int i = 0; i < caixas.length; i++) {
            if (caixas[i] != null && caixas[i].getNumeroCaixa() == numeroCaixa) {
                caixas[i] = null;
                break;
            }
        }
    }

    public void adicionarCliente(Cliente cliente) {
        filaDeClientes.add(cliente);
    }

    public void chamarProximoCliente(int numeroCaixa) {
        if (filaDeClientes.isEmpty()) {
            System.out.println("Não há clientes na fila.");
            return;
        }
        Cliente proximoCliente = filaDeClientes.poll();
        for (Caixa caixa : caixas) {
            if (caixa != null && caixa.getNumeroCaixa() == numeroCaixa) {
                caixa.chamarCliente(proximoCliente);
                break;
            }
        }
    }
}