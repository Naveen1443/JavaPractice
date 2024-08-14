//static method in Methods concept
package methods.staticMethods;

public class Demo1 
{
	static int n = 0;
	public static void staticMethod()
	{
		System.out.println("static method value : " + n);
	}
	public static void main(String[]args)
	{
		Demo1.staticMethod();
		System.out.println("static method value in main method : " + Demo1.n);
	}
}
/*
Static Methods

Belong to the class: They can be called without creating an instance of the class.
					 Can access static variables and static methods directly.
					 Cannot access instance variables or instance methods directly: 
					 They need an object reference to do so.
					 Can be called using the class name.
*/