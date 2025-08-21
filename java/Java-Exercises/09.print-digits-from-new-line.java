import java.util.Scanner;
public class NewLineForDigit {
    
    public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");

		Scanner inn = new Scanner(System.in);
		String nums = inn.nextLine();
		inn.close();

		for (char ch : nums.toCharArray()){
		    System.out.println(ch);
		}
	
    }
   
}


/*
Print digits from new line
Implement console program which will meet the following requirements:

Program starts and asks user to enter integer number

Program prints each digit from the new line

EXAMPLE:
User input: “12345”

Program console output:

1
2
3
4
5
*/