class MyException extends Exception{
	MyException(String str){
			super(str);
	}
}
class AgeChecker{
	void check()throws MyException{
		int age=16;
		if(age<18){
			throw new MyException("age is not eligible age is:"+age);
		}else{
			System.out.println("can vote");
		}
	}
}

class Demo{
	public static void main(String[]args){
	AgeChecker obj = new AgeChecker ();
	obj.check();
	}
}

/*error: unreported exception MyException; must be caught or declared to be thrown
        obj.check();*/
                 