class Codex{
	int a=10;
	void fun(){
	System.out.println("address of own class codex:"+this);
	}
}
class Demo{
	public static void main(String[]args){
	Codex obj=new Codex();
	obj.fun();
}
	}	

//address of own class codex:Codex@2f92e0f4