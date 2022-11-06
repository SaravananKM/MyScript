package week1.day1;
// Purple colors words are keyword and keyword should not be used as ClassName, methodName, variableName, objectName
public class Car {
	public void driveCar() {
		// code to print a text
		System.out.println("Drive Car");
	}
	public void applyBrake() {
		// code to print a text
		System.out.println("Applied Brake");
	}
	public static void main(String[] args) {
		// create object to execute methods
		// ClassName objectName=new ClassName();
		Car myCar=new Car();
		// call method using object
		myCar.driveCar();
		myCar.applyBrake();
	}
}
