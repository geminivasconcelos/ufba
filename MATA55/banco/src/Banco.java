import java.util.ArrayList;
import java.util.List;

class Banco {
    private List<Conta> contas;
    private List<String> auditoria;

    public Banco() {
        contas = new ArrayList<>();
        auditoria = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void removerConta(Conta conta) {
        contas.remove(conta);
    }

    public void deposito(Conta conta, float valor) {
        conta.depositarConta(valor);
    }

    public void saque(Conta conta, float valor) {
        conta.saque(valor);
        if (valor > 500) {
            // Corrigindo a formatação para que todos os parâmetros estejam presentes
            auditoria.add(String.format("Titular: %s, Conta: %s, Agência: %s, Valor: %.2f", conta.getTitular(), conta.getNumeroConta(), conta.getNumeroAgencia(), valor));
        }
    }

    public String consultarAuditoria() {
        StringBuilder sb = new StringBuilder();
        for (String registro : auditoria) {
            sb.append(registro).append("\n");
        }
        return sb.toString();
    }
}
