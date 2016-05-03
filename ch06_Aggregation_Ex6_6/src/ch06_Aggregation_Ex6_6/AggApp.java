package ch06_Aggregation_Ex6_6;

public class AggApp {
	AggShowName aggObj = new AggShowName();
	
	public static void main(String[] args) {
		AggApp myApp = new AggApp();
		
		myApp.aggObj.showMyName();
		myApp.aggObj.showMySurname();

	}

}
