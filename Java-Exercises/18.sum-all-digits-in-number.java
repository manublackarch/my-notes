import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
		//<write your code here>
		String strNum = String.valueOf(Math.abs(number));
		int sum = 0;
		for (char ech: strNum.toCharArray()){
		    sum += Character.getNumericValue(ech);
		}
		return sum;
	}
}

/*
Sum all digits in number
Implement console program which will meet the following requirements:

Program starts and asks user to enter number

Program calls method which takes int as an argument and returns sum of all digits in this number.

Method should look like this:
public static int sumDigitsInNumber(int number) {
<write your code here>
}

Program prints sum of all digits to console
*/