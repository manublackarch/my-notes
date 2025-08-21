import java.util.Scanner;

public class DemoEnum {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please, enter message type to check it priority: ");
			String userInput = sc.next();

			if (isValidMessageType(userInput)) {
				//<write your code here>
				MessageType messagetype = MessageType.valueOf(userInput.toUpperCase());
				break;
			} else {
				System.out.println("Please, enter valid "+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
				continue;
			}

		}

	}

	private static boolean isValidMessageType(String userInput) {
		//<write your code here>
		if ((userInput.contains("A")) || (userInput.contains("B")) || (userInput.contains("C")) || (userInput.contains("D"))){
		    return true;
		} else {
		    return false;
		}
	}

}



/*
Message type priority
Implement console program which will meet the following requirements:

Program starts and ask user to enter message type

Only ‘A’, ‘B’, ‘C’ or ‘D’ message types are allowed.

In case user entered invalid message type, program asks to enter message type again

When valid message type is entered program prints message type priority to console

Priority and Message Type implemented as enum types

Message types have next priorities:

Message Type Priority

A HIGH

B MEDIUM

C LOW

D LOW



MessageType enum has next method:



public Priority getPriority() {

        <write your code here>

}


*/
