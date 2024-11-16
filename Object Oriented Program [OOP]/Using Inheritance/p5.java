class Country{
	int a=20;
	void flag(){
	System.out.println("tri colour");
}
}
class Maha extends Country{
	void lang(){
	System.out.println("Marathi + hindi");
}
	} 
class Goa extends Country{
	void lang(){
	System.out.println("english");
}
	}
class Demo{
	public static void main(String[]args){
	System.out.println("maha lang and flag");
	Maha obj = new Maha();
	obj.flag();
	obj.lang();

	System.out.println("goa lang and flag");
	Goa obj1 = new Goa();
	obj1.flag();
	obj1.lang();

}
 }
 /*maha lang and flag
tri colour
Marathi + hindi
goa lang and flag
tri colour
english
*/