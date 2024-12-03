class Codex{
	int a =10;
	static Object fun(){
	return new String("hello");
}
	}
class Demo{
	public static void main(String[]args){
	String s = Codex.fun();
	System.out.println(s);
}
	}

		// error: incompatible types: Object cannot be converted to String