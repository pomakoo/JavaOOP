package ch06_Aggregation_Ex6_7;

public class CalWater {
	WaterRate w=new WaterRate();
	
	public int cal(int u){
		int total=0;
		
		if(u<=5)
			total+=w.rateA(u);
		else if((u>5)&&(u<=10)){
			total+=w.rateB(u);
		}else if((u>10)&&(u<=50)){
			total+=w.rateB(5);
			total+=w.rateC(u-5);
		}else if(u>50){
			total+=w.rateB(5);
			total+=w.rateC(40);
			total+=w.rateC(u-40);
		}
		
		return total;
	}
}
