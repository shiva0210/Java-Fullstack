import java.util.*;
class Student{
	String name;
	Student(String name){
		this.name=name;
	}
}

class Demo{
	public static void main(String[]args){
	HashSet<Student> s = new HashSet<Student>();
	s.add(new Student("viraj"));
	s.add(new Student("gumrah"));
	s.add(new Student("rohit"));
	s.add(new Student("MS"));
	s.add(new Student("kl"));

	Iterator itr = s.iterator();
	while(itr.hasNext()){
	Student e = (Student)itr.next();
	System.out.println(e);
	System.out.println(e.name);
		}
	}
}

/*Student@2f92e0f4
viraj
Student@1f32e575
MS
Student@28a418fc
gumrah
Student@279f2327
kl
Student@5305068a
rohit
*/