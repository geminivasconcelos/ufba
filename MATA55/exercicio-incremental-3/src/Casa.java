public class Casa extends  Imovel{

    private int numeroQuartos;
    private double areaTerreno;

    public Casa(java.lang.String endereco, double valor, Proprietario proprietario, int numeroQuartos) {
        super(endereco, valor, proprietario);
        this.numeroQuartos = numeroQuartos;
        this.areaTerreno = areaTerreno;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }
    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public double getAreaTerreno() {
        return areaTerreno;
    }
    public void setAreaTerreno(double areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

}
