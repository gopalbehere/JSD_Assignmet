package Assignment1;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an=new Animal();
		an.makeSound();
		
		Animal c=new Cat();
		c.makeSound();
		
		Animal d=new Dog();
		d.makeSound();
		

	}
	void makeSound(){
		System.out.println("The animal makes a sound");
		
	}

}

class Dog extends Animal{
	
	void makeSound(){
		System.out.println("Tho Dog Barks");
		
	}
	
}

class Cat extends Animal{
	
	void makeSound(){
		System.out.println("Tho Cat meows");
		
	}
	
}
