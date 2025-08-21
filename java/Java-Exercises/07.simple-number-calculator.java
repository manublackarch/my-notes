public class AddNumbers {
    
    public static void main(String[] args) {
        boolean isFloat = false;
        int sumy;
        double suma;
        
        for (String arg:args){
            if (arg.contains(".")){
                isFloat = true;
            }
        }
        
        if (isFloat){
            suma = Double.parseDouble(args[0]) + Double.parseDouble(args[1]);
            System.out.println(suma);
        } else{
            sumy = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
            System.out.println(sumy);
        }
	}
}

/*
Simple Number Calculator
Implement console program which will meet the following requirements:

Program is started with two arguments (numbers)

Program adds these two numbers

In case one of the input arguments is floating-point number - the result of addition is floating-point number

In case two arguments are integer - the result of addition is integer
*/