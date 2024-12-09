import java.util.*;
class Demo{
	public static void main(String[]args){	
	LinkedList  ls = new LinkedList();

	ls.add("A");
	ls.add("B");
	ls.add("C");
	System.out.println("using Listiterator interface");
	ListIterator itr = ls.listIterator();
	itr=ls.listIterator();
	
	System.out.println(itr.hasPrevious());

	}
}

		/*using Listiterator interface
false*/	