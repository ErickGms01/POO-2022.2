package sumNumbers;

import java.util.Scanner;

public class main {
	// Declare Colors

	// Reset
	public static final String RESET = "\033[0m"; // Text Reset

	// Regular Colors
	public static final String YELLOW = "\033[0;33m";  // YELLOW
	public static final String CYAN = "\033[0;36m";    // CYAN

	// Bold
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

	// Underline
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE
	
	public static void main(String[] args) {
		
		// Create a Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println(WHITE_BOLD + "Welcome!"
				+ "\nIn this code, you have to enter 4 numbers, to make a sum!\n" + RESET);
		
		// Input User
		System.out.print(YELLOW + "Enter your first number: " + RESET);
		int n1 = sc.nextInt();
		System.out.print(YELLOW + "Enter your second number: " + RESET);
		int n2 = sc.nextInt();
		System.out.print(YELLOW + "Enter your third number: " + RESET);
		int n3 = sc.nextInt();
		System.out.print(YELLOW + "Enter your fourth number: " + RESET);
		int n4 = sc.nextInt();

		// Sum
		int sum = n1 + n2 + n3 + n4;

		System.out.println(CYAN + " \nThe sum of numbers is: " + RESET + WHITE_BOLD + WHITE_UNDERLINED + sum + RESET);
	}
}