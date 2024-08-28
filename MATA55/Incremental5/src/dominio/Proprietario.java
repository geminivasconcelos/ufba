package dominio;

import java.util.List;
import java.util.ArrayList;

public class Proprietario extends Cliente{
    private List<Imovel> imoveis;

    public Proprietario(String nome, String cpf) {
        super(nome, cpf);
        this.imoveis = new ArrayList<>();
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public void avaliarInquilino(Imovel imovel, Inquilino inquilino, int nota) {
        for (Locacao locacao : imovel.getHistoricoLocacao()) {
            if (locacao.getInquilino().equals(inquilino)) {
                locacao.setNota(nota);
            }
        }
    }
}
