/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_vetor;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ex3_vetor {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        String [] nomec = new String[50] ;
        for(int i = 0; i<50; i++){
        System.out.println("Digite um nome: " + (i + 1) );
        nomec[i] = sc.nextLine();
    }
        Arrays.sort(nomec);
        
        System.out.println("Nomes em ordem crescente:");
        System.out.println("");
        for(String nome : nomec){
            System.out.println(nome);
        }
        sc.close();
    }
}
