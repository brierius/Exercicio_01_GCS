/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadoramarco_2023;

import java.util.Scanner;
        

/**
 *
 * @author Paulo
 */
public class CalculadoraMarco_2023 
{

    public static void main(String[] args) 
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor...");
        int valorA = scan.nextInt();
        System.out.println("Digite o segundo valor...");
        int valorB  = scan.nextInt();
        
        System.out.println("A soma dos números é "+ (valorA + valorB));
        System.out.println("A divisão dos números é "+ valorA/valorB);
        System.out.println("A Subtração dos números é " + (valorA - valorB));
        System.out.println("A multiplicação dos números é " + (valorA*valorB));
    }
}
