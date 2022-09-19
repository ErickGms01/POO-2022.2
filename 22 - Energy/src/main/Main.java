package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double valSal, qtdKw, valKw, valReal, desc,  valDesc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário minimo: ");
		valSal = sc.nextDouble();
		
		System.out.println("Digite a quantidade de QuiloWatts gastas: ");
		qtdKw = sc.nextDouble();
		
		valKw = valSal / 5;
		valReal = qtdKw * valKw;
		desc = (valReal * 15) / 100; 
		valDesc = valReal - desc;
		
		System.out.println("O valor do QuiloWatts é: " + valKw);
		System.out.format("\nVocê irá pagar um preço de %.2f\n\n", valReal);
		System.out.format("Você ganhou um desconto de 15 por cento!\nO preço agora está: %.2f", valDesc);
		
	}

}
