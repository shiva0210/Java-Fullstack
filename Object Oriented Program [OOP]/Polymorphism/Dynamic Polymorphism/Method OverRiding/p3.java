class Parent{
	void marry(){
	System.out.println("xyz");
	
}
	void education(){
	System.out.println("enginnering");
	}
}
class Child extends Parent{
	void education(){
	System.out.println("enginnering sodun sagl");
}
	}

class Child1 extends Parent{
	void marry(){
	System.out.println("x");
}
}
class Demo{
	public static void main(String[]args){
	Child c =new Child();
	c.marry();
	c.education();

	
	System.out.println("child 1 data: ");
	Child1 c1 =new Child1();
	c1.marry();
	c1.education();
   }
     
}



/*xyz
enginnering sodun sagl
child 1 data:
x
enginnering
*/
