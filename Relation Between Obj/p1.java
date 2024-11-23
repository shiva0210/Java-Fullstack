class One {
	//instance var
	int x;
	Two t;
	One(Two t){
	this.t=t;
	x=10;
   }
	void display(){
	System.out.println("ones x: "+ x);
	t.display();
	System.out.println("Twos var y: "+ t.y);
}
	}
class Two{
	int y;
	Two(int y){
	this.y=y;
}
 void display(){
	System.out.println("Twos y: "+y);
	}
  }
class Demo{
	public static void main(String[]args){
	Two obj2 = new Two(22);
	One obj1 = new One(obj2);
	obj1.display();
	}
}	

/*ones x: 10
Twos y: 22
Twos var y: 22/*