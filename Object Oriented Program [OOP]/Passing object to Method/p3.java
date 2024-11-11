class One{
	int a =10;
	void display(){
	System.out.println(a);
}
	}
class Two{
	void display(One ref){
	System.out.println(ref.a);
}
}
class Demo{
	public static void main(String[]args){
	One obj = new One();
	obj.display();
	Two t = new Two();
	t.display(obj);
	
}
	}	

