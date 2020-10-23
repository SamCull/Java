package week2.lab2b;

public class RectangleDriver {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		
		System.out.println(rect);
		
		rect.setLength(10.0f);
		rect.setWidth(5.0f); 
		
		System.out.println(rect);
		
		rect.setLength(50.0f);
		rect.setWidth(-20.0f);
		
		System.out.println(rect);
		
		System.out.println("The area is: " + rect.getArea());
		System.out.println("The perimeter is: " + rect.getPerimeter());
			
		rect.printRectangle();
	}

}
