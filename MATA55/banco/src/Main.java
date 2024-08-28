public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        ContaCorrente contaCorrente = new ContaCorrente("João Silva", "123456", "001", 1000.00f, 50.00f, 500.00f);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria Oliveira", "654321", "002", 2000.00f, 1.5f);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        banco.deposito(contaCorrente, 200.00f);
        banco.deposito(contaPoupanca, 300.00f);

        banco.saque(contaCorrente, 1500.00f); // Deve considerar o limite especial
        banco.saque(contaPoupanca, 500.00f);   // Deve considerar apenas o saldo

        contaCorrente.ManutencaoMensa();
        contaPoupanca.aplicarRendimento();

        String auditoria = banco.consultarAuditoria();
        System.out.println("Auditoria de Saques Maiores que 500:");
        System.out.println(auditoria);

        System.out.println("\nSaldo das Contas:");
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}
