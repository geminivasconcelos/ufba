
public class Main {
    public static void main(String[] args) {
        Fiador fiador1 = new Fiador("Pedro", "123.456.789-00", "999999999", 3000.0f);
        //situacao1 - construtor COM fiador
        float renda = fiador1.getRenda();
        float valorAluguel = 1320.0f;
        if (renda >= 3 * (valorAluguel)) {
            Contrato contrato1 = new Contrato("Rua A, 123", "123456789", "João", "123.456.789-01", renda, fiador1);
            System.out.println("Dados do contrato: " + ", Endereço do imóvel: " + contrato1.getEndereco() + ", Nome do proprietário: " + contrato1.getNomeProprietario() + ", Nome do fiador: " + contrato1.getFiador());
        } else {
            System.out.println("Renda insuficiente para contratar o imóvel.");
        }
//situacao2 - construtor SEM fiador
        Contrato contratoSemFiador = new Contrato("Rua Neiva, 123", "123456789", "Zé Hugo", "123.456.789-00", valorAluguel);
        if(contratoSemFiador.getStatus().equals("ativo")) {
            System.out.println("Contrato ativado sem verificação.");
        } else {
            System.out.println("Contrato não ativado devido à verificação de renda do fiador.");
        }




    }



}