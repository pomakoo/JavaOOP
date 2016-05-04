package ch08_MultipleInterface_Ex8_10;

public class calculatorApplication {
	
	private static implCalculator casio = new implCalculator();
	private static int a=500;
	private static int b=700;
	private static double x=30.8;
	private static double y=90.5;
	
	private static int c=95;
	
	public static void main(String[] args) {
		
	System.out.println("x+y="+casio.plusTypeA(x, y));
	System.out.println("x-y="+casio.minusTypeA(x, y));
	System.out.println("x*y="+casio.multiplyTypeA(x, y));
	System.out.println("x/y="+casio.divideTypeA(x, y));
	System.out.println("a+b="+casio.plusTypeB(a, b));
	System.out.println("a-b="+casio.minusTypeB(a, b));
	System.out.println("a*b="+casio.multiplyTypeB(a, b));
	System.out.println("a/b="+casio.divideTypeB(a, b));
	
	System.out.println("---------------Overload function----------------");	
	System.out.println("a+b="+casio.plusTypeB(a, b, c));
	
	}

}
