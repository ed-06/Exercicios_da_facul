package Poo_Aula_1.RevClassesObjetos;
public class Estacionamento {
    private String endereco;
    private long cep;
    private boolean vagasLiberadas;
    private int quantidadeCarros;

    public Estacionamento (String endere, long ce){
        endereco = endere;
        cep = ce;
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
    public void setVagasLiberadas(boolean vagasLiberadas) {
        this.vagasLiberadas = vagasLiberadas;
    }
    public int getQuantidadeCarros() {
        return quantidadeCarros;
    }
    public void setQuantidadeCarros(int quantidadeCarros) {
        this.quantidadeCarros = quantidadeCarros;
    }
    public int quantidadeCarro(){
        quantidadeCarros = vaga.length;

    }

    public String toString(){
        return endereco + " " + cep + " ";
    }
    public boolean adicionar(Carro carro) {
        if (quantidadeCarros >= vaga.length) {
            return false;
        }
    }
}
