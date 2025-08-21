public class PINumberFormatting {
	
	public static void main(String[] args) {
	    double pii = Math.PI;
	    System.out.printf("%.1f%n",pii);
	    System.out.printf("%.2f%n",pii);
	    System.out.printf("%.3f%n",pii);
	    System.out.printf("%.4f%n",pii);
	    System.out.printf("%.5f%n",pii);
	        
	}

}

/*Format floating-point number
Implement console program which meet the following requirements:

Program starts and prints Math.PI five times in console output

The first Math.PI contains only one fraction digit

The second Math.PI contains two fraction digits

The third time Math.PI contains three fraction digits

The fourth time Math.PI contains four fraction digits

The fifth time Math.PI contains five fraction digits*/