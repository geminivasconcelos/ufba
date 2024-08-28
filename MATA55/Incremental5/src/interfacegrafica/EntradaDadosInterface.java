package interfacegrafica;

import dominio.*;

public interface EntradaDadosInterface {
    Imovel criarImovel(Proprietario proprietario);
    Inquilino criarInquilino();
    Locacao criarLocacao(Inquilino inquilino);
}