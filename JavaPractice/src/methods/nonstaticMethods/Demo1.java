//Instance or Non-static methods
package methods.nonstaticMethods;

public class Demo1 
{
	int n = 0;
	public void instanceMethod()
	{
		System.out.println("Inside instanceMethod value of n is :" + n);
	}
	public static void main(String[] args) 
	{
		Demo1 obj = new Demo1();
		obj.instanceMethod();
		System.out.println("InstanceMethod value in main method : " + obj.n);
	}
}
/*
Non-Static (Instance) Methods

Belong to the object: They require an instance of the class to be called.
					  Can access instance variables and instance methods directly.
					  Can access static variables and static methods.
					  Cannot be called using the class name directly; an object reference is needed.
*/