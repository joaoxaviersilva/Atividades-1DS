/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_matriz;
import java.util.Random;
/**
 *
 * @author r1spo
 */
public class ex2_matriz {
    public static void main(String[] args) {
         int[][] matriz = new int[5][5];
        Random random = new Random();

       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
            }
        }

      
        System.out.println("Matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

     
        int somaImpares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }
        System.out.println("\nSoma dos números ímpares: " + somaImpares);

     
        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
        }

        
        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
        }
    }
}

