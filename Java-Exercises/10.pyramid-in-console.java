import java.util.Scanner;

public class PyramidInConsole {
    
    public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
        
        Scanner inn = new Scanner(System.in);
        int inNum = inn.nextInt();
        inn.close();
        //System.out.println(inStr);
        
        for (int i=1; i<inNum+1; i++){
            System.out.println("*".repeat(i));
        }
        
        for (int i=inNum-1; i>0; i--){
            System.out.println("*".repeat(i));
        }
        
        
    }

}

/*
Pyramid in console
Implement console program which will meet the following requirements:

Program starts and asks user to enter the height of the pyramid.

Program draws such picture in console:


*

**

***

****

***

**

*

In example above the height of the pyramid is 4
*/