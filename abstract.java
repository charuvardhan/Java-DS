abstract class Animal{
	public abstract void show();
}
class Dog extends Animal{
	public void show(){
		System.out.println("DOGGO");
	}
}
class Cat extends Animal{
	public void show(){
	System.out.println("CAT");}
}
public class Abstract
	public static void main(String[] args)
	{
		Dog d=new Dog();
		Cat c=new Cat();
		d.show();
		c.show();
	}
}
	