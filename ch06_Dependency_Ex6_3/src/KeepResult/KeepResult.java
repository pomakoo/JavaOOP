package KeepResult;

public class KeepResult {
	
	private float Tax;
	
	public void calculate(float taxRate, float m){
		setTax(taxRate*m);
	}
	
	public float getTax() {
		return Tax;
	}
	
	public void setTax(float t) {
		Tax = t;
	}

}
