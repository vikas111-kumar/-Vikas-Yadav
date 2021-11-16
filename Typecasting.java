package FirstHand_Nov_14;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		//Automatic/Widening type casting
		
		short salary = 32000;
		int annual_salary = salary * 12;
		
		int pincode = 410506;
		long newPincode = pincode;
		
		System.out.println(annual_salary);
		System.out.println(newPincode);
		
		
		
		//manual/narrowing/explicit type casting
		
		short date = 11;
        byte newDate = (byte) date;
        
        
        float percentage = 92.78f;
        int newPercentage = (int) percentage;
		
		System.out.println(newDate);
		System.out.println(newPercentage);
	}

}
