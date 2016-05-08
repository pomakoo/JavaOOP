package oop.Lesson10.Ex_10_4.AdapterPackage;
import oop.Lesson10.Ex_10_4.LegacyAccount.*;
import oop.Lesson10.Ex_10_4.Application.*;

public class Adapter extends AbstractApplication{
	TaxCalculate taxobj=new TaxCalculate();

	public double processMethod(double m){
		return taxobj.compute(m);
	}
}
