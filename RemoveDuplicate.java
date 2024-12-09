package week3.day1;

public class RemoveDuplicate {

	public static void main(String[] args) {

		// Write a program to find the duplicate numbers in the given array

		int[] nums = { 2, 5, 7, 7, 5, 9, 2, 3 };
		// 0 1 2 3 4 5 6 7

		// to iterate the array
		for (int i = 0; i < nums.length - 1; i++) {
			// 2
			// to check the duplicate numbers

			for (int j = i + 1; j < nums.length; j++) {
				
				if (nums[i]!=nums[j]) {
					
					
				} 
				

				// 5 7 7 5 9 2 3

				// num[0]==num[0+1] 2 == 5
				// num[0]==num[1+1] 2 == 7
				// num[0]==num[2+1] 2 == 7
				// num[0]==num[3+1] 2 == 5
				// num[0]==num[4+1] 2 == 9

			}
			
		}
		
	}
}
