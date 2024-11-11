class Demo{
	public static void main(String[]args){
	Codex chavi= new Codex();
	chavi.fun();
}
  }

	class Codex{
	int chairs; //instance variable
	String name;
	char shiv;
  	//action-methods
	void fun(){
	int a=10; //local variable
	System.out.println("fan started" + a);
	
	System.out.println("fan started" + chairs);

	System.out.println("fan started" + name);

	System.out.println("fan started" + shiv);
}
  }