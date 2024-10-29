class Demo{
	public static void main(String[]args){
	System.out.println(Person.age);
	
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
	//error: non-static variable age cannot be referenced from a static context