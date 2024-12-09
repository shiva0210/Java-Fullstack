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
	System.out.println("using iterator interface");
	
	Iterator itr = ls.iterator();	
	while(itr.hasNext()){
	User u=(User)itr.next();
	
	System.out.println(u.getName());

	}
}
	}



  	/*using iterator interface
shubham
shiv*/