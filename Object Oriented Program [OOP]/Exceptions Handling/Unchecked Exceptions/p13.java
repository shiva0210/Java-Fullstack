
class Demo{
	public static void main(String[]args){
		try{
			int arr[]={10,20};
			System.out.println(arr[2]);
		}catch(ArithmeticException a){
			System.out.println(a);
		}finally{
			System.out.println("code clean up");
		}
	}
}

/*code clean up
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2*/
