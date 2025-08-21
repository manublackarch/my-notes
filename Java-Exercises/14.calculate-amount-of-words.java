
import java.util.Scanner;
public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
	
	    //<write your code here>
	    String innStr = sc.nextLine();
	    int amountOfWords = getWordsAmount(innStr);
	    
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	public static int getWordsAmount(String text) {
		//<write your code here>
		String[] arryWords = text.trim().split("\\s+");
		return arryWords.length;
		
	}
}

/*
Calculate Amount of Words
Implement console program which will meet the following requirements:

Program starts and asks user to enter text.

Program calls specific function which take one parameter of String type and returns amount of words in the text.

Method should look like this:
public static int getWordsAmount(String text) {
<write your code here>
}


Program prints amount of words to the console.
*/