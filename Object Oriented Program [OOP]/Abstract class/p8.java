abstract class RBI{
	abstract void interest();
	void weeklyoff(){
	System.out.println("sat-sun off");
}
	}
class Axis extends RBI{
	void interest(){
	System.out.println("10%");
}
	}
class HDFC extends RBI{
	void interest(){
	System.out.println("12%");
}
	void weeklyoff(){
	System.out.println("sun off");
	}
}
	
class Demo{
	public static void main(String[]args){
	System.out.println("AXIS data : ");
	Axis a= new Axis();
	a.interest();
	a.weeklyoff();

	
	System.out.println("HDFC data : ");
	HDFC h= new HDFC();
	h.interest();
	h.weeklyoff();
		
}
	}
/*AXIS data :
10%
sat-sun off
HDFC data :
12%
sun off*/
	