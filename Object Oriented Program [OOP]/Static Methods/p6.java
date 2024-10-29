class Demo{
	public static void main(String[]args){
	Person p=new Person();
	p.fun();
	Person.fun();
	
}
	}
class Person{
	//instance variable
	int age=20;
	String name;
	static void fun(){
	Person p=new Person();
	System.out.println("in fun"+age);
	}

}
	//error: non-static variable age cannot be referenced from a static context