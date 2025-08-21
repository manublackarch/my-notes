import java.util.Scanner;

public class GreatestCommonDivisor {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter two numbers separated by space: ");
		String userInput = sc.nextLine();
		
		String[] inputArgumentsArray = userInput.split("\\s+");
		int number1 = Integer.parseInt(inputArgumentsArray[0]);
		int number2 = Integer.parseInt(inputArgumentsArray[1]);

		System.out.println(gcdRecursive(number1, number2));
	}
	
	public static int gcdRecursive(int firstNumber, int secondNumber) {
		//<write your code here>
		int largeInt;
		int smallInt;
		if (firstNumber>secondNumber){
		    largeInt=firstNumber;
		    smallInt=secondNumber;
		} else{
		    largeInt=secondNumber;
		    smallInt=firstNumber;
		}
		
		while (smallInt!=0){
		    int remainder = largeInt%smallInt;
		    largeInt = smallInt;
		    smallInt = remainder;
		}
		return Math.abs(largeInt);
	}
}


/*
Greatest Common Divisor
Implement console program which will meet the following requirements:

Program starts and asks user to enter two numbers separated by space

Programs call specific method to find greatest common divisor.

Method should look like this:
public static int gcdRecursive(int firstNumber, int secondNumber) {
<write your code here>
}


Program prints greatest common divisor to console
*/