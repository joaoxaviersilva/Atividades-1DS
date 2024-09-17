/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_laco;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ex1_laco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 4; i <4001; i++){
        int par = i % 2;
        
        if(par == 0){
            System.out.println(i);
        }
        }
    }
    

    
}
