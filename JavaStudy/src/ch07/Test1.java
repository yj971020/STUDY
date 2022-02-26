package ch07;

class Shape{
	public Shape() {
		System.out.println("shape 持失切");
	}
}

class Rectangle extends Shape{
	public Rectangle() {
		super();
		System.out.println("rectangle 持失切");
	}
}

public class Test1 {

	public static void main(String[] args) {
		Rectangle r =new Rectangle();
	
	}

}
