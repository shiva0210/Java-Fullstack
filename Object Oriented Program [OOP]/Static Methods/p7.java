class Demo{
	public static void main(String[]args){
	Test t=new Test(10);
	t.access();
	
}
	}
class Test{
	int x;
	// a is local variable
	Test(int a){
	int b=20;
	x=a;
	System.out.println(a);
	System.out.println(b);

	}
 	static void access(){
	System.out.println(a);
	System.out.println(b);
		
	}
}
	//error: cannot symbol a & b