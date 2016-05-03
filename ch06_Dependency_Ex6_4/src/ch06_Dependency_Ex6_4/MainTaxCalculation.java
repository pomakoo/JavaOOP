package ch06_Dependency_Ex6_4;

public class MainTaxCalculation {

	public static void main(String[] args) {
		Person p=new Person();
		Calculation c=new Calculation();
		Report r=new Report();
		
		p.setName("Somporn");
		p.setSurname("Somjai");
		
		r.reportPerson(p.getName(), p.getSurname());
		r.reportTax(c.calTax(0.05, 700000));

	}

}
