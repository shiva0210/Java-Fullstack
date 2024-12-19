class MyException extends Exception{

}
class Demo{
	public static void main(String[]args)throws MyException{
	try{
		throw new MyException();
	}catch(MyException e){
		System.out.println("My own Exception catched");
		e.printStackTrace();
		}
	}
}