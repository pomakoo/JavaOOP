package TaxCalculation;

import KeepResult.KeepResult;

public class TaxCalculation {

	public static void main(String[] args) {
		TaxCalculation t = new TaxCalculation();
		
		KeepResult kr;
		
		double taxrate=0.05; 
		double money=50000;
		
		kr=t.calculation((float)taxrate, (float)money);
		
		System.out.println(kr.getTax());

	}
	
	public KeepResult calculation(float r,float m){
		KeepResult k=new KeepResult();
		k.calculate(r, m);
		return k;
	}

}
