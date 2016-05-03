package ShowNameAppPara;

public class ShowNameAppPara {

	public static void main(String[] args) {
		ShowNameAppPara m= new ShowNameAppPara();
		ShowName n = new ShowName();
		m.activateName(n);

	}
	
	public void activateName(ShowName name){
		name.showMyName();
		name.showMySurname();
		name.showMyAddress();
	}

}
