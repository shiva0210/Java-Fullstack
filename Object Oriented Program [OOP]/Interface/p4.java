interface A{
	void fun();  // by default compiler adds public abstract to method

}
class B implements A {
	public void fun(){
	System.out.println("in fun");
	}
}
class Demo{
	public static void main(String[]args){
	B obj = new B();
	obj.fun();
}
	}
	
	//in fun