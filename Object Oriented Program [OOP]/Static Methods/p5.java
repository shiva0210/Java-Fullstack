class Demo{
	public static void main(String[]args){
	Person.fun();
	
}
	}
class Person{
	//instance variable
	int age=20;
	String name;
	static void fun(){
	System.out.println("in fun"+age);
	}

}
	//error: non-static variable age cannot be referenced from a static context

		//imp-static method doesnot access instance variable