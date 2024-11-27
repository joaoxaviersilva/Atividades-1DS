/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_matriz;
import java.util.Random;
/**
 *
 * @author r1spo
 */
public class ex4_matriz {
     public static void main(String[] args) {
        double[][] matriz = new double[4][4];
        Random random = new Random();

       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextDouble() * 10; 
            }
        }

    
        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println();
        }

     
        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f ", matriz[i][i]);
        }

      
        System.out.println("\n\nDiagonal secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f ", matriz[i][3 - i]);
        }
}
}
