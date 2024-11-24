class Codex{
	void fun(int a, int b){
	System.out.println(a+b);
	
}
	void fun(int a, int b, int c){
	System.out.println(a+b+c);
}
}
class Demo{
	public static void main(String[]args){
	Codex d= new Codex();
	d.fun(10,20);
	d.fun(10,20,30);
}
   }
   //30 60