package Practise_Nov_14;

import java.util.Scanner;

public class perfectSquare {
    
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		
		int num = sc.nextInt();
		double x = Math.sqrt(num);
		
		if (x ==(int)x) {
			System.out.println("Perfect square");
	}   else {
		    System.out.println("Not Perfect square");
		    }
   
	}
	
}

	