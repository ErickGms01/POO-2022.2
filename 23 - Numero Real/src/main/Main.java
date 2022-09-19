package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	double num, f, i, a;
    	
    	Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: "); //Input User 
        num = sc.nextDouble();
        
        i = (int)num;//Parte Inteira
        f = (float)num - i;//Parte Fracionada
        a = Math.round(num);//Arredondando
        
        System.out.format("A parte inteira do número é: %.0f\n", i);
        System.out.format("A parte fracionada do número é: %.2f ", f);
        System.out.println("\nO número arredondado é: " + a);
    }
}