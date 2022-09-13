package area;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area, radius; 
		
		System.out.print("Enter radius of circle: ");
		radius = sc.nextDouble();
		
		area = Math.PI * Math.pow(radius, 2);
		
		System.out.printf("The area is equal a: %.2f meters squared!", area);
		
	}

}
