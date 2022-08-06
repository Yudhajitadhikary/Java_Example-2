import java.util.*;

class Rectangle1{
	//old method
	@Deprecated
	public void showNameOfClass(){
		System.out.println("Rect");
	}
	
	public void printNameOfClass(){
		System.out.println("Rectangle");
	}
}


public class AnnotationDemo2{
	public static void main(String[] args){
		Rectangle1 r = new Rectangle1();
		r.showNameOfClass();
		r.printNameOfClass();
	}	
}