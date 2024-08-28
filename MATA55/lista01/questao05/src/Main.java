public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria Silva", 2018, "Ciência da Computação", 20);

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Total de créditos: " + aluno.calcularCreditos());
        System.out.println("Tempo de permanência na faculdade: " + aluno.calcularTempoPermanencia(2022) + " anos");
    }
}
