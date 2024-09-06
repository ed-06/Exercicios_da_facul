package Poo_Aula_1.RevClassesObjetos;

public class Principal {
    public static void main(String[] args) {
        Estacionamento esta1 = new Estacionamento("Rua Avestruz", 90001007);

        Estacionamento = new 

        Carro[] vaga = new Carro[50];

        vaga[0] = new Carro("Hyundai", "HB20", "preto", "BEE4F00");
        vaga[1] = new Carro("Chevrolet", "Onix", "cinza", "FUN2M33");
        vaga[2] = new Carro("Ford", "Ka", "vermelho", "GEZ0W35");

        System.out.println(vaga[0].toString());
        System.out.println(vaga[1].toString());
        System.out.println(vaga[2].toString());
        System.out.println(esta1.toString());   
    }
}
