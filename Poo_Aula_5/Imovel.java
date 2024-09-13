package Poo_Aula_5;

public class Imovel {
    private double areaConstruida;
    private String endereco;
    
    public Imovel(double areaConstruida, String endereco){
        this.areaConstruida = areaConstruida;
        this.endereco = endereco;
    }
    public double getAreaConstruida() {
        return areaConstruida;
    }
    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}