package interfacegrafica;

import dominio.*;

public class Main {
    public static void main(String[] args) {
        EntradaDadosInterface entrada = new EntradaDadosConsole();

        // Exemplo de uso:
        Proprietario proprietario = new Proprietario("Teste de Silva", "123.456.789-00");
        Imovel imovel = entrada.criarImovel(proprietario);
        Inquilino inquilino = entrada.criarInquilino();
        Locacao locacao = entrada.criarLocacao(inquilino);

        // Adiciona a locação ao histórico do imóvel
        imovel.adicionarLocacao(locacao);

        // Avalia o inquilino (Exemplo de nota fixa)
        proprietario.avaliarInquilino(imovel, inquilino, 8);

        // Exibe as informações do imóvel e seu histórico de locação
        System.out.println("\nInformações do imóvel:");
        System.out.println("Endereço: " + imovel.getEndereco());
        System.out.println("Valor: " + imovel.getValor());

        System.out.println("\nHistórico de locação:");
        for (Locacao l : imovel.getHistoricoLocacao()) {
            System.out.println("Inquilino: " + l.getInquilino().getNome());
            System.out.println("Nota: " + l.getNota());
            System.out.println("Data de início: " + l.getDataInicio());
            System.out.println("Data de término: " + l.getDataFim());
            System.out.println("---");
        }

        // Adiciona o imóvel à lista de imóveis do proprietário
        proprietario.adicionarImovel(imovel);

        // Exibe as informações do proprietário e seus imóveis
        System.out.println("\nInformações do proprietário:");
        System.out.println("Nome: " + proprietario.getNome());
        System.out.println("CPF: " + proprietario.getCpf());

        System.out.println("\nImóveis do proprietário:");
        for (Imovel i : proprietario.getImoveis()) {
            System.out.println("Endereço: " + i.getEndereco() + ", Valor: " + i.getValor());
        }
    }
}
