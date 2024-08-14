package methods.userdefined;

public class ValueReturnMethod 
{
	// User-defined value-returning method
	public static int calculateSquare(int num)
	{
		return num * num;
	}
	public static void main(String[]args)
	{
		int num = 5;
		int square = calculateSquare(num);
		System.out.println("the " + num +"'s square is " + square );
	}
}
/*
Explanation
						 	
Value-returning Methods: 	These methods perform an action and return a value. 
						 	The calculateSquare method returns the square of a number.
						 	
*/
