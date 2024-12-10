import java.util.*;
class Emp{
	String empName;
	int Sal;
	Emp(String empName,int Sal){
		this.empName = empName;
		this.Sal=Sal;
	}
	public String toString(){
		return"Emp name is:"+empName+"Salary is :"+Sal;
	}
	
	String getEmpName(){
		return empName;
	}
}
class Demo{
	public static void main(String[]args){
		LinkedList<Emp> ls = new LinkedList<Emp>();
	
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<3;i++){
		System.out.println("Enter emp name");
		String name = sc.next();
		System.out.println("Enter emp sal");
		int sal = sc.nextInt();
		
		ls.add(new Emp(name,sal));
	}
	
		Iterator itr = ls.iterator();
		System.out.println("all emp");
		while(itr.hasNext()){
			System.out.println(itr.next());
	}
		System.out.println("Enter emp position");
		int position = sc.nextInt();
	
		System.out.println("Employ of specified position:");
		System.out.println(ls.get(position));

		Emp e= ls.get(position);
		System.out.println(e.getEmpName());
	}
}
		
/*Enter emp name
shivam
Enter emp sal
10000
Enter emp name
patya
Enter emp sal
1000
Enter emp name
rohya
Enter emp sal
100
all emp
Emp name is:shivamSalary is :10000
Emp name is:patyaSalary is :1000
Emp name is:rohyaSalary is :100
Enter emp position
2
Employ of specified position:
Emp name is:rohyaSalary is :100
rohya*/
		
		