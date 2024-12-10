import java.util.*;
class Demo{
	public static void main(String[]args){
	LinkedHashSet<String> s = new LinkedHashSet<String>();
	s.add("virat");
	s.add("gumrah");
	s.add("rohit");
	s.add("virat");
	s.add("rishab");
	
	System.out.println(s);
	}
}

//[virat, gumrah, rohit, rishab]