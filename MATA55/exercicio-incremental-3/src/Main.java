import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do proprietário
        System.out.print("Digite o nome do proprietário: ");
        String nomeProprietario = scanner.nextLine();
        System.out.print("Digite o CPF do proprietário: ");
        String cpfProprietario = scanner.nextLine();
        Proprietario proprietario1 = new Proprietario(nomeProprietario, cpfProprietario);

        // Loop para adicionar múltiplos imóveis
        boolean adicionarMais = true;
        while (adicionarMais) {
            // Perguntar tipo de imóvel
            System.out.print("Deseja adicionar uma Casa ou Apartamento? (C/A): ");
            String tipoImovel = scanner.nextLine().toUpperCase();

            Imovel imovel;
            if (tipoImovel.equals("C")) {
                // Entrada de dados da Casa
                System.out.print("Digite o endereço da casa: ");
                String enderecoCasa = scanner.nextLine();
                System.out.print("Digite o valor da casa: ");
                double valorCasa = scanner.nextDouble();
                System.out.print("Digite o número de quartos da casa: ");
                int quartosCasa = scanner.nextInt();
                scanner.nextLine(); // Consumir o restante da linha
                imovel = new Casa(enderecoCasa, valorCasa, proprietario1, quartosCasa);
            } else {
                // Entrada de dados do Apartamento
                System.out.print("Digite o endereço do apartamento: ");
                String enderecoApto = scanner.nextLine();
                System.out.print("Digite o valor do apartamento: ");
                double valorApto = scanner.nextDouble();
                System.out.print("Digite o número de quartos do apartamento: ");
                int quartosApto = scanner.nextInt();
                System.out.print("Digite o andar do apartamento: ");
                int andar = scanner.nextInt();
                System.out.print("Digite a taxa de condomínio do apartamento: ");
                double taxaCondominio = scanner.nextDouble();
                scanner.nextLine(); // Consumir o restante da linha
                imovel = new Apartamento(enderecoApto, valorApto, proprietario1, quartosApto, andar, taxaCondominio);
            }

            // Adicionando o imóvel ao proprietário
            proprietario1.adicionarImovel(imovel);

            // Entrada de dados do inquilino para o imóvel
            System.out.print("Digite o nome do inquilino: ");
            String nomeInquilino = scanner.nextLine();
            System.out.print("Digite o CPF do inquilino: ");
            String cpfInquilino = scanner.nextLine();
            Inquilino inquilino = new Inquilino(nomeInquilino, cpfInquilino);

            // Entrada de dados da locação para o imóvel
            System.out.print("Digite a data de início da locação (dd/MM/yyyy): ");
            String dataInicio = scanner.nextLine();
            System.out.print("Digite a data de término da locação (dd/MM/yyyy): ");
            String dataTermino = scanner.nextLine();
            Locacao locacao = new Locacao(dataInicio, dataTermino, inquilino);

            // Adicionando locação ao imóvel
            imovel.adicionarLocacao(locacao);

            // Avaliando o inquilino para o imóvel
            System.out.print("Digite a nota do inquilino: ");
            int nota = scanner.nextInt();
            scanner.nextLine(); // Consumir o restante da linha
            proprietario1.avaliarInquilino(imovel, inquilino, nota);

            // Perguntar se deseja adicionar outro imóvel
            System.out.print("Deseja adicionar outro imóvel? (S/N): ");
            String resposta = scanner.nextLine().toUpperCase();
            adicionarMais = resposta.equals("S");
        }

        // Exibindo informações dos imóveis e histórico de locação
        System.out.println("\nImóveis do proprietário: " + proprietario1.getNome());
        for (Imovel imovel : proprietario1.getImoveis()) {
            System.out.println("\nEndereço: " + imovel.getEndereco() + ", Valor: " + imovel.getValor());
            System.out.println("Histórico de locação:");
            for (Locacao locacao : imovel.getHistoricoLocacao()) {
                System.out.println("Inquilino: " + locacao.getInquilino().getNome() + ", Nota: " + locacao.getNota());
            }
        }

        scanner.close();
    }
}
