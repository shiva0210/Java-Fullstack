class Parent{
	public void education(){
	System.out.println("engi..");
  }
	}
class child extends Parent{
	 void education(){
	System.out.println("engi sodun.");
}
	}
class Demo{
	public static void main(String[]args){
	Child obj= new Child();
	obj.education();
}
  }

      //attempting to assign weaker access privileges; was public