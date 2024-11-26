abstract class Parent{
	abstract void marry();
	void education(){
	System.out.println("engi...");
}
	}
class Child extends Parent{
	void marry(){
	System.out.println("x...");
}
	void education(){
	System.out.println("doctor");
	}
}
class Child1 extends Parent{
	void marry(){
	System.out.println("xyz...");
}

}	
class Demo{
	public static void main(String[]args){
	Child c= new Child();
	c.marry();
	c.education();
	
	Child1 c1= new Child1();
	c1.marry();
	c1.education();
	
  }
	}
	/*x...
doctor
xyz...
engi...*/