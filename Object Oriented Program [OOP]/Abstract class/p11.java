abstract class Car{
	private String model;
	private String colour;

	Car(String model,String colour){
	this.model=model;
	this.model=colour;
}
	void fuel(){
	System.out.println("petrol");
}
	String getModel(){
	return model;
}
	String getColour(){
	return colour;
}
 abstract void design();
	}


class Merc extends Car{
Merc(String model,String colour){
	super(model,colour);
}
	void design(){
	System.out.println("SUV");
	}
}
class Alto extends Car{
Alto(String model,String colour){
	super(model,colour);
}
	void design(){
	System.out.println("Sedan");
	}
void fuel(){
System.out.println("diesel");
}
}	
class Demo{
	public static void main(String[]args){
	Merc obj= new Merc("620","white");
	System.out.println("Merc data : ");
	System.out.println(obj.getModel());
	System.out.println(obj.getColour());
	obj.fuel();
	obj.design();

	System.out.println("============================");
	
	Alto obj1= new Alto("k10","black");
	System.out.println("Alto data : ");
	System.out.println(obj1.getModel());
	System.out.println(obj1.getColour());
	obj1.fuel();
	obj1.design();
		
}
	}
/*Merc data :
white
null
petrol
SUV
============================
Alto data :
black
null
diesel
Sedan*/

	