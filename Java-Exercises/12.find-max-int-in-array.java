import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
	
	    //<write your code here>
	    String innStr = sc.nextLine();
	    String[] strArray = innStr.split(" ");
	    int[] intArray = new int[strArray.length];
	    
	    for (int i=0; i<strArray.length; i++){
	        intArray[i] = Integer.parseInt(strArray[i]);
	    }
	    
	    int maxInt = findMaxIntInArray(intArray);
	
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		//<write your code here>
		int nu = 0;
		for (int ech: intArray){
		    if (ech>nu){
		        nu = ech;
		    }
		}
		return nu;
	}
}


/*
Find max int in array
Implement console program which will meet the following requirements:

Program starts and asks user to input integer numbers separated by space.

Program creates array object with entered numbers.

Program calls specific method which takes int[] as an parameter and returns max value in this array.

Method should look like this:
public static int findMaxIntInArray(int[] intArray) {

<write your code here>
}

*/

