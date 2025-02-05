/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pj05_02;

import java.util.Scanner;
java.lang.Math.sqrt;

/**
 *
 * @author Admin
 */
public class Pj05_02 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble();
        
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        
        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();
        
        double delta = (b*b) - (4*a*c);
        
        double raiz = java.lang.Math.sqrt(delta);
        
        double xisum = (-b + raiz) / (2*a);
                
        double xisdois = (-b - raiz)/ (2*a);      
        
        System.out.println("X1 = " + xisum);
        System.out.println("X2 = " + xisdois);
    }
}
