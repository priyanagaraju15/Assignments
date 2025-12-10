package Classes;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] empNames = new String[3];
		int[] empIds = new int[3];
		
		Employees employexerox = new Employees();
		
		empNames[0] = employexerox.emp1;
		empNames[1] = employexerox.emp2;
		empNames[2] = employexerox.emp3;
		
		empIds[0] = employexerox.empId1;
 		empIds[1] = employexerox.empId2;
		empIds[2] =employexerox.empId3;
		//Employee Name: Bharath, Employee ID: 1234
		System.out.println("Employee Name:"+ empNames[0] +", Employee ID:" + empIds[0]);
		System.out.println("Employee Name:"+ empNames[1] +", Employee ID:" + empIds[1]);
		System.out.println("Employee Name:"+ empNames[2] +", Employee ID:" + empIds[2]);
		
		
		
		
	}

}
