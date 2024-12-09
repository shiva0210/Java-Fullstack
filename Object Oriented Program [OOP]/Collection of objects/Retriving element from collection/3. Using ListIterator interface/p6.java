import java.util.*;
class Demo{
	public static void main(String[]args){	
	LinkedList  ls = new LinkedList();

	ls.add("A");
	ls.add("B");
	ls.add("C");
	System.out.println("forward list :");
	ListIterator<String> itr = ls.listIterator();
	while(itr.hasNext()){
	System.out.println(itr.next());

	}

	System.out.println("reverse list :");
	while(itr.hasPrevious()){
	System.out.println(itr.previous	());

	}
}
	}	

/*forward list :
A
B
C
reverse list :
C
B
A*/