package oop.Lesson10.Ex_10_5;
import oop.Lesson10.Ex_10_5.IteratorApp.*;

public class Client {
	public static void main(String args[]){
		CollectionPerson cp = new CollectionPerson();
		
		cp.add(new Person("Somporn","Deejai"));
		cp.add(new Person("Makeaw","Wanjeab"));
		cp.add(new Person("Thongkeaw","Tungdinda"));
		cp.add(new Person("Makeaw","Arunrung"));
		cp.add(new Person("Bawvee","Sandang"));
		
		java.util.Iterator<Person> iterator= cp.listIterator();
		while(iterator.hasNext()){
			Person temp=iterator.next();
			System.out.println(temp.getData());
		}
	}
}