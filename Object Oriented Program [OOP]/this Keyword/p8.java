class Codex{
	int age;
	void fun(int a){
	this.age =age;
}
	void display(){
	System.out.println(age);
}
	}
class Demo{
	public static void main(String[]args){
	Codex obj = new Codex();
	obj.fun(20);
	obj.display();
}
	}