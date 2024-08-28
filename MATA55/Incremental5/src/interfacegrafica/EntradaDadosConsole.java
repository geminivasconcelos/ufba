package interfacegrafica;

import dominio.*;
import java.util.Scanner;

public class EntradaDadosConsole implements EntradaDadosInterface {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public Imovel criarImovel(Proprietario proprietario) {
        System.out.println("Digite o tipo de imóvel (casa/apartamento):");
        String tipoImovel = scanner.nextLine().toLowerCase();

        System.out.println("Digite o endereço do imóvel:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o valor do imóvel:");
        double valor = scanner.nextDouble();

        Imovel imovel = null;

        if (tipoImovel.equals("casa")) {
            System.out.println("Digite o número de quartos:");
            int numeroQuartos = scanner.nextInt();

            System.out.println("Digite a área do terreno:");
            double areaTerreno = scanner.nextDouble();

            imovel = new Casa(endereco, valor, proprietario, numeroQuartos, areaTerreno);

        } else if (tipoImovel.equals("apartamento")) {
            System.out.println("Digite o número de quartos:");
            int numeroQuartos = scanner.nextInt();

            System.out.println("Digite o andar:");
            int andar = scanner.nextInt();

            System.out.println("Digite o valor do condomínio:");
            double valorCondominio = scanner.nextDouble();

            imovel = new Apartamento(endereco, valor, proprietario, numeroQuartos, andar, valorCondominio);
        }

        scanner.nextLine(); // Limpar o buffer

        if (imovel != null) {
            proprietario.adicionarImovel(imovel);
            System.out.println("Imóvel criado com sucesso.");
        } else {
            System.out.println("Tipo de imóvel inválido.");
        }

        return imovel;
    }

    @Override
    public Inquilino criarInquilino() {
        System.out.println("Digite o nome do inquilino:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do inquilino:");
        String cpf = scanner.nextLine();

        Inquilino inquilino = new Inquilino(nome, cpf);
        System.out.println("Inquilino criado com sucesso.");

        return inquilino;
    }

    @Override
    public Locacao criarLocacao(Inquilino inquilino) {
        System.out.println("Digite a data de início da locação (dd/mm/aaaa):");
        String dataInicio = scanner.nextLine();

        System.out.println("Digite a data de término da locação (dd/mm/aaaa):");
        String dataFim = scanner.nextLine();

        Locacao locacao = new Locacao(dataInicio, dataFim, inquilino);
        System.out.println("Locação criada com sucesso.");

        return locacao;
    }
}
