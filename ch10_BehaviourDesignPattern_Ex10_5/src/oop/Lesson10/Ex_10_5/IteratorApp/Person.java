package oop.Lesson10.Ex_10_5.IteratorApp;

public class Person {
	private String Name="";
	private String Surname="";
	
	public Person(String n,String s){
		this.Name=n;
		this.Surname=s;
	}

	public String getData(){
		return ("Name:"+Name+" Surname:"+Surname);
	}
}
