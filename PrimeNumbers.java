package Practise_Nov_14;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		int num = 17;
	    int count_of_factors = 0;
		
		for(int i = 1; i <= num; i = i+1) {
			
			if(num % i ==0) {
				count_of_factors = count_of_factors + 1;
			}
		}
		
		if(count_of_factors ==2) {
			System.out.println("Prime Numbers");
		} else {
			System.out.println("Not Prime Numbers");
		}
	}
	

}
