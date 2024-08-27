
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author r1spo
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia do seu nascimento: ");
        int dia = sc.nextInt();
        System.out.println("Digite o mês do seu nascimento: ");
        int mes = sc.nextInt();
        System.out.println("Digite o ano do seu nascimento");
        int ano= sc.nextInt();
        int atual= 2024;
        int idade= atual-ano;        
        if(idade>=18 && idade<60){
            System.out.println("Você é maior de idade");
        }
        else if(idade<=18){
            System.out.println("Você é menor de idade");
        }
        else if(idade>=60){
            System.out.println("Você é idoso");
        }
        else{
            System.out.println("Você não existe");
        }
    }
    
}
