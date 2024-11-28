interface A{
	int a =10;
}
class Child implements A{
	void fun();
	System.out.println(A.a);
	}
class Demo{
	public void main (String[]args){
	Child c = new Child();
	c.fun();
}
	}	


	