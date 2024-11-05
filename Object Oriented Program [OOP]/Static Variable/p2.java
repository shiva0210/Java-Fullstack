class Demo{
	public static void main(String[]args){
	Test t=new Test();
	t.access();
}
	}
class Test{
	//static var - class var
	static int x=10;
	static void access(){
	System.out.println(x);
	}
	}

//10