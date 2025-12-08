package DataTypes;

public class PhoneNumber_DataTypes {

	public static void main(String[] args) {
		// Person's phone number: "123-456-7890"
		 long phoneNumberl = 1234567890L;
		 //using printf
	
		 System.out.printf("PhonNumber:%03d-%03d-%04d%n", 
				 phoneNumberl/1000000,
				 (phoneNumberl/10000)%1000 , 
				 phoneNumberl%10000 );

	}

}


