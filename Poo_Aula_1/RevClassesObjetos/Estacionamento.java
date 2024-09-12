package Poo_Aula_1.RevClassesObjetos;
public class Estacionamento {
    private String endereco;
    private long cep;
    private int quantidadeCarros;

    public Estacionamento(String endereco, long cep){
        this.endereco = endereco;
        this.cep = cep;
        Estacionamento[] vagas = new Estacionamento[];
    }


    public String getEndereco() {
        return endereco;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getQuantidadeCarros() {
        return quantidadeCarros;
    }
    public void setQuantidadeCarros(int quantidadeCarros) {
        this.quantidadeCarros = quantidadeCarros;
    }

    public String toString(){
        return endereco + " " + cep + " ";
    }
}
