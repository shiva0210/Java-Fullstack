interface A{
	int a =10;
}
interface B{
	int a =10;
}
class Child implements A,B{
	void fun(){
	System.out.println(A.a);
	System.out.println(B.a);
	}
}
class Demo{
	public static void main (String[]args){
	Child c = new Child();
	c.fun();
}
	}	

	//10 10

	