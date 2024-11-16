class Parent{
	int balance;
	Parent(int balance){
	this.balance=balance;
}
void property(){
	System.out.println("bank bal:+ balance");
}
 }
class Child extends Parent{
	Child(int balance){
	System.out.println("bank bal:+ balance");
		}
}
class Demo{
	public static void main(String[]args){
	System.out.println("child property");
   	Child c=new Child(1000);
	c.property();
	System.out.println("parent property");
	Parent p= new Parent(1000);
	p.property();
 }
	}