package week3.day1;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		char[] var = new char[3];

		var[0] = 'a';
		var[1] = 'b';
		var[2] = 'c';

		System.out.println(var[2]);

		// datatype [] variableName ={};

		char logo[] = { 'a', 'b', 'c', 'd' };

		String[] names = { "Sriram", "Chandru", "Abdul", "Kadhir", "Pradeep", "Suresh", "Preetha", "Mahalakshmi",
				"Jayasree", "Sofia", "Annie" };

		int num[] = { 10, 20, 22, 33, 45, 66, 654, 887, 334 };

		// System.out.println(num [num.length-1]);
		// accending order

		Arrays.sort(num);

		// 10,20,22,33 45,66,334,654,887
		System.out.println("After Sort");

		System.out.println(num[num.length - 1]);
		System.out.println(num[0]);

		// int length = num.length;

		System.out.println(num.length);

		System.out.println(num[0]);

//		
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);	
//		}
		
		

	}
}
