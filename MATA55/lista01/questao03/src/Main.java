public class Main {
    public static void main(String[] args) {
        double base = 123.1;
        double altura = 1231.5;
        if(base >0 && altura > 0){
            Retangulo retangulo = new Retangulo(base, altura);
            retangulo.calculaArea(base, altura);
            retangulo.calculaPerimetro(base, altura);
        }


    }
}