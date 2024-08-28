/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;
import java.util.Scanner;

/**
 *
 * @author r1spo
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite a 1° nota: ");
        double nota1= sc.nextDouble();
         System.out.println("Digite a 2° nota: ");
        double nota2= sc.nextDouble();
         System.out.println("Digite a 3° nota: ");
        double nota3= sc.nextDouble();
         System.out.println("Digite a 4° nota: ");
        double nota4= sc.nextDouble();
              double media = (nota1+nota2+nota3+nota4) / 4;
              if(media >= 9){
                  System.out.println("Aprovado");
              }
              else if(media >= 7 && media < 9){
        System.out.println("Aprovado");
    }
              else if(media>=5 && media <7){
                  System.out.println("Aprovado");
              }
              else if(media >= 2.5 && media <5){
                  System.out.println("Reprovado");
              }
              else if(media<2.50){
                  System.out.println("Reprovado");
              }
              else{
                  System.out.println("Opção inválida");
              }
    }
}
