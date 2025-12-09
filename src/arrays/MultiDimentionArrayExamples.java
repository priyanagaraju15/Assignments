package arrays;

public class MultiDimentionArrayExamples {
	//Array :Array can store multiple values of similar data tuypes

	public static void main(String[] args) {
	
		//2D Array : Array of multiple 
		// there are projects in a company , and each project has 3 employees
		String[][] company = {
				{"john","Jaen","Doe" },  //Project 1 employee
				{"Alice","Bob","Charlie"} //Project 2 employee
				};
		//2D Array creation when we don't know the values
		String [][] newCompany = new String [2][3]; // 2 Projects and each project has 3 employees
		newCompany[0][0] ="John";
		newCompany[1][2] ="Charlie";
		
}
}
