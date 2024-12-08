class Emp{
	int a =20;
}
class Codex{
	static Object fun(){	
	return new Emp();
}
	}
class Demo{
	public static void main(String[]args){
	Emp s= (Emp)Codex.fun();
	System.out.println(s.a);
}
	}

		// hello