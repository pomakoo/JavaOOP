package ch06_Aggregation_Ex6_7;

public class MainCalWater {
	public static String name="Samorn";
	public static int unit=105;
	public static CalWater cw=new CalWater();

	public static void main(String[] args) {
		System.out.println("----------------");
		System.out.println("Samorn water bill");
		System.out.println("----------------");
		System.out.println(" "+cw.cal(unit));
		System.out.println("----------------");

	}

}
