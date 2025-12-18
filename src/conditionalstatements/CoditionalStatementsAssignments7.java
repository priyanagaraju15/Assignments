package conditionalstatements;

public class CoditionalStatementsAssignments7 {

	public static void main(String[] args) {
		//Credit Score:
		// o If the credit score is above 750, the loan is automatically approved.
		int creditScore = 720;
		int customerIncome = 10000;
		boolean isEmployeed = true;
		double debtToIncome = 35.0;
		if(creditScore >750) {
			System.out.println("Loan Approved");
		}
		else if(creditScore >650 && creditScore<750){
			System.out.println("customer additional   checks performing");
			if(customerIncome>50000) {
				if(isEmployeed) {
					System.out.println("Loan further processing");
					if (debtToIncome <50) {
						System.out.println("Loan is Approved");
					}
					else if(debtToIncome>40) {
						System.out.println("The Loan is Denied");
					}	
				}
					
		}else {
					System.out.println("Loan Rejected as custmer salary is >50000");
				}
	 }
			
 }
}
