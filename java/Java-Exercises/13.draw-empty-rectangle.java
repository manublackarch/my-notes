import java.util.Scanner;
public class EmptyRectangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
		//<write your code here>
		System.out.println("*".repeat(width));
		for (int i=0; i<height-2; i++) {
			System.out.println("*"+" ".repeat(width-2)+"*");
		}
		System.out.println("*".repeat(width));
	}

}

/*
Draw empty rectangle
Implement console program which will meet the following requirements:

Program starts and asks user to input height of the rectangle

After user inputs heights of the rectangle, program asks to input width of the rectangle.

Program calls specific method which takes two parameters of int type which prints rectangle to the console:
         ******
         *    *
         ******

In the example above height of the rectangle is 3, the width of the rectangle is 6

N.B.: rectangle is empty inside
*/