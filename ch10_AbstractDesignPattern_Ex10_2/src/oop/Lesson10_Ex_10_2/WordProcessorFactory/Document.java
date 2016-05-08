package oop.Lesson10_Ex_10_2.WordProcessorFactory;

public class Document {
	private Style docStyle;
	
	public void setStyle(Style curStyle){
		docStyle=curStyle;
	}
	
	public void display(String doc){
		System.out.println("The style is "+docStyle.getStyle());
		System.out.println("Document :"+doc);
	}

}
