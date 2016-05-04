package ch08_SingleInterface_Ex8_8_Ex8_9;

public class mainAnimation {
	
	private static implCartoon ObjCartoon = new implCartoon();

	public static void main(String[] args) {
		
		System.out.println(ObjCartoon.moveBackward());
		System.out.println(ObjCartoon.moveForward());
		System.out.println(ObjCartoon.moveLeft());
		System.out.println(ObjCartoon.moveRight());
		//System.out.println(ObjCartoon.moveUp());		//Try to implement some function only Not all function
		//System.out.println(ObjCartoon.moveDown());	//Try to implement some function only Not all function
		System.out.println("----------Overload function-----------------");
		System.out.println(ObjCartoon.moveBackward(50));
		System.out.println(ObjCartoon.moveForward(10));
		System.out.println(ObjCartoon.moveLeft(60));
		System.out.println(ObjCartoon.moveRight(70));
		System.out.println(ObjCartoon.moveUp(20));
		System.out.println(ObjCartoon.moveDown(10));

	}
}
