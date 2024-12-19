// EXCEPTIONAL HANDLING

class Demo{
	public static void main(String[]a){
	try{
		System.out.println(10/0);
	}catch(ArithmeticException e){
		System.out.println("ganit shika...");
		}
	}
}

//ganit shika...