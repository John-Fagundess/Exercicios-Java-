/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author 46341100833
 */

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
    
     
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Insira a primeira nota");
    int nota1 = sc.nextInt();
    
    System.out.print("Insira a segunda nota");
    int nota2 = sc.nextInt();
    
    System.out.print("Insira a terceira nota");
    int nota3 = sc.nextInt();
    
    double notamedia = (nota1 + nota2 + nota3) / 3 ;
    System.out.println ("Sua media e" + notamedia);
   
    
   
    
    if (notamedia >= 7) {
     System.out.println("Parabens aprovado"); }
            else if (notamedia >= 5 && notamedia < 7){
                System.out.println("Recuperacao");}
            else {
                    System.out.println("Reprovado");}
            
           
    }
}
