/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_array;
import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ex2_array {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[20];
        System.out.println("Digite 20 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.nextLine();
        }
        Arrays.sort(nomes, Collections.reverseOrder());
        System.out.println("Nomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
