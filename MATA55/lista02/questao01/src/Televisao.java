public class Televisao {
    String marca;
    String modelo;
    boolean statusAparelho;
    int canalAtual;
    String senha;


    public Televisao(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.statusAparelho = false;
        this.canalAtual = 0;
        this.senha = null;
    }

    public Televisao(String marca, String modelo, String senha){
        this.marca = marca;
        this.modelo = modelo;
        this.senha = senha;
    }

    public boolean ligarTv(){
        this.statusAparelho = true;
        return true;
    }

    public boolean ligarTv(String senhaMet, int canal){
        if(senha.equals(senhaMet)){
            this.statusAparelho = true;
            this.canalAtual = canal;
            return true;
        }else{
            return false;
        }
    }

    public boolean isLigada() {
        return statusAparelho;
    }

    public void desligar() {
        this.statusAparelho = false;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        if (statusAparelho) { // Só permite mudar o canal se a TV estiver ligada
            this.canalAtual = canalAtual;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

}
