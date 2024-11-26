class Parent{
	static void education(){
	System.out.println("engi..");
  }
	}
class Child extends Parent{
	static void education(){
	System.out.println("engi sodun.");
}
	}
class Demo{
	public static void main(String[]args){
	Child obj= new Child();
	obj.education();
}
  }
	//engi sodun
