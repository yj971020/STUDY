package ch07;

public class DynamicCallTest {
	public static void main(String[] args) {
		Animal animal=new Animal();
		Dog dog=new Dog();
		Cat cat=new Cat();
		
		Animal obj;
		
		obj = animal;
		obj.sound();
		
		obj = dog;
		obj.sound();
		
		obj = cat;
		obj.sound();
		
	}
}
