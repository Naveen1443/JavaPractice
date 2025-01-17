/*
 * Definition:
		A copy constructor is a constructor that creates a new object by copying the fields of an existing
		object. In Java, you typically write your own copy constructor.
 */
package constructors;

public class CopyConstructor 
{
	static class Car 
	{
	    String model;
	    int year;
	    // Parameterized constructor
	    Car(String m, int y) 
	    {
	        model = m;
	        year = y;
	    }
	    // Copy constructor
	    Car(Car car) 
	    {
	        model = car.model;
	        year = car.year;
	    }
	}
    public static void main(String[] args) 
    {
        Car car1 = new Car("Honda", 2018);  // Parameterized constructor is called
        Car car2 = new Car(car1);           // Copy constructor is called

        System.out.println("Model: " + car2.model);  // Honda
        System.out.println("Year: " + car2.year);    // 2018
    }
}
/*
Explanation:
	The Car class includes a copy constructor that takes another Car object as a parameter and 
	copies its model and year fields to the new object. When car2 is created, it is initialized 
	with the same values as car1.
*/