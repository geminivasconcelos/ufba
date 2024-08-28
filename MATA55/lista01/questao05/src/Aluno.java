public class Aluno {
    private String nome;
    private int anoIngresso;
    private String curso;
    private int disciplinasAprovadas;

    // Construtor
    public Aluno(String nome, int anoIngresso, String curso, int disciplinasAprovadas) {
        this.nome = nome;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.disciplinasAprovadas = disciplinasAprovadas;
    }

    // Método para calcular o número de créditos do aluno
    public int calcularCreditos() {
        return disciplinasAprovadas * 4; // Cada disciplina aprovada vale 4 créditos
    }

    // Método para calcular o tempo (em anos) de permanência do aluno na faculdade
    public int calcularTempoPermanencia(int anoAtual) {
        return anoAtual - anoIngresso; // Calcula a diferença entre o ano atual e o ano de ingresso
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getDisciplinasAprovadas() {
        return disciplinasAprovadas;
    }

    public void setDisciplinasAprovadas(int disciplinasAprovadas) {
        this.disciplinasAprovadas = disciplinasAprovadas;
    }
}
