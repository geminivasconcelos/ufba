import exceptions.ExcecaoCapacidade;
import exceptions.ExcecaoLicenca;

public class PescadoresIndustriais extends Pescadores{

    private boolean possuiLicencaEspecial;

    public PescadoresIndustriais(boolean possuiLicencaEspecial){
        super(nome, idade, barcos);
        this.licencaEspecial = licencaEspecial;
    }

    public boolean getPossuiLicencaEspecial(){
        return possuiLicencaEspecial;
    }

    @Override
    public void iniciarAtividadeDePesca(Barco barco, double tempoPesca) throws ExcecaoCapacidade, ExcecaoLicenca {
        if (barco instanceof BarcoPescaIndustrial && !possuiLicenca) {
            throw new ExcecaoLicenca("Licença necessária para operar barco industrial!");
        }
        double quantidadePeixe = barco.calcularPeixeTransportado(tempoPesca);
        if (quantidadePeixe > barco.getCapacidadeMaxima()) {
            throw new ExcecaoCapacidade("Capacidade máxima do barco ultrapassada!");
        }
        System.out.println("Pescador industrial " + getNome() + " pescou " + quantidadePeixe + " kg de peixe.");
    }
}
