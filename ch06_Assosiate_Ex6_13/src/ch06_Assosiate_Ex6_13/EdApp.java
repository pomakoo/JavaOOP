package ch06_Assosiate_Ex6_13;

public class EdApp {
	private static DepartMent d=new DepartMent();
	private static Teacher[] t=new Teacher[5];

	public static void main(String[] args) {
		d.setName("Computer Science");
		d.setTeacher(t);

		//----------
		t[0]=new Teacher();
		t[0].setName("aName");
		t[0].setSurname("aSurname");
		t[0].setDepartMent(d);
		
		//--------------------
		t[1]=new Teacher();
		t[1].setName("bName");
		t[1].setSurname("bSurname");
		t[1].setDepartMent(d);
		
		//---------------------
		t[2]=new Teacher();
		t[2].setName("cName");
		t[2].setSurname("cSurname");
		t[2].setDepartMent(d);
		
		//---------------------
		t[3]=new Teacher();
		t[3].setName("dName");
		t[3].setSurname("dSurname");
		t[3].setDepartMent(d);
		
		//-----------------------
		t[4]=new Teacher();
		t[4].setName("eName");
		t[4].setSurname("eSurname");
		t[4].setDepartMent(d);
		
		// Report
		Teacher[] data = d.getTeacher();
		System.out.println("-----------------------");		
		System.out.println(d.getName());
		System.out.println("-----------------------");
		
		for(int i=0;i<data.length;i++){
			System.out.println(data[i].getName()+" "+data[i].getSurname());
		}
		
		System.out.println("-----------------------");
		
		

	}

}
