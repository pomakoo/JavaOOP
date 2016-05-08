package oop.Lesson10_Ex_10_1.FactoryOfCarApplication;

public class Car {
	public Car crateCar(){
		return new Car();
	}
		
	public void drive(){
		System.out.println("Car need to implement.");
	}
}
