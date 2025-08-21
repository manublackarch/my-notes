import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExtension {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter length of initial array: ");
		int baseArrayLength = sc.nextInt();
		int[] arr = generateRandomArray(baseArrayLength);
		
		int[] extendedArray = extendArray(arr);
		System.out.println("*** Initial array ***");
		System.out.println(Arrays.toString(arr));
		System.out.println("*** Extended array ***");
		System.out.println(Arrays.toString(extendedArray));
	}

	/**
	 * The method extends array.
	 * If array {1, 2, 3} has been passed to this method then array {1, 2, 3, 2, 4, 6}
	 * is returned from this method.
	 * 
	 * @param arr - base of extension. Extended array contains elements from this array
	 * and additionally contains the same elements multiplied by two. 
	 * @return extended array.
	 */
	public static int[] extendArray(int[] arr) {
	    //<write your code here>
	    String simpleStr = "";
	    for (int i=0; i<arr.length; i++){
	        simpleStr += String.valueOf(arr[i]) + " ";
	    }
	    for (int i=0; i<arr.length; i++){
	        simpleStr += String.valueOf(arr[i]*2) + " ";
	    }
	    
	    String[] finalStrArry = simpleStr.trim().split("\\s+");
	    int[] resultInt = new int[finalStrArry.length];
	    
	    for (int i=0; i>finalStrArry.length; i++) {
	    	resultInt[i] = Integer.parseInt(finalStrArry[i]);
	    }
	    return resultInt;
	    
	    
	    
	}

	public static int[] generateRandomArray(int amountOfElements) {
		//<write your code here>
		Random ranObj = new Random();
		String ranStr = "";
		int[] ranInt = new int[amountOfElements];
		
		for (int i=0; i<amountOfElements; i++){
		    int ranNum = ranObj.nextInt(100);
		    ranStr += String.valueOf(ranNum) + " ";
		}
		
		String[] ranStrArry = ranStr.trim().split("\\s+");
		for (int i=0; i<ranStrArry.length; i++){
		    ranInt[i]=Integer.parseInt(ranStrArry[i]);
		}
		return ranInt;
	}

}


/*
Extend Array
Implement console program which will meet the following requirements:

Program starts and asks user to enter length of an array.

Program generates array of random integer numbers (use java.util.Random) with array length specified by user. Random numbers should be between 1 and 100.

Method should look like this:
public static int[] generateRandomArray(int amountOfElements) {
        <write your code here>
}


Program creates the second array with size of twice as much as the first array.

The first elements in the new array are first the same elements as in old array. The other half of elements are elements as in the first array multiplied by two.

public static int[] extendArray(int[] arr) {

             <write your code here>

        }

For example, if user set initial array length as ten:

array #1 - {1, 3, 5, 7, 10, 11, 12, 15, 17, 20} (generated randomly)

array #2 - {1, 3, 5, 7, 10, 11, 12, 15, 17, 20, 2, 6, 10, 14, 20, 22, 24, 30, 34, 40}
*/
