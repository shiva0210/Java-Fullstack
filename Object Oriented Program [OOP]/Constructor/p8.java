class Codex{
	int a;
	Codex(){
	a=10;
}
	void fun(){
	System.out.println(a);
}
	}
class Demo{
	public static void main(String[]args){
	Codex obj = new Codex();
	obj.fun();
	}
}
//10