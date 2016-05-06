package ch09_Downcast_Ex9_6;

public class mainApp {
	public static void main(String[] args) {
		Rolex r;
		Clock c=new Rolex();
		r=(Rolex)c;
		r.showName();
		r.move();
	}
}
