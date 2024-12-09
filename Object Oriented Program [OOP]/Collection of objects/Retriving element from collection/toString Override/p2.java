import java.util.*;
class User{
	private String name;
	private int PhnNum;
	
	User(String name,int PhnNum){
		this.name = name;
		this.PhnNum = PhnNum;
}	
	String getName(){
	return name;
}
	int getPhnNum(){
	return PhnNum;
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
	System.out.println("All User :");
	for(User a:ls){
	System.out.println(a);
}
	System.out.println("All user names :");
	for(User a : ls){
	System.out.println(a.getName());	
    
}
	
	System.out.println("All user phnnum :");
	for(User a : ls){
	System.out.println(a.getPhnNum());
	}
}
	}



  	/*All User :
name is : shubhamPhnNum is:123
name is : shivPhnNum is:1234
All user names :
shubham
shiv
All user phnnum :
123
1234*/