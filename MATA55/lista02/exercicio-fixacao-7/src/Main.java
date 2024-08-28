import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de caixas: ");
        int numeroDeCaixas = scanner.nextInt();
        scanner.nextLine();

        Banco banco = new Banco(numeroDeCaixas);

        for (int i = 0; i < numeroDeCaixas; i++) {
            System.out.print("Digite o nome do Caixa " + (i + 1) + ": ");
            String nomeCaixa = scanner.nextLine();
            Caixa caixa = new Caixa(nomeCaixa, i + 1);
            banco.adicionarCaixa(caixa);
        }

        while (true) {
            System.out.println("\n1. Adicionar Cliente");
            System.out.println("\n2. Chamar Próximo Cliente");
            System.out.println("\n3. Adicionar Caixa");
            System.out.println("\n4. Remover Caixa");
            System.out.println("\n5. Sair");
            System.out.print("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome do cliente: ");
                String nomeCliente = scanner.nextLine();
                System.out.print("Digite a senha do cliente: ");
                String senhaCliente = scanner.nextLine();
                Cliente cliente = new Cliente(nomeCliente, senhaCliente);
                banco.adicionarCliente(cliente);
            } else if (opcao == 2) {
                System.out.print("Digite o número do caixa que irá chamar o próximo cliente: ");
                int numeroCaixa = scanner.nextInt();
                banco.chamarProximoCliente(numeroCaixa);
            } else if (opcao == 3) {
                System.out.print("Digite o nome do novo caixa: ");
                String nomeCaixa = scanner.nextLine();
                System.out.print("Digite o número do novo caixa: ");
                int numeroNovoCaixa = scanner.nextInt();
                scanner.nextLine();
                Caixa caixa = new Caixa(nomeCaixa, numeroNovoCaixa);
                banco.adicionarCaixa(caixa);
            } else if (opcao == 4) {
                System.out.print("Digite o número do caixa a ser removido: ");
                int numeroCaixa = scanner.nextInt();
                banco.removerCaixa(numeroCaixa);
            } else if (opcao == 5) {
                break;
            }
        }

        scanner.close();
    }
}