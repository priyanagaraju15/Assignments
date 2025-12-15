package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayAssignments {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
		//cities combined.
		List<Integer> cityAreas = Arrays.asList(7242,6430,4870,2900);
		//calculate total area of 3rd and 4th cities
		int total = cityAreas.get(2) + cityAreas.get(3);
		//print thge result
		System.out.println("Total area of 3rd and 4th cities combined:"+ total);
		
		//create a set of top 10 most visited tourist attractions 
		Set<String> attraction = new HashSet<>();
		attraction .add("Vijayawada Bridge");
		attraction.add("Hyderabad Bridge");
		attraction.add("Rayalaseema Bridge");
		attraction.add("konaseema Bridge");
		attraction.add("lolkatta Bridge");
		attraction.add("HiTech Bridge");
		attraction.add("Times Square");
		attraction.add("Grand Canyon");
		attraction.add("Statue of Liberty");
		attraction.add("Taj Mahal");
		//Print  all attractions
		System.out.println("Top 10 most visited Tourist Attractions");
		for (String place : attraction) {System.out.println(place);}
		
		//Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
		//6th Value.
		int[] numbers = {12, 25 , 37 ,49,58 , 63 , 71, 103 ,99 , 100};
		//5th is 4
		//6th value is 5
		double average = (numbers[4]+ numbers[5]) / 2.0;
		//print the result
		System.out.println("Average of 5th and 6th value:"+ average );
		
		
		// Create a list of the top 5 highest-grossing movies of all time and print out the third
		//movie on the list
		List<String> movies = Arrays.asList
				("Bahubali","varsham","Chatrapathi");
		//print the third movie on the List 
		System.out.println("The third highest -Grossing movie is :"+ movies.get(2));
		
		
		
		

	}
	

}
