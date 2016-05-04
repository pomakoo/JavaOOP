package ch08_Abstract_Ex8_15;

public class extendAbstractCal extends abstractCalculator {
	public double plus(double number1, double number2) {
		return number1+number2;
	}
	
	public double minus(double number1, double number2) {
		return number1-number2;
	}
	
	double multiply(double number1, double number2) {
		return number1*number2;
	}
	
	public double divide(double number1, double number2) {
		return number1/number2;
	}

}
