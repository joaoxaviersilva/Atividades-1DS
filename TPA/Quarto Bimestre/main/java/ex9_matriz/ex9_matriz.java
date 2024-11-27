/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9_matriz;
import java.util.Scanner;
/**
 *
 * @author r1spo
 */
public class ex9_matriz {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
        char[][] tabuleiro = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char jogadorAtual = 'X';
        boolean jogoEmAndamento = true;

        while (jogoEmAndamento) {
          
            System.out.println("Tabuleiro atual:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }

           
            System.out.println("Jogador " + jogadorAtual + ", escolha sua posição (linha e coluna):");
            System.out.print("Linha (0, 1 ou 2): ");
            int linha = sc.nextInt(); 
            System.out.print("Coluna (0, 1 ou 2): ");
            int coluna = sc.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != '-') {
                System.out.println("Posição inválida! Tente novamente.");
                continue;
            }

            
            tabuleiro[linha][coluna] = jogadorAtual;

          
            if (verificarVencedor(tabuleiro, jogadorAtual)) {
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                jogoEmAndamento = false;
                break;
            }

         
            if (tabuleiroCheio(tabuleiro)) {
                System.out.println("Empate!");
                jogoEmAndamento = false;
                break;
            }

           
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }

        sc.close(); 
    }

    public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {
       
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) return true;
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) return true;
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) return true;
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) return true;
        return false;
    }

    public static boolean tabuleiroCheio(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') return false;
            }
        }
        return true;
    }
}
