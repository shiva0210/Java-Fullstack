class Parent{
	static void education(){
	System.out.println("english.");
  }
	}
class Child extends Parent{
	static void education(){
	System.out.println("marathi");
}
	}
class Demo{
	public static void main(String[]args){
	Parent obj= new Child();
	obj.education();
}
  }
	//english
