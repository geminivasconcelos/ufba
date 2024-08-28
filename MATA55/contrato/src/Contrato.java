class Contrato {
    private String endereco;
    private String cadastroIPTU;
    private String nomeProprietario;
    private String cpfProprietario;
    private float aluguelMensal;
    private Fiador fiador;
    private String status;

    public Contrato(String endereco, String cadastroIPTU, String nomeProprietario, String cpfProprietario, float aluguelMensal, Fiador fiador) {
        this.endereco = endereco;
        this.cadastroIPTU = cadastroIPTU;
        this.nomeProprietario = nomeProprietario;
        this.cpfProprietario = cpfProprietario;
        this.aluguelMensal = aluguelMensal;
        this.fiador = fiador;
        this.status = (fiador != null && fiador.getRenda() >= 3 * aluguelMensal) ? "ativo" : "inativo";
    }


    public Contrato(String endereco, String cadastroIPTU, String nomeProprietario, String cpfProprietario, float aluguelMensal) {
        this.endereco = endereco;
        this.cadastroIPTU = cadastroIPTU;
        this.nomeProprietario = nomeProprietario;
        this.cpfProprietario = cpfProprietario;
        this.aluguelMensal = aluguelMensal;
        this.fiador = null;
        this.status = "ativo";
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCadastroIPTU() {
        return cadastroIPTU;
    }

    public void setCadastroIPTU(String cadastroIPTU) {
        this.cadastroIPTU = cadastroIPTU;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
    }

    public float getAluguelMensal() {
        return aluguelMensal;
    }

    public void setAluguelMensal(float aluguelMensal) {
        this.aluguelMensal = aluguelMensal;
    }

    public Fiador getFiador() {
        return fiador;
    }

    public void setFiador(Fiador fiador) {
        this.fiador = fiador;
    }


}