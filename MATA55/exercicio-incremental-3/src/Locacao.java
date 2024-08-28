public class Locacao {

    private String dataInicio;
    private String dataFim;
    private Inquilino inquilino;
    private int nota;

    public Locacao(String dataInicio, String dataFim, Inquilino inquilino) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.inquilino = inquilino;
        this.nota = -1;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }
    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
