/*
 Definition:
	A parameterized constructor is defined by the programmer and takes arguments. 
	It allows you to initialize an object with specific values when it is created.
 */
package constructors;

public class ParameterizedConstructor 
{
	static class Car 
	{
	    String model;
	    int year;
	    
	    Car(String m, int y) 
	    {
	        model = m;
	        year = y;
	    }
	}
	public static void main(String[] args) 
    {
        Car car1 = new Car("Toyota", 2020);  
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);
    }

}
/*
Explanation:
		The Car class has a parameterized constructor that takes model and year as parameters. 
		When car1 is created, these values are passed to the constructor to initialize the object.
*/
