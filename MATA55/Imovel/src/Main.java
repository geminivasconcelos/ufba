public class Main {
    public static void main(String[] args) {
        Endereco enderecoProprietario = new Endereco("Rua das Neves", 100, "31200-000", "Miami", "Florida");
        Endereco enderecoImovel = new Endereco("Rua das Neves", 100, "31200-000", "Miami", "Florida");


        Proprietario proprietario = new Proprietario("Akin Santos Silva", "1293812389192", "123456789", "1234-5678",enderecoProprietario);
        Imovel imovel = new Imovel(enderecoImovel, "Casa", "Campo");


        Contrato contrato = new Contrato(proprietario, imovel, 10.0f, null);

        System.out.println("Detalhes do Proprietário:");
        System.out.println("Nome: " + proprietario.getNome());
        System.out.println("CPF: " + proprietario.getCpf());
        System.out.println("Endereço: " + proprietario.getEndereco().getRua() + ", Número: " + proprietario.getEndereco().getNumero());


        System.out.println("\nDetalhes do Imóvel:");
        System.out.println("Rua: " + imovel.getEndereco().getRua() + ", Número: " + imovel.getEndereco().getNumero());
        System.out.println("Tipo: " + imovel.getTipo() + ", Utilização: " + imovel.getUtilizacao());


        System.out.println("\nDetalhes do Contrato:");
        System.out.println("Percentual de Desconto: " + contrato.getPercentualDesconto() + "%");
        System.out.println("Vigência do Contrato: " + contrato.getVigencia() + " anos");
    }
}
