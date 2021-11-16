package Practise_Nov_14;

public class whileAndDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//for loop and while are also called as 
		//entry controlled loop
		
		
		int num = 500;
		while (num <= 100) {
			System.out.println(num);
			num = num + 1;
			
			//Exit controlled loop
			
			int num2 = 500;
			do { 
				System.out.println(num2);
				num2 = num2+1;
			}while (num2 <= 100);
		}
	}

}
