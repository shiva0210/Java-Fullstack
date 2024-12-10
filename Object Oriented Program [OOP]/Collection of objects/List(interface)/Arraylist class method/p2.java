//METHODS

import java.util.*;
class Demo{
	public static void main(String[]args){
	ArrayList<String> ls = new ArrayList<String>();
	ls.add("viraj");
	ls.add("gumrah");
	ls.add("rohit");
	
	//boolean add(element):this method adds element to arraylist & return true of the element added successfully.
	
	System.out.println(ls.add("MS"));
	System.out.println(ls);
	
	//void add(int position,element):this method insert element at specified position

	ls.add(1,"kholi");
	System.out.println(ls);

	//element remove(int position):this method remove elementfrom specified position &return element
	
	ls.remove(1);
	System.out.println(ls);
	
	//int size(): this method return the element at specified position in arraylist
	
	String s= ls.get(1);
	System.out.println(s);

	//void clear():this method clear the arraylist

	ls.clear();
	System.out.println(ls);

	//element set(int position,element):this method update the element at specified position
	
	ls.set(1,"hardik pandya");
	System.out.println(ls);
	 
	}
}

/*true
[viraj, gumrah, rohit, MS]
[viraj, kholi, gumrah, rohit, MS]
[viraj, gumrah, rohit, MS]
gumrah
[]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0*/