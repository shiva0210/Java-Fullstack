class Person{
	int age;
	String name;
	//setter or mutator method for age
	void setAge(int age){
	this.age=age;
}
	//setter for name
	void setName(String name){
	this.name=name;
}
	//getter or accessor for age
	int getAge(){
	return age;
}

	//getter or accessor for name
	String getName(){
	return name;
}
 	}
class Demo{
	public static void main(String[]args){
	Person p1 = new Person();
	p1.setAge(20);
	p1.setName("shubham");
	Person p2 = new Person();
	p2.setAge(25);
	p2.setName("don");
	
	System.out.println("1st person data:");
	System.out.println(p1.getName());
	System.out.println(p1.getAge());
	System.out.println("2nd person data:");
	System.out.println(p2.getName());
	System.out.println(p2.getAge());
	}	
}
