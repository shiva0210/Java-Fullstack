import java.util.*;
class User{
	String name;
	int PhnNum;
	
	User(String name,int PhnNum){
		this.name = name;
		this.PhnNum = PhnNum;
}	
	@Override
	public String toString(){
	return "name is : "+name+"PhnNum is:"+PhnNum;
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

	/*name is : shubhamPhnNum is:123
name is : shivPhnNum is:1234*/