class Demo{
	public static void main(String[]args){
	Person p1 = new Person();
	p1.data();
	Person p2 = new Person();
	p2.data();
}
	}
class Person{
	int age;
	String name;
	Person(){
	age=20;
	name="RAM";
	}
	void data(){
	System.out.println("age is:"+age);
	System.out.println("name is:"+ name);
}
	}
/*age is:20
name is:RAM
age is:20
name is:RAM*/