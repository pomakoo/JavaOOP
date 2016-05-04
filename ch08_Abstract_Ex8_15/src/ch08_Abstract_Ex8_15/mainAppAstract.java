package ch08_Abstract_Ex8_15;

public class mainAppAstract {
	private static extendAbstractCal casio = new extendAbstractCal();
	private static double x=90.50;
	private static double y=23.70;

	public static void main(String[] args) {
		System.out.println("x+y="+casio.plus(x, y));
		System.out.println("x-y="+casio.minus(x, y));
		System.out.println("x*y="+casio.multiply(x, y));
		System.out.println("x/y="+casio.divide(x, y));
	}

}
