/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

import java.util.Scanner;

/**
 *
 * @author r1spo
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1° dia(De 1 a 31): ");
        int dia1= sc.nextInt();
        System.out.println("Digite o 1° mês(De 1 a 12): ");
        int mes1= sc.nextInt();
        System.out.println("Digite o 1° ano: ");
        int ano1= sc.nextInt();
        System.out.println("");
        System.out.println("Digite o 2° dia(De 1 a 31): ");
        int dia2= sc.nextInt();
        System.out.println("Digite o 2° mês(De 1 a 12): ");
        int mes2= sc.nextInt();
        System.out.println("Digite o 2° ano: ");
        int ano2= sc.nextInt();
       
        if(ano1<ano2){
            System.out.println("A menor data é: "+ dia1 +"/"+ mes1+"/"+ ano1+ "."+ "A maior data é: "+ dia2+ "/" + mes2+"/"+ano2);
        }
        else if(ano1>ano2){
              System.out.println("A menor data é: "+ dia2 +"/"+ mes2+"/"+ ano2+ "."+ "A maior data é: "+ dia1+ "/" + mes1+"/"+ano1);
        }
        else if(ano1==ano2 && mes1<mes2 && mes1>=1 && mes1<=12 && mes2 >=1 && mes2 <=12){
              System.out.println("A menor data é: "+ dia1 +"/"+ mes1+"/"+ ano1+ "."+ "A maior data é: "+ dia2+ "/" + mes2+"/"+ano2);
        }
        else if(ano1==ano2 && mes1>mes2){
             System.out.println("A menor data é: "+ dia2 +"/"+ mes2+"/"+ ano2+ "."+ "A maior data é: "+ dia1+ "/" + mes1+"/"+ano1);
        }
        else if(ano1==ano2 && mes1==mes2 && dia1<dia2){
             System.out.println("A menor data é: "+ dia1 +"/"+ mes1+"/"+ ano1+ "."+ "A maior data é: "+ dia2+ "/" + mes2+"/"+ano2);
        }
        else if(ano1==ano2 && mes1==mes2 && dia1>dia2){
             System.out.println("A menor data é: "+ dia2 +"/"+ mes2+"/"+ ano2+ "."+ "A maior data é: "+ dia1+ "/" + mes1+"/"+ano1);
        }
        else{
            System.out.println("Opção inválida");
        }
        
    }
}
