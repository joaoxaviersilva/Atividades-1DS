/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author r1spo
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a idade do nadador: ");
        double idade= sc.nextDouble();
        if(idade>= 5 && idade<= 7){
            System.out.println("A categoria do seu nadador é: Infantil A");
        }
        else if(idade >= 8 && idade <= 10){
             System.out.println("A categoria do seu nadador é: Infantil B");
        }
        else if(idade >= 11 && idade <= 13){
             System.out.println("A categoria do seu nadador é: Juvenil A");
        }
        else if(idade >= 14 && idade <= 17){
             System.out.println("A categoria do seu nadador é: Juvenil B");
        }
        else if(idade >= 18){
             System.out.println("A categoria do seu nadador é: Senior");
        }
        else{
            System.out.println("Opção inválida");
        }
    }
}
