/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_laco;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ex2_laco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
        int tabuada = num * i;
            System.out.println("A tabuada do número escolhido é: " + tabuada);
            System.out.println("");
    }
  
    }
}
