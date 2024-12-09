import java.util.*;
class Emp{
	String name;
	String address;
Emp(String name,String address){
	this.name=name;
	this.address=address;
}
public String tostring(){
	return "name is :"+name+"address is:"+address;
	}
	String getName(){
	return name;
}	}

class Demo{
	public static void main(String[]args){
	Emp e=new Emp("Shubham","pune");
	Emp e1=new Emp("Shiva","satara");
	System.out.println(e);
	System.out.println(e1);
	
	
	System.out.println("Emp name :");
	System.out.println(e.getName());
	System.out.println(e.getName());
}
    
   }
