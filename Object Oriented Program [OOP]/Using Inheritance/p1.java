class A{
	int a=10;
}
class B extends A{
	void fun (){
	System.out.println(a);
}
	}
class Demo{
	public static void main(String[]args){
	B obj = new B();
	obj.fun();
}
 }
 O/P-10