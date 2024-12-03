class Emp{
	void fun(){
	System.out.println("emp");
	}
}
class Dev extends Emp{
	void gun(){
	System.out.println("dev");
}
	}
class Demo{
	public static void main(String[]args){
	Emp e = new Dev();
	e.fun();
	Dev obj = (Dev)e;
	
	obj.fun();
	obj.gun();
}
	}