class Demo{
	public static void main(String[]args){
	Person p=new Person();
	p.fun();
	
}
	}
class Person{
	//instance variable
	int age;
	String name;
	//static method
	 static void fun(){
	System.out.println("in fun");
	}

}
	//in fun