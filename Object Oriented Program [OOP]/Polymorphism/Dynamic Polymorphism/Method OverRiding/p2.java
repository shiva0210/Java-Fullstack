class Parent{
	void marry(){
	System.out.println("xyz");
	
}
	}
class Child extends Parent{
	void marry(){
	System.out.println("x");
}
}
class Demo{
	public static void main(String[]args){
	Child c =new Child();
	c.marry();
}
   }
     //x