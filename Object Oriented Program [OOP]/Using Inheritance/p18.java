class A{
	int a=10;
}
class B {
	void fun (){
	A obj = new A();
	System.out.println(obj.a);
}
	}
class Demo{
	public static void main(String[]args){
	B obj = new B();
	obj.fun();
}
 }
     // O/P-10