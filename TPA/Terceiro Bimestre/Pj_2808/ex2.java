/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author r1spo
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite sua altura em metros: ");
        double a = sc.nextDouble();
        System.out.println("Digite seu peso em quilogramas");
        double p = sc.nextDouble();
        double imc = p/(a*a);
        if(imc < 18){
            System.out.println("Seu IMC é: " + imc + "." + " Classicado como: Magreza");
        }
        else if(imc >= 18 && imc <=24.9){
            System.out.println("Seu IMC é: " + imc + "." + " Classicado como: Saudável");
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.println("Seu IMC é: " + imc + "." + " Classicado como: Sobrepeso");
        }
        else if(imc >= 30){
            System.out.println("Seu IMC é: " + imc + "." + " Classicado como: Obesidade");
        }
        else{
            System.out.println("Algo deu errado!");
        }
    }
}
