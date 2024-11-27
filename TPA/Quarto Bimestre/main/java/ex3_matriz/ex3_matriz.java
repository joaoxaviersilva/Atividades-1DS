/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_matriz;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 *
 * @author r1spo
 */
public class ex3_matriz {
    public static void main(String[] args) {
         int[][] matriz = new int[3][5];
        Random random = new Random();
        Set<Integer> numeros = new HashSet<>();

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
                numeros.add(matriz[i][j]);
            }
        }

     
        System.out.println("Matriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

       
        boolean temRepetidos = numeros.size() < (3 * 5);
        System.out.println("\nPossui elementos repetidos? " + (temRepetidos ? "Sim" : "Não"));

     
        int pares = 0, impares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
