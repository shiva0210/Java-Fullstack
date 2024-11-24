class Parent{
	void education(){
	System.out.println("enginnering");
	}
}
class Child extends Parent{
	void education(){
	System.out.println("enginnering sodun sagl");
}
	void flat(){
	System.out.println("pune");
	}
}
class Demo{
	public static void main(String[]args){
	Parent p =new Parent();
	p.education();
	p.flat();
   }
     
}
       //error: cannot find symbol
