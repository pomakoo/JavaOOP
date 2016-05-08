package oop.Lesson10_Ex_10_1.FactoryOfCarApplication;

public class Ford extends Car {
	public Car crateCar() {
		return new Ford();
	}
		
	public void drive() {
		System.out.println("I am Ford, and I am running.");
	}

}
