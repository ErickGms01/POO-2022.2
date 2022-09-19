package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double ingPre, custoTeatro, qtdIng;
		
		Scanner sc = new Scanner(System.in);
		
		//Input user
		System.out.println("Qual o custo total do teatro? ");
		custoTeatro = sc.nextDouble();
		System.out.print("Digite o valor do ingresso: ");
		ingPre = sc.nextDouble();
		
		qtdIng = Math.round(custoTeatro / ingPre);
	
		System.out.format("Precisasse de %.0f ingressos para suprir o preço do teatro.", qtdIng);
	}
	
}
