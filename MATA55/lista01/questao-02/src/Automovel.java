public class Automovel {

    String tipoCombustivel;
    String fabricante;
    int ano;
    String modelo;
    double quilometrosPercorridos;

    public Automovel(String tipoCombustivel, String fabricante, int ano, String modelo, double quilometrosPercorridos){
        this.tipoCombustivel = tipoCombustivel;
        this.fabricante = fabricante;
        this.ano = ano;
        this.modelo = modelo;
        this.quilometrosPercorridos = quilometrosPercorridos;
    }

    public void calcularQuantidadeCombustivel(double quantidadeQuilometro, String tipoCombustivel){
        switch (tipoCombustivel){
            case "gasolina":
                System.out.println("Quantidade combustivel necessaria: " +quantidadeQuilometro*12);
                break;
            case "alcool":
                System.out.println("Quantidade combustivel necessaria: " + quantidadeQuilometro*15);
                break;
            case "flex":
                System.out.println("Quantidade combustivel necessaria: " +(quantidadeQuilometro/2 * 12) + (quantidadeQuilometro/2 * 15));
            default:
                throw new java.lang.IllegalStateException("Unexpected value: " + tipoCombustivel);
        }
    }

    public String getTipoCombustivel(){
        return tipoCombustivel;
    }

    public int getAno(){
        return ano;
    }

    public String getFabricante(){
        return fabricante;
    }

    public String getModelo(){
        return modelo;
    }

    public double getQuilometrosPercorridos(){
        return quilometrosPercorridos;
    }
}
