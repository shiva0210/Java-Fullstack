import java.util.*;
class Demo{
	public static void main(String[]args){
	LinkedList ls = new LinkedList();
	ls.add("shubham");
	ls.add("sanket");
	ls.add(4,"rohan");      		//1] void add(integer,element)
	
	System.out.println(ls);
	}
}

//Exception in thread "main" java.lang.IndexOutOfBoundsException