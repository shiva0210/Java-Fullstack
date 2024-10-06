import java.util.*;
class Demo{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st number");
	int a=sc.nextInt();
	System.out.println("enter 2nd number");
	int b=sc.nextInt();
	codex chavi=new codex();
	chavi.add(a,b);
	chavi.sub(a,b);
}
}
class codex{
	void add(int x,int y){
	System.out.println("addition is" + (x+y));
}
}
	void sub(int x,int y){
	System.out.println("subtraction is" + (x-y));
}