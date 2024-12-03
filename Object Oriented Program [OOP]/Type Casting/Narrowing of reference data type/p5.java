class Codex{
	int a =10;
	static Object fun(){
	return new String("hello");
}
	}
class Demo{
	public static void main(String[]args){
	String s = (String)Codex.fun();
	System.out.println(s);
}
	}

		// hello