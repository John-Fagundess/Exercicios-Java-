/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;

/**
 *
 * @author 46341100833
 */
import java.util.Scanner;
public class Ex3 {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Escreva 1 numero");
    int numero1 = sc.nextInt();
    System.out.print("Escreva 2 numero");
    int numero2 = sc.nextInt();
    
    int soma = numero1 + numero2 ;
    System.out.println("A soma e " + soma);
    
    int subtracao = numero1 - numero2 ;
    System.out.println("A subtracao e " + subtracao);
    
    int divi = numero1 / numero2 ;
    System.out.println("A divisao e " + divi);
    
    int multiplicacao = numero1 * numero2;
    System.out.println("A multiplicacao e " + multiplicacao);
    
    
    
    
    
    
    }
}
