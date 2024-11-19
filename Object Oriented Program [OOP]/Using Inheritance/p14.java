class Parent{
	void fun(){
	System.out.println("in parent fun");
	}
 }
class Child extends Parent{
	void gun(){
	System.out.println("in child fun");
}
	}
class Demo{
	public static void main(String[]args){
	Child c=new Child();
	c.fun();
	c.gun();//error

	Parent p=new Parent();
	p.fun();
	p.gun();//error

	Parent p1 = new Child();
	p1.fun();
	p1.gun();//error

	Child c = new Parent();//error: incompatible types: Parent cannot be converted to Child
	c.gun();
}
	}