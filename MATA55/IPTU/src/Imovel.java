public class Imovel {

    private int area;
    public enum Tipo {CASA, APTO, OUTRO};
    private Tipo tipo;
    private double valorIPTU;
    private int tempoMoradia;

    public Imovel(int area, Tipo tipo, int tempoMoradia) {
        this.area = area;
        this.tipo = tipo;
        this.tempoMoradia = tempoMoradia;
        this.valorIPTU = calculaIPTU();
    }

    private double calculaIPTU() {
        double valorBase = switch (this.tipo) {
            case CASA -> 59.76;
            case APTO -> 72.98;
            default -> 98.58;
        };
        return valorBase * this.area;
    }

    public double calculaIsencao(Beneficiario beneficiario) {
        if (this.valorIPTU <= 96066.57 || this.tempoMoradia > 10) {
            return valorIPTU; // 100% de isenção
        } else if (beneficiario.getRenda() < 1024) {
            return valorIPTU * 0.5; // 50% de isenção
        } else {
            return 0;
        }
    }

    public Tipo getTipo() {
        return tipo;
    }

    public double getArea(){
        return this.area;
    }
    public double getValorIPTU() {
        return valorIPTU;
    }
}
