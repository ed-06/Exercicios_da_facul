package Exercicios_facul.Matrizes;
import java.util.Scanner;
public class Exerc_Matrizes_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz [][] = new int[5][2];
        int vetor[] = new int[5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 2; j++){
                System.out.print("Escreva o valor da matriz[" + i + "][" + j + "]");
            }
        }
    }
}
/*
 * Exercício 7. Escreva um programa Java que leia uma matriz 5 x 2, onde cada
coluna corresponde a um lado de um triângulo retângulo. Declare um vetor de
tamanho 5 no qual cada posição contém a área do respectivo triângulo da matriz.
 */
/*
 * A área do triângulo é igual à medida da sua superfície. Para calcular área de um triângulo qualquer, 
 * o método mais comum é multiplicar o comprimento da base e da altura e dividir por dois
 * -> linha
 * ^
 * | coluna
 */