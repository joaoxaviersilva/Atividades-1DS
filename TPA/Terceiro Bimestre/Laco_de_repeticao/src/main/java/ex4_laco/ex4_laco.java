/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_laco;

import java.util.Scanner;

/**
 *
 * @author r1spo
 */
public class ex4_laco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor inicial: ");
        int vinicial = sc.nextInt();

        System.out.println("Digite o valor final: ");
        int vfinal= sc.nextInt();

        int soma = 0;

        for (int i = vinicial; i <= vfinal; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números ímpares é: " + soma);
    }
        
    }

