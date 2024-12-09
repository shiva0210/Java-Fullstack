import java.util.*;
class User{
	String name;
	int PhnNum;
	
	User(String name,int PhnNum){
		this.name = name;
		this.PhnNum = PhnNum;
}	
	}

class Demo{
	public static void main(String[]args){	
	LinkedList <User> ls = new LinkedList<User>();
	User s = new User("shubham",123);
	User s1 = new User("shiv",1234);

	ls.add(s);
	ls.add(s1);
	for(User a:ls){
	System.out.println(a);
}
	
    
}
	}

	/*User@279f2327
User@2ff4acd*/