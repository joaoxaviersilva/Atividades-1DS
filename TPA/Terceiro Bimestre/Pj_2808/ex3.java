/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author r1spo
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Bem-vindo ao MC DONALD´S");
        System.out.println("");
        System.out.println("Temos os seguinter lanches: BigMac; Quarteirão; MacChicken; Cheddar; Cheese Burguer");
        System.out.println("Caso você queira um BigMac, digite 1");
        System.out.println("Caso você queira um Quarteirão, digite 2");
        System.out.println("Caso você queira um MacChicken, digite 3");
        System.out.println("Caso você queira um Cheddar, digite 4");
        System.out.println("Caso você queira Cheese Burguer, digite 5");
        System.out.println("");
        System.out.println("Digite o número do seu lanche: ");
        int lanche = sc.nextInt();
        switch(lanche){
            case 1:
                System.out.println("BigMac");
                break;
                case 2:
        System.out.println("Quarteirão");
        break;
                case 3:
                    System.out.println("MacChicken");
                    break;
                case 4:
                    System.out.println("Cheddar");
                    break;
                case 5:
                    System.out.println("Cheese Burguer");
                    break;
                default:
                    System.out.println("Opção inválida");
        }
        
    }
}
