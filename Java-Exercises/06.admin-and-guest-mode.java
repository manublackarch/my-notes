import java.util.Arrays;
public class AdminGuestMode {

    public static void main(String[] args) {
		boolean admin = false;
		boolean guest = false;
		for (String arg:args){
		    if (arg.equals("--admin")){
		        admin = true;
		    } 
		    if (arg.equals("--guest")){
		        guest = true;
		    }
		}
		if (admin && guest){
		    System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		} else if (admin){
		    System.out.println("Hello, Admin!");
		} else if (guest){
		    System.out.println("Hello, Guest!");
		}
		
		
	}

}


/*
Admin and Guest mode for application
Implement console program which will meet the following requirements:

Program can be started in ‘admin’ and ‘guest’ mode

To start program in ‘admin’ mode any of multiple string arguments should be equal to ‘--admin’

To start program in ‘guest’ mode any of multiple string arguments should be equal to ‘--guest’

Program cannot be started with ‘--admin’ and ‘--guest’ arguments simultaneously

If program is started in ‘admin’ mode then "Hello, Admin!" is printed to console

If program is started in ‘guest’ mode then "Hello, Guest!" is printed to console

If program is started with ‘--admin’ and ‘--guest’ arguments then program prints "Please, select either 'ADMIN' or 'GUEST' mode for this program" to console
*/

