package ch07;

class Shape{
	public Shape() {
		System.out.println("shape ������");
	}
}

class Rectangle extends Shape{
	public Rectangle() {
		super();
		System.out.println("rectangle ������");
	}
}

public class Test1 {

	public static void main(String[] args) {
		Rectangle r =new Rectangle();
	
	}

}
