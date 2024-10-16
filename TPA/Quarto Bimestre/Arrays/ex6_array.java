/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_array;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ex6_array {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite 100 números");
        int[] numero = new int [100];
       
        for(int i = 0; i<numero.length; i++){
            System.out.println("Número " + (i+1) );
            numero[i] = sc.nextInt();
        }
         Arrays.sort(numero);
         for(int i = 0; i< numero.length;i++){
            if(numero[i] % 2 != 0){
                System.out.println("Os números pares são: " + numero[i]);
            }
         }
    }
}

    

