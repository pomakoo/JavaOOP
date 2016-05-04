package ch08_SingleInterface_Ex8_8_Ex8_9;

public class implCartoon implements InterfaceCartoon {
	public String moveForward(){
		return "Move forward";
	}
	public String moveBackward(){
		return "Move Backward";
	}
		
	public String moveLeft(){
		return "Move Left";
	}
		
	public String moveRight(){
		return "Move Right";
	}
	
	// Try to implement some function only Not all function		
	/*public String moveUp(){
		return "Jump";
	}*/
		
	/*public String moveDown(){
		return "Move to underground";
	}*/
	
	public String moveForward(int round){
		return "Move Forward "+round+" rounds";
	}
		
	public String moveBackward(int round){
		return "Move Backward "+round+" rounds";
	}
	
	public String moveLeft(int round){
		return "Move Left "+round+" rounds";
	}	

	public String moveRight(int round){
		return "Move Right "+round+" rounds";
	}	
	
	public String moveUp(int round){
		return "Move Up "+round+" rounds";
	}	
	
	public String moveDown(int round){
		return "Move to underground "+round+" rounds";
	}	
	
	
	

}
