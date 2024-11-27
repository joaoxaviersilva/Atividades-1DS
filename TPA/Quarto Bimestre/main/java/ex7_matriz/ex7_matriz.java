/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_matriz;


import javax.swing.JOptionPane;

/**
 *
 * @author r1spo
 */
public class ex7_matriz {
     public static void main(String[] args) {
      double[][] matriz = {{4.5, 5.2}, {4.2, 1}};

        JOptionPane.showMessageDialog(null, "****** Imprimindo a matriz ******");

     
        exibirMatriz(matriz);
    }

   
    public static void exibirMatriz(double[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("mat[" + x + "][" + y + "] = " + matriz[x][y]);
            }
        }
    }
}

