class Demo{
	public static void main(String[]a){
	try{
		System.out.println(10/0);
	}catch(ArithmeticException e){
		e.printStackTrace();
		System.out.println("ganit shika..."+e.getMessage());
		}
	}
}

/*java.lang.ArithmeticException: / by zero
        at Demo.main(p6.java:4)
ganit shika.../ by zero*/