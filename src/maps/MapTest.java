package maps;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, Map<String, String>> testData ;

		HashMap<String, String> Student1Map = new HashMap<String, String>(); 
		Student1Map .put("Name","John Doe");
		Student1Map .put("Age", "20");
		Student1Map .put("Gender","Male");
		Student1Map .put("Roll Number","S12345");
		Student1Map .put("Grade","A");
		Student1Map .put("Major","Computer Science");
		Student1Map .put("GPA","3.8");
		Student1Map .put("E-Mail","Jphn@Example.com");
		Student1Map .put("Contact Number","9912345678");
		Student1Map .put("Address", "123 Elm");
		System.out.println("Student1 details:"+ Student1Map);
		
		//Below Student2Map details are stored using Map(HashMap);
		
		
		
		

		

	}

}
