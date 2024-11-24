class Codex{
	void add(int a, int b){
	System.out.println(a+b);
	
}
	int add(int a, int b, int c){
	System.out.println(a+b+c);
	return a+b+c;
}
}
class Demo{
	public static void main(String[]args){
	Codex d= new Codex();
	d.add(10,20);
	int sum=d.add(10,20,30);
	System.out.println(sum);
}
   }
   //30 60 60