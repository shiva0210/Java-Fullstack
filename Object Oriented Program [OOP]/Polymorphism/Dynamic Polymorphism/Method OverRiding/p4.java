class Parent{
	void education(){
	System.out.println("engi..");
	
}
	}
class Child extends Parent{
	void education(int a){
	System.out.println("engin sodun");
}
}
class Demo{
	public static void main(String[]args){
	Child c =new Child();
	c.education();
}
   }
     //engi..