package ch09_Upcase_Ex9_4;

public class mainApp {

	public static void main(String[] args) {
		Clock c;
		Rolex r=new Rolex();
		
		c = (Clock)r;
		c.showName();
		c.move();

	}

}
