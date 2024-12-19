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
	try{
	obj.check();
	}catch(MyException e){
		System.out.println("own exception catch");
		e.printStackTrace();
		}
	}
}

/*own exception catch
MyException: age is not eligible age is:16
        at AgeChecker.check(p17.java:10)
        at Demo.main(p17.java:21)*/		