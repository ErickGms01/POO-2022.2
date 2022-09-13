package avarage;
import java.util.Scanner;
public class main {
	// Declare Colors

	// Reset
	public static final String reset = "\033[0m"; // Text Reset

	// Regular Colors
	public static final String yellow = "\033[0;33m";  // YELLOW
	public static final String cyan = "\033[0;36m";    // CYAN

	// Bold
    public static final String whiteBold = "\033[1;37m";  // WHITE
    public static final String redBold = "\033[1;31m";    // RED

	// Underline
    public static final String whiteUnderline = "\033[4;37m";  // WHITE
    
	public static void main(String[] args) {
		//Create a Scanner
        Scanner sc = new Scanner(System.in);
       
        System.out.println(whiteBold + "--=--=--=--Avarage--=--=--=--" + reset);
        //Weigth 
        int wei1 = 1;
        int wei2 = 2;
        int wei3 = 3;
       
        //Input User
        System.out.print(yellow + "Enter your first note: " + reset);
        float n1 = sc.nextFloat();
        System.out.print(yellow + "Enter your second note: " + reset);
        float n2 = sc.nextFloat();
        System.out.print(yellow + "Enter your third note: " + reset);
        float n3 = sc.nextFloat();
        
        //Avarage
        if ((n1 >= 0 && n1 <= 10) && (n2 >= 0 && n2 <= 10) && (n3 >= 0 && n3 <= 10)){
	        float med = (n1 * wei1 + n2 * wei2 + n3 * wei3) / 6;
	        System.out.format(cyan + "\nYour avarage: " + reset + whiteBold + "%.2f" + reset,med);
	        
	        if(med >= 6.0){
	            System.out.println(whiteBold + "\n\nYou move on to the next grade!" + reset);
	        }
	        else {
	        	System.out.println(whiteBold +"\nYou will repeat!" + reset);
	        	}
	        }
	        else {
	        	System.out.println(redBold + "\nEROOR!  " + reset + whiteBold + "\nYour notes is high to 10!" + reset);
        }
	}
}