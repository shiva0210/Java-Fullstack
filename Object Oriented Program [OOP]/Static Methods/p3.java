class Demo{
	public static void main(String[]args){
	Person p=new Person();
	p.fun();
	
}
	}
class Person{
	//instance variable
	int age=20;
	String name;
	//static method
	 void fun(){
	System.out.println("in fun"+age);
	}

}
	//in fun,20