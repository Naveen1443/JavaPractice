//Math pre-defined methods
package methods.predefined;

public class Mathmethods 
{
	public static void main(String[]args)
	{
		int number = -10;
		double value = 16.0;
		double base = 2.0;
		double exponent = 3.0;
		
		//using absolute method
		int absoluteValue = Math.abs(number);
		System.out.println("Absolute Value : " + absoluteValue);
		
		//using squareRoot method
		double squareRoot = Math.sqrt(value);
		System.out.println("Square root : " + squareRoot);
		
		//using power method
		double power = Math.pow(base, exponent);
		System.out.println("Power : " + power);
	}
}
