package roots;

import java.util.Scanner; 

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sq, cb, sqrt, cbrt, num;
		int x = 1;
		
		while (x == 1) {
			System.out.print("Enter a number: ");
			num = sc.nextDouble();
			
			if (num > 0) {
				sq = Math.pow(num, 2);
				cb = Math.pow(num, 3);
				sqrt = Math.sqrt(num);
				cbrt = Math.cbrt(num);
				
				System.out.printf("The numbers squared is: %.1f\n"
						+ "The number cubed is: %.1f\n"
						+ "The Square Root is: %.1f\n"
						+ "The Cube Root is: %.1f\n", sq, cb, sqrt, cbrt);
				x = 0;
			}
			else { 
				System.out.println("Error!!\nThe number must be grater than zero!!!\n");
			}
		}
	}
}
