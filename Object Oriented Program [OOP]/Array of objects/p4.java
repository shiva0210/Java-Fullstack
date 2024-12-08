import java.util.*;
class Emp{
	String name;
Emp(String name){
	this.name=name;
}
	}


class Demo{
	public static void main(String[]args){
	Emp arr[]=new Emp[3];
	Scanner sc = new Scanner(System.in);

	for(int i=0;i<=2;i++)
	System.out.println("Enter name:");
	String str =sc.next();
	arr[i]=new Emp(str);

	for(int i=0;i<=2;i++){
	System.out.println(arr[i]);
}
    
}
	}