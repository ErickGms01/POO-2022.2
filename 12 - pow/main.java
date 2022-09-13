package pow;

import java.util.Scanner; 

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, pow1, pow2;
		int x = 1;
		
		while (x == 1) {
			System.out.print("Enter a number: ");
			n1 = sc.nextDouble();
			System.out.print("Enter a number: ");
			n2 = sc.nextDouble();
			
			if (n1 > 0 && n2 > 0) {
				pow1 = Math.pow(n1, n2);
				pow2 = Math.pow(n2, n1);
				
				System.out.printf("The number: %.1f raised to %.1f is: %.1f\n"
						+ "The number: %.1f raised to %.1f is: %.1f", n1, n2, pow1, n2, n1, pow2);
				x = 0;
			}
			else { 
				System.out.println("Error!!\nThe number must be grater than zero!!!\n");
			}
		}
	}
}