package measureStair;

import java.util.Scanner;
import java.lang.Math;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Create a Scanner
		
		double ang, heigth, rad, area;
		System.out.print("Enter the angle of Stairs: ");
		ang = sc.nextFloat();
		
		System.out.print("Enter the heigth: ");
		heigth = sc.nextFloat();
		
		rad = Math.toRadians(ang);
		
		System.out.println(rad);
		
		area = heigth / Math.sin(rad);
		
		System.out.format("The measure is: %.2f", area);
	}

}