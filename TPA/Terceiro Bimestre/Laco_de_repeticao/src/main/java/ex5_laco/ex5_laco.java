/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_laco;

import java.util.Scanner;

/**
 *
 * @author r1spo
 */
public class ex5_laco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.println("Digite o valor inicial: ");
        int vinicial = sc.nextInt();

        System.out.println("Digite o valor final: ");
        int vfinal = sc.nextInt();

        System.out.print("Números ímpares: ");
        for (int i = vinicial; i <= vfinal; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
    

