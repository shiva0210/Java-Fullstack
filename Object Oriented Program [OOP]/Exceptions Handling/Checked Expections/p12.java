class MyException extends Exception{

}
class Demo{
	public static void main(String[]args)throws MyException{
		throw new MyException();
	}
}

//Exception in thread "main" MyException