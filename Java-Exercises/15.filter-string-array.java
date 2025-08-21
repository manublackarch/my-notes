
import java.util.Scanner;
import java.util.Arrays;
public class FilterStringArray {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}

	
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		//<write your code here>
		String wordsSaved = "";
		for (String ech:words){
		    if (ech.length()>=minLength){
		        wordsSaved += ech + " ";
		    }
		}
		String[] filterWords = wordsSaved.trim().split("\\s+");
		return filterWords;
	}

}


/*
Filter String array
Implement console program which will meet the following requirements:

Program starts and asks user to enter random words separated by space

Program asks user to enter minimum length of string to filter words which were entered

Program creates array object from entered words

Program calls specific method which takes String[] as a parameter and returns array of strings which contains words that have length more or equal to value specified by user

Method should look like this:
public static String[] filterWordsByLength(int minLength, String[] words) {

             <write your code here>
      }



c. Program prints filtered array to the console output.
*/