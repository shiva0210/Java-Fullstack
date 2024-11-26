class Parent{
	final void education(){
	System.out.println("engi..");
  }
	}
class Child extends Parent{
	final void education(){
	System.out.println("engi sodun.");
}
	}
class Demo{
	public static void main(String[]args){
	Parent obj= new Child();
	obj.education();
}
  }
	// error: education() in Child cannot override education() in Parent
