//METHODS

import java.util.*;
class Demo{
	public static void main(String[]args){
	HashSet<String> s = new HashSet<String>();
	s.add("virat");
	s.add("gumrah");
	s.add("rohit");
	s.add("virat");

	//boolean isEmpty():this method returns true if hashset has no element

	System.out.println(s.isEmpty());

	//boolean contains(object):this method check whether the element is present in hashset or not return true if present
	System.out.println(s.contains("Gumrah"));

	//boolean remove(object):this method remove the specified element from hashset andreturn true
	
	System.out.println(s.remove("gumrah"));
	System.out.println(s);
	}
}

/*false
false
true
[virat, rohit]
*/