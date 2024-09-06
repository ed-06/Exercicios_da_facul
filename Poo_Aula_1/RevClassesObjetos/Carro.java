package Poo_Aula_1.RevClassesObjetos;
public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    public Carro(String mar, String m, String c, String p){
        marca = mar;
        modelo = m;
        cor = c;
        placa = p;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public String toString(){
        return marca + " " + modelo + " " + cor + ", placa " + placa;
    }
    
}
//A classe Carro contém a marca do carro, o modelo, a cor e a placa (todos os campos são Strings). 