class Demo{
	static void fun(){
	System.out.println(10/0);
	}
	public static void main(String[]a){
		fun();
	}
}

/*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo.fun(p4.java:3)
        at Demo.main(p4.java:6)*/