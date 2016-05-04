package ch08_MultipleInterface_Ex8_10;

public class implCalculator implements plusInterface,minusInterface, multiplyInterface, divideInterface {
	public double plusTypeA(double number1, double number2) {
		return number1+number2;
	}
	
	public int plusTypeB(int number1, int number2) {
		return number1+number2;
	}
	
	//Overload function
	public int plusTypeB(int number1, int number2, int number3) {
		return number1+number2+number3;
	}
	
	public double minusTypeA(double number1, double number2) {
		return number1-number2;
	}
	
	public int minusTypeB(int number1, int number2) {
		return number1-number2;
	}
	
	public double multiplyTypeA(double number1,double number2) {
		return number1*number2;
	}
	
	public int multiplyTypeB(int number1,int number2) {
		return number1*number2;
	}
	
	public double divideTypeA(double number1,double number2) {
		return number1/number2;
	}
	
	public int divideTypeB(int number1,int number2) {
		return number1/number2;
	}
}
