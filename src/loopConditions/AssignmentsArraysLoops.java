package loopConditions;

public class AssignmentsArraysLoops {

	public static void main(String[] args) {
		// Given values are 12 ,34,11,36,87,98,93.
		// Store the values in Array and Print second and third largest number from the
		// above values without
		// using collections and default sort methods
		int[] arr = { 12, 34, 11, 36, 87, 98, 93 };
		// Find the largest Number
		int largest = arr[0];
		// ------------First for Loop--------------------
		//This loops check every number in the Array
		for(int i = 0; i < arr.length ; i ++) {
			//If current number is bigger than  largest ,update largest
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		//Step:2 Find second and Third largest
		int second = Integer .MIN_VALUE;
		int third = Integer.MIN_VALUE;
		//-----------------Second For Loop-------------
		// -------- SECOND FOR LOOP --------
        // Again check every number in the array
        for (int i = 0; i < arr.length; i++) {

            // Skip the largest number
            if (arr[i] != largest) {

                // If current number is bigger than second largest
                if (arr[i] > second) {
                    third = second;   // move second to third
                    second = arr[i];  // update second
                }
                // If current number is between second and third
                else if (arr[i] > third) {
                    third = arr[i];
                }
            }
        }

        System.out.println("Second Largest: " + second);
        System.out.println("Third Largest: " + third);

	}

}
