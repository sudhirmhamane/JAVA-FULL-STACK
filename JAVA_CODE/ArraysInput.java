/*
import java.util.Scanner;
class ArraysInput{
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("First Enter length of array and then array element upto length);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		for(int a: arr){
			System.out.print(a + " ");
		}
		sc.close();
	}
}

	Notes: input array by user when length of array is given by using the array
	       when size of array is given (Regular).
	

*/

/*

import java.util.Scanner;
import java.util.ArrayList;
class ArraysInput{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("First Enter length of array and then array element upto length");
		int n = sc.nextInt();	
		
		ArrayList<Integer> arr = new ArrayList<>();

		for(int i=0; i<n; i++){
			arr.add(sc.nextInt());
		}
	
		for(int a: arr){
			System.out.print(a + " ");
		}
		sc.close();

	}
}

*/

// input array when size of array is not given:


/*


import java.util.Scanner;
import java.util.ArrayList;
// import java.util.*;

class ArraysInput{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();

		// spliting the arrays for spaces.
		// String ch[] = input.split(" ");
		
		//spliting the arrays for comma.
		String ch[] = input.split(",");

		ArrayList<Integer> arr = new ArrayList<>();

		for(String token: ch){
			// to convert string to integer
			int num = Integer.parseInt(token);
			arr.add(num);
		}
		
		for(int a: arr){
			System.out.print(a+ " ");
		}
		sc.close();
	}
}

*/

// when user give the array input like {1,2,3,4,5} or [1,2,3,4,5] it can be {1 2 3 4 5}, [1 2 3 4 5]

import java.util.Scanner;
import java.util.ArrayList;
// import java.util.*;

class ArraysInput{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if(input.startsWith("{") && input.endsWith("}") || input.startsWith("[") && input.endsWith("]")){
			input = input.substring(1, input.length()-1);
		}
	
		//String []ch = input.split(" ");
		String []ch = input.split(",");
		ArrayList<Integer> arr = new ArrayList<>();

		for(String token: ch){
			int num = Integer.parseInt(token);
			arr.add(num);
		}

		for(int a: arr){
			System.out.print(a+ " ");
		}
		sc.close();

	}
}