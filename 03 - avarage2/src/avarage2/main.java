package avarage2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
       
        //Variables
        int wei1, wei2, wei3, sumWei;
        float n1, n2, n3;
        
        
        int x = 1;  
        while (x == 1){
	        //Input User
	        System.out.print("Enter your first grade: ");
	        n1 = sc.nextFloat();
	        System.out.print("Enter weigth of grade: ");
	        wei1 = sc.nextInt();
	        
	        System.out.print("Enter your second grade: ");
	        n2 = sc.nextFloat();
	        System.out.print("Enter weigth of grade: ");
	        wei2 = sc.nextInt();
	        
	        System.out.print("Enter your third grade: ");
	        n3 = sc.nextFloat();
	        System.out.print("Enter weigth of grade: ");
	        wei3 = sc.nextInt();
	        
	        if (n1 <= 10 && n2 <= 10 && n3 <= 10) {
	        	sumWei = wei1 + wei2 + wei3;
	            //Avarage
	            float med = (n1 * wei1 + n2 * wei2 + n3 * wei3) / sumWei;
	            System.out.format("Your avarage: %.2f",med);	            	       
	            x = 0;
	        }
	        else 
	        	System.out.println("Error! Your grade its high to 10!");
     	}
	}

}