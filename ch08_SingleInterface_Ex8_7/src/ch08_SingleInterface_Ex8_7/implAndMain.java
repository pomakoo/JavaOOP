package ch08_SingleInterface_Ex8_7;

public class implAndMain implements CalculatorInterface {
	private static double x=10.6;
	private static double y=900.5;
	
	public double plus(double number1,double number2){
		return number1+number2;
	}
	public double minus(double number1,double number2){
		return number1-number2;
	}
	
	public double multiply(double number1,double number2){
		return number1*number2;
	}
	
	public double divide(double number1,double number2){
		return number1/number2;
	}
	
	public static void main(String[] args) {
		implAndMain obj=new implAndMain();
		
		System.out.println("x+y="+obj.plus(x,y));
		System.out.println("x-y="+obj.minus(x,y));
		System.out.println("x*y="+obj.multiply(x,y));
		System.out.println("x/y="+obj.divide(x,y));
	}

}
