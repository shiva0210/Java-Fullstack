class Demo{
	public static void main(String[]args){
	Person p=new Person();
	p.fun();
	System.out.println(p.age);
	
}
	}
class Person{
	//instance variable
	int age;
	String name;
	//instance method
	 void fun(){
	System.out.println("in fun");
	}

}
	//in fun ,0