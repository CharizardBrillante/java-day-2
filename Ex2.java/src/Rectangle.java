public class Rectangle {
	
	int height;
	int width;
	
	Rectangle(int height, int width){
		this.height = height;
		this.width = width;
	}
	
	int calcArea() {
		return this.height*this.width;
	}
	
	int calcPerimeter() {
		return this.height*2 + this.width*2;
	}
	
	void printRect() {
		System.out.println("The area of the rectangle is: " + this.calcArea());
		System.out.println("The perimeter of the rectangle is: " + this.calcPerimeter());
	}
	
	static void compareRect(Rectangle rect1, Rectangle rect2) {
		int area1 = rect1.calcArea();
		int area2 = rect2.calcArea(); 
		int perimeter1 = rect1.calcPerimeter();
		int perimeter2 = rect2.calcPerimeter();
		
		if(area1 > area2) {
			System.out.println("The area of the first rectangle is " + 
					(area1 - area2) +
					" cm2 greater then the area of the second rectangle");
		} else {
			System.out.println("The area of the second rectangle is " +
					(area2 - area1) +
					" cm2 greater then the area of the first rectangle");			
		}
		
		
		if(rect1.calcPerimeter() > rect1.calcPerimeter()) {
			System.out.println("The perimeter of the first rectangle is " + 
					(perimeter1 - perimeter2) +
					" cm greater then the perimeter of the second rectangle");
		} else {
			System.out.println("The perimeter of the second rectangle is " + 
					(perimeter2 - perimeter1) +
					" cm greater then the perimeter of the first rectangle");			
		}
		
		System.out.println("The sum of the areas of the two rectangles is " + (rect1.calcArea() + rect2.calcArea()));
		System.out.println("The sum of the perimeters of the two rectangles is " + (perimeter1 + perimeter2));
				
	} 
}
