package oop.Lesson10_Ex_10_2;
import java.io.*;
import oop.Lesson10_Ex_10_2.WordProcessorFactory.*;

public class Client {
	public static void main(String args[]) throws IOException{
		Style s=null;
		Document doc=new Document();
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		System.out.println("Input Doc:");
		String message=stdin.readLine();
		System.out.println("Input Style 1=small, 2=medium, and 3=large:");
		String style=stdin.readLine();
		switch(Integer.parseInt(style)){
			case 1:{
				s=new SmallStyle();
				s.setStyle("Small Style");
				break;
			}
			case 2: {
				s=new MediumStyle();
				s.setStyle("Medium Style");
				break;
			}
			case 3: {
				s=new LargeStyle();
				s.setStyle("Large Style");
				break;
			}
			default:
				break;
		}
		doc.setStyle(s);
		doc.display(message);
	}
}
