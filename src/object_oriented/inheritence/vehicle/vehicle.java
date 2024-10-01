package object_oriented.inheritence.vehicle;

public class vehicle {
	public  int numberOfWheels;
	private int hoursePower = 400; // private variable not accessible in child class

	public void commute(){
		System.out.println("I have a car with " + numberOfWheels + " wheels" + " and " + hoursePower + " hourse power");
	}
}
