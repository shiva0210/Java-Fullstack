interface Creditcard{
	void interest();
	void limit();
}
class SBI implements Creditcard {
	public void interest(){
	System.out.println("10%");
	}
	public void limit(){
	System.out.println("1 lakh");
}
	}

class HDFC implements Creditcard{
	public void interest(){
	System.out.println("12%");
	}
	public void limit(){
	System.out.println("2 lakh");
}
     }
class Demo{
	public static void main(String[]args){
	System.out.println("SBI Card Info : ");
	SBI obj = new SBI();
	obj.interest();
	obj.limit();

	System.out.println("==============================");

	System.out.println("HDFC Card Info : ");
	HDFC obj1 = new HDFC();
	obj1.interest();
	obj1.limit();
	}
}