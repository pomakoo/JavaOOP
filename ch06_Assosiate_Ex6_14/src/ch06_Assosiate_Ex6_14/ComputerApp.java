package ch06_Assosiate_Ex6_14;

public class ComputerApp {
	
	private static Room[] r=new Room[3];
	private static Computer[] comset1=new Computer[2];
	private static Computer[] comset2=new Computer[2];
	private static Computer[] comset3=new Computer[2];
	
	public static void main(String args[]){
		r[0]=new Room(); 
		r[0].setName("Room A");
		
		r[1]=new Room(); 
		r[1].setName("Room B");
		
		r[2]=new Room(); 
		r[2].setName("Room C");
		
		//Set computer set to room
		r[0].setComputer(comset1);
		r[1].setComputer(comset2);
		r[2].setComputer(comset3);
			
		//----------
		comset1[0]=new Computer();
		comset1[0].setNo(1);
		comset1[0].setSpect("Acer 1");
		comset1[0].setRoom(r[0]);
		
		//----------
		comset1[1]=new Computer();
		comset1[1].setNo(2);
		comset1[1].setSpect("IBM 1");
		comset1[1].setRoom(r[0]);
		
		//----------
		comset2[0]=new Computer();
		comset2[0].setNo(1);
		comset2[0].setSpect("Acer 2");
		comset2[0].setRoom(r[1]);
		
		//----------
		comset2[1]=new Computer();
		comset2[1].setNo(2);
		comset2[1].setSpect("IBM 2");
		comset2[1].setRoom(r[1]);
	
		//----------
		comset3[0]=new Computer();
		comset3[0].setNo(1);
		comset3[0].setSpect("Acer 3");
		comset3[0].setRoom(r[2]);
			
		//----------
		comset3[1]=new Computer();
		comset3[1].setNo(2);
		comset3[1].setSpect("IBM 3");
		comset3[1].setRoom(r[2]);
		
		// Report Room 1
		Computer[] cm1=r[0].getComputer();
		System.out.println("-----------------------");
		System.out.println(r[0].getName());
		System.out.println("-----------------------");
		for(int i=0;i<cm1.length;i++){
			System.out.println(cm1[i].getNo()+" "+cm1[i].getSpect());
		}
		System.out.println("-----------------------");
			
		// Report Room 2
		Computer[] cm2=r[1].getComputer();
		System.out.println("-----------------------");
		System.out.println(r[1].getName());
		System.out.println("-----------------------");
		for(int i=0;i<cm2.length;i++){
			System.out.println(cm2[i].getNo()+" "+cm2[i].getSpect());
		}
		System.out.println("-----------------------");
	
		// Report Room 3
		Computer[] cm3=r[2].getComputer();
		System.out.println("-----------------------");
		System.out.println(r[2].getName());
		System.out.println("-----------------------");
		for(int i=0;i<cm3.length;i++){
			System.out.println(cm3[i].getNo()+" "+cm3[i].getSpect());
		}
		
		System.out.println("-----------------------");
	}
}
