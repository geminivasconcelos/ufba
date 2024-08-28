public class Cinema {

    String nomeFilme;
    double valorIngresso;
    int numeroPoltrona;
    String lanche;
    String tipoIngresso;

    public Cinema(String filme, String tipoIngresso, double valorIngresso){
        this.nomeFilme = filme;
        this.tipoIngresso = tipoIngresso;
        this.valorIngresso = valorIngresso;
        this.lanche = null;
        this.numeroPoltrona = 0;
    }

    public Cinema(String filme, String tipoIngresso, double valorIngresso, String lanche){
        this.nomeFilme = filme;
        this.tipoIngresso = tipoIngresso;
        this.valorIngresso = valorIngresso;
        this.lanche = lanche;
        this.numeroPoltrona = 0;
    }

    public Cinema(String filme, String tipoIngresso, double valorIngresso, String lanche, int numeroPoltrona){
        this.nomeFilme = filme;
        this.tipoIngresso = tipoIngresso;
        this.valorIngresso = valorIngresso;
        this.lanche = lanche;
        this.numeroPoltrona = numeroPoltrona;
    }

    public void comprarIngresso(String tipoIngressoSolicitado){
        if(lanche == null && this.numeroPoltrona == 0){
            System.out.println("Nome do filme: " +nomeFilme + " Valor do ingresso: " +calcularValorIngresso(tipoIngressoSolicitado));
        }if(lanche != null && this.numeroPoltrona == 0){
            System.out.println("Nome do filme: " +nomeFilme + "Lanche solicitado" +lanche+ "Valor do ingresso: " +calcularValorIngresso(tipoIngressoSolicitado));

        }if(lanche != null && this.numeroPoltrona != 0){
            System.out.println("Nome do filme: " +nomeFilme + "Lanche solicitado: " +lanche+ "Número da poltrona: " +numeroPoltrona+ "Valor do ingresso: " +calcularValorIngresso(tipoIngressoSolicitado));
        }
    }

    public double calcularValorIngresso(String tipoIngressoSolicitado){
        if(tipoIngressoSolicitado.equals(tipoIngresso)){
            return valorIngresso/2;
        }else{
            return valorIngresso;
        }
    }

//    public void comprarIngresso(String tipoIngressoSolicitado, double valorIngresso, String lanche){
//        if(tipoIngressoSolicitado.equals(tipoIngresso)){
//            System.out.println("Nome do filme: " +nomeFilme + " Valor do ingresso: " +valorIngresso/2 + "Lanche comprado: " +lanche);
//        }else{
//            System.out.println("Nome do filme: " +nomeFilme + " Valor do ingresso: " +valorIngresso + "Lanche comprado: " +lanche);
//
//        }
//    }
//
//    public void comprarIngresso(String tipoIngressoSolicitado, double valorIngresso, String lanche, int reservaPoltrona){
//        if(tipoIngressoSolicitado.equals(tipoIngresso)){
//            System.out.println("Nome do filme: " +nomeFilme + " Valor do ingresso: " +valorIngresso/2 + "Lanche comprado: " +lanche + "Poltrona reservada: " +reservaPoltrona);
//        }else{
//            System.out.println("Nome do filme: " +nomeFilme + " Valor do ingresso: " +valorIngresso + "Lanche comprado: " +lanche + "Poltrona reservada: " +reservaPoltrona);
//
//        }
//    }
}
