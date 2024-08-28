import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SistemaIPTU {
    private List<Beneficiario> beneficiarios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void menuPrincipal() {
        int opcao;
        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Menu Beneficiário");
            System.out.println("2. Menu Serviços IPTU");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    menuBeneficiario();
                    break;
                case 2:
                    menuServicosIPTU();
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);
    }

    private void menuBeneficiario() {
        int opcao;
        do {
            System.out.println("\n--- Menu Beneficiário ---");
            System.out.println("1. Cadastrar Beneficiário");
            System.out.println("2. Associar Imóvel ao Beneficiário");
            System.out.println("3. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarBeneficiario();
                    break;
                case 2:
                    associarImovel();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);
    }

    private void menuServicosIPTU() {
        int opcao;
        do {
            System.out.println("\n--- Menu Serviços IPTU ---");
            System.out.println("1. Consultar Proprietários");
            System.out.println("2. Imóveis por Proprietário");
            System.out.println("3. Valor do IPTU de um Imóvel");
            System.out.println("4. Consultar Isenção de IPTU");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    consultarProprietarios();
                    break;
                case 2:
                    consultarImoveisPorProprietario();
                    break;
                case 3:
                    consultarIPTUImovel();
                    break;
                case 4:
                    consultarIsencao();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
    }

    private void cadastrarBeneficiario() {
        System.out.print("Nome do beneficiário: ");
        String nome = scanner.nextLine();
        System.out.print("RG do beneficiário: ");
        String rg = scanner.nextLine();
        System.out.print("CPF do beneficiário: ");
        String cpf = scanner.nextLine();
        System.out.print("Valor da renda: ");
        double renda = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner
        Beneficiario novoBeneficiario = new Beneficiario(nome, rg, cpf, renda);
        beneficiarios.add(novoBeneficiario);
        System.out.println("Beneficiário cadastrado com sucesso!");
    }

    private void associarImovel() {
        System.out.print("RG do beneficiário para associar o imóvel: ");
        String rg = scanner.nextLine();
        Beneficiario beneficiario = beneficiarios.stream()
                .filter(b -> b.getRg().equals(rg))
                .findFirst()
                .orElse(null);
        if (beneficiario == null) {
            System.out.println("Beneficiário não encontrado!");
            return;
        }

        System.out.print("Tipo de imóvel (CASA, APTO, OUTRO): ");
        Imovel.Tipo tipo = Imovel.Tipo.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Área do imóvel (em metros quadrados): ");
        int area = scanner.nextInt();
        System.out.print("Tempo de moradia (em anos): ");
        int tempoMoradia = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Imovel novoImovel = new Imovel(area, tipo, tempoMoradia);
        beneficiario.adicionarImovel(novoImovel);
        System.out.println("Imóvel adicionado com sucesso ao beneficiário " + beneficiario.getNome());
    }

    private void consultarProprietarios() {
        if (beneficiarios.isEmpty()) {
            System.out.println("Não há beneficiários cadastrados.");
            return;
        }
        for (Beneficiario b : beneficiarios) {
            System.out.println("Nome: " + b.getNome() + ", RG: " + b.getRg() + ", CPF: " + b.getCpf() + ", Renda: R$" + b.getRenda());
        }
    }

    private void consultarImoveisPorProprietario() {
        System.out.print("Digite o RG do beneficiário: ");
        String rg = scanner.nextLine();
        Beneficiario beneficiario = beneficiarios.stream()
                .filter(b -> b.getRg().equals(rg))
                .findFirst()
                .orElse(null);
        if (beneficiario == null) {
            System.out.println("Beneficiário não encontrado!");
            return;
        }
        List<Imovel> imoveis = beneficiario.getImoveis();
        if (imoveis.isEmpty()) {
            System.out.println("Não há imóveis cadastrados para este beneficiário.");
            return;
        }
        for (Imovel i : imoveis) {
            System.out.println("Tipo: " + i.getTipo() + ", Área: " + i.getArea() + "m², IPTU: R$" + i.getValorIPTU());
        }
    }

    private void consultarIPTUImovel() {
        System.out.print("Digite o RG do beneficiário: ");
        String rg = scanner.nextLine();
        Beneficiario beneficiario = beneficiarios.stream()
                .filter(b -> b.getRg().equals(rg))
                .findFirst()
                .orElse(null);
        if (beneficiario == null) {
            System.out.println("Beneficiário não encontrado!");
            return;
        }
        System.out.print("Digite o tipo de imóvel (CASA, APTO, OUTRO): ");
        Imovel.Tipo tipo = Imovel.Tipo.valueOf(scanner.nextLine().toUpperCase());
        for (Imovel i : beneficiario.getImoveis()) {
            if (i.getTipo() == tipo) {
                System.out.println("IPTU do Imóvel: R$" + i.getValorIPTU());
                return;
            }
        }
        System.out.println("Não foi encontrado um imóvel do tipo " + tipo + " para este beneficiário.");
    }

    private void consultarIsencao() {
        System.out.print("Digite o RG do beneficiário para consulta de isenções: ");
        String rg = scanner.nextLine();
        Beneficiario beneficiario = beneficiarios.stream()
                .filter(b -> b.getRg().equals(rg))
                .findFirst()
                .orElse(null);
        if (beneficiario == null) {
            System.out.println("Beneficiário não encontrado!");
            return;
        }
        if (beneficiario.getImoveis().isEmpty()) {
            System.out.println("Não há imóveis cadastrados para este beneficiário.");
            return;
        }
        for (Imovel imovel : beneficiario.getImoveis()) {
            double isencao = imovel.calculaIsencao(beneficiario);
            System.out.printf("Imóvel tipo %s, Área %d, Isenção: R$%.2f\n", imovel.getTipo(), imovel.getArea(), isencao);
        }
    }
}

