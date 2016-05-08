package oop.Lesson10_Ex_10_1.FactoryOfCarApplication;

public class Toyota extends Car {
	public Car crateCar() {
		return new Toyota();
	}
		
	public void drive() {
		System.out.println("I am Toyota, and I am running.");
	}

}
