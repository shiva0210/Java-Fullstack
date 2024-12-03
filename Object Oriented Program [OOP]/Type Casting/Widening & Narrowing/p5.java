class Emp{
	void fun(){
	System.out.println("Emp");
}
	}
class Dev extends Emp{
	void gun(){
	System.out.println("Dev");
}
	}
class Demo{
	public static void main(String[]args){
	Emp e = (Emp)new Dev();
	e.fun();
	
}
	}
	//emp