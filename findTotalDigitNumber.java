package Practise_Nov_14;

import java.util.Scanner;

public class findTotalDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count_digit = 0;
		while(num !=0) {
		    num = num/10;
		    count_digit +=1;	    
	}
         System.out.println("total number of Digits are:" +count_digit);
}
}