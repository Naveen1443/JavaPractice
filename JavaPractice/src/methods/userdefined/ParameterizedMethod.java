package methods.userdefined;

public class ParameterizedMethod 
{
	//user-defined parameterized method
	public static boolean checkEven(int num)
	{
		return num%2 == 0;
	}
	public static void main(String[] args) 
	{
		int num = 4;
		boolean isEven = checkEven(num);
		System.out.println("Is " + num + " even? " + isEven);;
	}
}

/*Explanation
	
Parameterized Methods:   	These methods take input parameters, perform an action, and optionally return a value.
						 	The checkEven method checks if a number is even and returns a boolean.
					
*/
