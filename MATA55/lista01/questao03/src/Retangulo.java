public class Retangulo {

    double comprimento;
    double largura;

    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void calculaPerimetro(double base, double altura){
        System.out.println("Valor do perimetro: " +(2*(base+altura)));
    }

    public void calculaArea(double base, double altura){
        System.out.println("O valor da area do retangulo é: " +(base*altura));
    }
}
