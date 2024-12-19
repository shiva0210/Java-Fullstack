class Demo{
	public static void main(String[]args){
		try{	
			System.out.println(10/0);
			int arr[]={10,20};
			System.out.println(arr[2]);
		}catch(ArithmeticException a){
			System.out.println(a);
		}finally{
			System.out.println("code clean up");
		}

			System.out.println("after try catch");
	}
}

java.lang.ArithmeticException: / by zero
code clean up
after try catch