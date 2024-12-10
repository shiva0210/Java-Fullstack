import java.util.*;
class Demo{
	public static void main(String[]args){
	LinkedList ls = new LinkedList();
	ls.add("shubham");
	ls.add("sanket");
	
	//getFirst method return first element in the list : element getFirst();
	System.out.println(ls.getFirst());

	//getLast method return last element in the list : element getLast();
	System.out.println(ls.getLast());

	//get method return element from the specification
	System.out.println(ls.get(1));
	}
}

/*shubham
sanket
sanket*/

