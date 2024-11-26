abstract class Parent{
	abstract void marry();
}

class Child extends Parent{
}
class Demo{
	public static void main(String[]args){
	Child c= new Child();
	c.marry();
}
  }
		//error: Child is not abstract and does not override abstract method marry() in Parent