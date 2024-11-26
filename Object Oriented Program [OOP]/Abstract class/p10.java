abstract class Car{
	void fuel(){
	System.out.println("petrol");
}
abstract void design();
	}
class Merc extends Car{
	void design(){
	System.out.println("SUV");
}
	}
class Alto extends Car{
	void design(){
	System.out.println("sedan");
}
	void fuel(){
	System.out.println("diesel");
	}
}
	
class Demo{
	public static void main(String[]args){
	System.out.println("Merc data : ");
	Merc obj= new Merc();
	obj.fuel();
	obj.design();
	System.out.println("============================");
	
	System.out.println("HDFC data : ");
	Alto a= new Alto();
	a.fuel();
	a.design();
		
}
	}
/*Merc data :
petrol
SUV
============================
HDFC data :
diesel
sedan
*/
	