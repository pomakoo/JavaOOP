package oop.Lesson10.Ex_10_4.Application;

import java.io.*;
import oop.Lesson10.Ex_10_4.AdapterPackage.*;

public class Client {

	public static void main(String args[]) throws IOException{
		String money;
		AbstractApplication adapter=new Adapter();
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);

		System.out.println("Input Money:");

		money=stdin.readLine();
		double taxResult = adapter.processMethod(Double.parseDouble(money));
		System.out.format("Tax is :%.2f",taxResult);
	}
}