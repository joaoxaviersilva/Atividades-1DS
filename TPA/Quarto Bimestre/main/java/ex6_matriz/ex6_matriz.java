/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_matriz;

import javax.swing.JOptionPane;

/**
 *
 * @author r1spo
 */
public class ex6_matriz {
       public static void main(String[] args) {
    final int N_Lin = 3, N_Col = 3; 
        int[][] mat = new int[N_Lin][N_Col];

        JOptionPane.showMessageDialog(null, "****** Cadastrando dados na matriz ******\nEntre com o valor em cada posição da matriz");

  
        preencherMatriz(mat);

        JOptionPane.showMessageDialog(null, "****** Exibindo os dados da matriz ******");

      
        exibirMatriz(mat);
    }

    
    public static void preencherMatriz(int[][] mat) {
        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                mat[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Valor linha " + (l + 1) + " coluna " + (c + 1) + " :"));
            }
        }
    }

 
    public static void exibirMatriz(int[][] mat) {
        for (int[] linha : mat) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println(); 
        }
    }
}

