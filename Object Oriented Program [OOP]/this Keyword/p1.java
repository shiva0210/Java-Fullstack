class Codex{
	void fun(){
	System.out.println("address of own class codex:"+this);
	}
}
class Demo{
	public static void main(String[]args){
	Codex obj=new Codex();
	obj.fun();
	System.out.println("address of own class codex:"+obj);
}
	}	

/*address of own class codex:Codex@2f92e0f4
address of own class codex:Codex@2f92e0f4*/
