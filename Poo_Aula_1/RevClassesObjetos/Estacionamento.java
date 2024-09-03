package Poo_Aula_1.RevClassesObjetos;

public class Estacionamento {
    public static void main(String[] args) {
        Carro[] vaga = new Carro[50];

        vaga[0] = new Carro("Hyundai", "HB20", "preto", "BEE4F00");
        vaga[1] = new Carro("Chevrolet", "Onix", "cinza", "FUN2M33");
        vaga[2] = new Carro("Ford", "Ka", "vermelho", "GEZ0W35");

        System.out.println(vaga[0].toString());
        System.out.println(vaga[1].toString());
        System.out.println(vaga[2].toString());
    }
}
//contém o endereço (uma String), um CEP (um número inteiro bem grande) e pode conter até 50 carros. 
/*
Depois de criadas essas classes, crie uma classe Principal que instancie os seguintes carros e os guarde 
no estacionamento localizado na Rua Avestruz, CEP 90001007:

1) Hyundai HB20 preto, placa BEE4F00
2) Chevrolet Onix cinza, placa FUN2M33
3) Ford Ka vermelho, placa GEZ0W35  
 */ 