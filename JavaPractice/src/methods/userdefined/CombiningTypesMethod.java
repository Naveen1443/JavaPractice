//performing addition between two numbers in a method
package methods.userdefined;

public class CombiningTypesMethod 
{
	public static int addNumbers(int a, int b)
	{
		return a + b;
	}
	public static void main(String[]args)
	{
		int a = 10;
		int b = 20;
		int sum = addNumbers(a, b);
		System.out.println("the addition of "+a+" and "+b+ " is : "+sum);
	}
}