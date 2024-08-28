/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio8;

import java.util.Scanner;

/**
 *
 * @author r1spo
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1° valor em centímetros da variável A");
        double a= sc.nextDouble();
        System.out.println("Digite o 2° valor em centímetros da variável B");
        double b= sc.nextDouble();
        System.out.println("Digite o 3° valor em centímetros da variável C");
        double c= sc.nextDouble();
        if(a==b && a==c && b==c ){
            System.out.println("Triângulo equilátero");
        }
        else if(a!=b && a==c && b!=c && a+c > b){
            System.out.println("Triângulo isósceles");
        }
        else if( a==b && a!=c && b!=c && a+b > c){
             System.out.println("Triângulo isósceles");
        }
        else if(a!=b && a!=c && b==c && b+c > a){
             System.out.println("Triângulo isósceles");
        }
        else if(a!=b && a!=c && b!=c && a+b > c && a+c > b && b+c > a){
            System.out.println("Triângulo escaleno");
        }
        else{
            System.out.println("Não compõe um triângulo");
        }
    }
}
