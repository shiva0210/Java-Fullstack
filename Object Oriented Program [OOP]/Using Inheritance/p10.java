class Parent{
	Parent(){
	System.out.println("Parent constr");
}
}
class Child extends Parent{
	Child(){
	super();
	System.out.println("child constr");
}
	}
class Demo{
	public static void main(String[]args){
	Child obj = new Child();
}
 }
 /*Parent constr
child constr*/