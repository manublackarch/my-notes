public class StringProcessor {
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
			"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
			"james;Derek James;james@gmail.com" + System.lineSeparator() +
			"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
			"gregory;Mike Gregory;gregory@yahoo.com";
	
	public static void main(String[] args) {
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));
		
		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));
		
	}
	
	public static String convert1(String input) {
		//<write your code here>
		String[] first = input.split(System.lineSeparator());
		String[][] second = new String[first.length][];
		for (int i=1; i<first.length; i++) {
			String[] fields = first[i].split(";");
			second[i] = fields;
		}
		String result = "";
		for (int i=1; i<second.length; i++) {
			result += second[i][0] + " ==> " + second[i][2] +System.lineSeparator();
		}
	    return result;
	}
	
	
	public static String convert2(String input) {
		//<write your code here>
		String[] first = input.split(System.lineSeparator());
		String[][] second = new String[first.length][];
		for (int i=1; i<first.length; i++) {
			String[] fields = first[i].split(";");
			second[i] = fields;
		}
		String result = "";
		for (int i=1; i<second.length; i++) {
			result += second[i][1] + " (email: " + second[i][2]+")" +System.lineSeparator();
		}
		return result;
	}
}


/*
String Processor
Implement console program which will meet the following requirements:

Program contains methods that can process input string according to requirements below

You have input string like this:

Login;Name;Email

           peterson;Chris Peterson;peterson@outlook.com

           james;Derek James;james@gmail.com

           jackson;Walter Jackson;jackson@gmail.com

          gregory;Mike Gregory;gregory@yahoo.com


You program has next method:

public static String convert1(String input) {
<write your code here>
}

Which formats input data like this:
peterson ==> peterson@outlook.com

      james ==> james@gmail.com

      jackson ==> jackson@gmail.com

     gregory ==> gregory@yahoo.com




You program has next method:

public static String convert2(String input) {
<write your code here>
}

Which formats input data like this:

Chris Peterson (email: peterson@outlook.com)

      Derek James (email: james@gmail.com)

      Walter Jackson (email: jackson@gmail.com)

      Mike Gregory (email: gregory@yahoo.com)
*/
