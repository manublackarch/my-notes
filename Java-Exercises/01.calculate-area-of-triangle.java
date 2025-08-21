import java.util.Scanner;

public class AreaOfTriangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		int sideA = sc.nextInt();
		
		System.out.print("Please, enter B side of a triangle: ");
		int sideB = sc.nextInt();
		
		System.out.print("Please, enter C side of a triangle: ");
		int sideC = sc.nextInt();
		
        double periMeter = (sideA + sideB + sideC )/2;
        double areaA = periMeter*(periMeter-sideA) * (periMeter-sideB) * (periMeter-sideC);
        double triangleArea = Math.sqrt(areaA);
		
		System.out.println("Triangle area is: " + triangleArea);
		
	}

}
