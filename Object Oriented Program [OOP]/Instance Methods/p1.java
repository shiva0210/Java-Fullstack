class Demo{
	public static void main(String[]args){
	Person.fun();
	
}
	}
class Person{
	int age;
	String name;
	//instance method - without static
	 void fun(){
	System.out.println("in fun");
	}

}
	//error: non-static method fun() cannot be referenced from a static context