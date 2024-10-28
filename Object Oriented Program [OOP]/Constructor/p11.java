class Person{
	int age;
	String name;
//no argument constructor
	Person(){
	age=20;
	name="RAM";
	}
//parametrized constructor
	Person(int a, String str){
	age=a;
	name=str;
}
	void data(){
	System.out.println("age is:"+age);
	System.out.println("name is:"+ name);
}
	}


class Demo{
	public static void main(String[]args){
	Person p1 = new Person();
	p1.data();
	Person p2 = new Person(21,"Sita");
	p2.data();
	Person p3 = new Person(22,"Krishna");
	p3.data();
}
	}

/*age is:20
name is:RAM
age is:21
name is:Sita
age is:22
name is:Krishna*/