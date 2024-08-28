import java.util.List;
public class Artigo extends Publicacoes{

    private String resumo;

    public Artigo(String titulo, String dataPublicacao, List<Autor> autores, String resumo){
        super(titulo, dataPublicacao, autores);
        this.resumo = resumo;
    }

    public String getResumo(){
        return resumo;
    }

//    @Override
//    public int getDuracaoLocacao() {
//        return 14;
//    }

    @Override
    public String toString() {
        return super.toString() + ", Resumo: " + resumo;
    }

}
