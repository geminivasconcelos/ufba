public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("mamífero", "Leão", 5);
        Animal animal2 = new Animal("ave", "Papagaio", 3);
        Animal animal3 = new Animal("anfíbio", "Sapo", 2);

        System.out.println("O " + animal1.getNome() + " consome " + animal1.calcularAlimentoDiario() + " kg de alimento por dia.");
        System.out.println("O " + animal2.getNome() + " consome " + animal2.calcularAlimentoDiario() + " kg de alimento por dia.");
        System.out.println("O " + animal3.getNome() + " consome " + animal3.calcularAlimentoDiario() + " kg de alimento por dia.");
    }
}
