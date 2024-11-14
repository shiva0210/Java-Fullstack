class One{
	int a=10;
	Two display(){
	Two obj =new Two();
	System.out.println("in ones display");
	return obj;
}
	}
class Two{
	int b=20;
	void gun(){
	System.out.println("in twos gun");
}
	}
class Demo{
	public static void main(String[]args){
	One o = new One();
	Two t = o.display();
	t.gun();
}
	}
/*in ones display
in twos gun
*/