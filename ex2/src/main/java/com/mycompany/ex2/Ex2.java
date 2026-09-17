/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;

/**
 *
 * @author 46341100833
 */
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Qual e seu nome");
    String nome = sc.nextLine(); 
    
    System.out.print("Qual sua idade");
    int idade = sc.nextInt();
    
    System.out.println("seja bem vindo" + nome);
        
    }
}
