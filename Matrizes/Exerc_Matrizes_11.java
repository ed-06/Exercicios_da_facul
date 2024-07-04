package Exercicios_facul.Matrizes;
import java.util.Scanner;
public class Exerc_Matrizes_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[10][5];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; i++){
                System.out.print("Escreva a altura de cada atleta [" + i +"]["+ j +"]:");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; i++){


                
        scanner.close();
    }
}
/*
 * Exercício 11. Escreva um programa Java que possa armazenar as alturas de dez
atletas de cinco delegações que participarão dos jogos de verão. Imprimir a maior
altura de cada delegação.
 */