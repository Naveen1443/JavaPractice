/*
Definition:
		A no-argument constructor is a constructor that takes no parameters. It’s explicitly defined by 
		the programmer if needed.
*/

package constructors;

public class No_argConstructor 
{
	static class Car
	{
		String model;
		int year;
		Car()
		{
			model = "Unkknown";
			year = 2021;
		}
	}
	public static void main(String[] args) 
	{
		Car obj = new Car();
		System.out.println("Model : "+obj.model);
		System.out.println("Year :"+obj.year);
	}
}
/*
Explanation:
		The Car class has a parameterized constructor that takes model and year as parameters. 
		When object is created, these values are passed to the constructor to initialize the object.
*/