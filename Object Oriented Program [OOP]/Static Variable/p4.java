class Demo{
	public static void main(String[]args){
	Test t=new Test();
	Test t1=new Test();
	t.x++;
	t.access();
	System.out.println("var x is :"+t.x);
	t1.x++;
	t1.access();
	System.out.println("var x is:"+t1.x);
}
	}
class Test{
	 int x=10;
	void access(){
	System.out.println(x);
	}
	}

/*11
var x is :11
11
var x is:11*/