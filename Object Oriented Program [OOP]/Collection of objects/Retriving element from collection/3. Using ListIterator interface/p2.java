import java.util.*;
class Demo{
	public static void main(String[]args){	
	LinkedList  ls = new LinkedList();

	ls.add(10);
	ls.add(20);
	ls.add(30);
	System.out.println("using Listiterator interface");
	ListIterator itr = ls.listIterator();
	ListIterator itr1 = ls.listIterator();

	while(itr.hasPrevious()){
	System.out.println(itr1.previous());
}
	}
}

		//using Listiterator interface