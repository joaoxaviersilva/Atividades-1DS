/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8_matriz;

import javax.swing.JOptionPane;

/**
 *
 * @author r1spo
 */
public class ex8_matriz {
     public static void main(String[] args) {
        int[][] mat = {{1, 42, 23, 14, 51}, {22, 32, 55, 54, 12}};

        JOptionPane.showMessageDialog(null, "****** Exibindo apenas os elementos pares da matriz ******");

       
        exibirElementosPares(mat);
    }

 
    public static void exibirElementosPares(int[][] mat) {
        for (int[] linha : mat) {
            for (int valor : linha) {
                if (valor % 2 == 0) {
                    System.out.print(valor + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(); 
        }
    }
}
