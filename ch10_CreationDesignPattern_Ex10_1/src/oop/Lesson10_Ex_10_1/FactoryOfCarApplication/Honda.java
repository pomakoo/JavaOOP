package oop.Lesson10_Ex_10_1.FactoryOfCarApplication;

public class Honda extends Car{
	public Car crateCar() {
		return new Honda();
	}
		
	public void drive() {
		System.out.println("I am Honda, and I am running.");
	}

}
