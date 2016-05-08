package oop.Lesson10_Ex_10_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import oop.Lesson10_Ex_10_1.FactoryOfCarApplication.Car;
import oop.Lesson10_Ex_10_1.FactoryOfCarApplication.Ford;
import oop.Lesson10_Ex_10_1.FactoryOfCarApplication.Honda;
import oop.Lesson10_Ex_10_1.FactoryOfCarApplication.Toyota;

public class Client {

	public static void main(String[] args) throws IOException {
		Car c = null;
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.println("Input Choice:1-3:");
		String input = stdin.readLine();

		switch (Integer.parseInt(input)) {
		case 1: {
			Toyota t = new Toyota();
			c = t.crateCar();
			break;
		}
		case 2: {
			Honda t = new Honda();
			c = t.crateCar();
			break;
		}
		case 3: {
			Ford t = new Ford();
			c = t.crateCar();
			break;
		}
		default:
			break;
		}

		c.drive();
	}
}
