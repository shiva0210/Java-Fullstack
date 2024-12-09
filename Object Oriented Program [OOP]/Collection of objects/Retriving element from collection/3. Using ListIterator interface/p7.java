import java.util.*;
class User{
	String name;
	
	
	User(String name){
		this.name=name;
		
		}
	String getName(){
		return name;
	}
	
	//@overriding
	public String toString(){
		return"name is :"+name;
	}
}
class Demo{
	public static void main(String[]args){
	LinkedList<User> ls= new LinkedList<User>();
	User s = new User("Shivam");
	User s1 = new User("Shriram");
	User s2 = new User("Zodge");
	ls.add(s);
	ls.add(s1);
	ls.add(s2);


	System.out.println("Forward list");
	ListIterator<User> itr= ls.listIterator();
	while(itr.hasNext()){
	 System.out.println(itr.next());
		}

	System.out.println("revers list");
	while(itr.hasPrevious()){
	 System.out.println(itr.previous());
		}

	}
}

/*
Forward list
name is :Shivam
name is :Shriram
name is :Zodge
revers list
name is :Zodge
name is :Shriram
name is :Shivam*/