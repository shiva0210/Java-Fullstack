class One{
	int a =10;
	void display(){
	System.out.println(a);
}
	}
class Two{
	void data(One ref){
	System.out.println(ref.a);
	ref.display();
}
	
	void display(int a){
	System.out.println(a);
}
}
	
class Demo{
	public static void main(String[]args){
	One obj = new One();
	int a=10;
	obj.display();
	Two t = new Two();
	t.display(a);
	t.data(obj);
	
}
	}	

