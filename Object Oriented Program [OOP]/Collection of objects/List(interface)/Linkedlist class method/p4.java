import java.util.*;
class Demo{
	public static void main(String[]args){
	LinkedList ls = new LinkedList();
	ls.add("shubham");
	ls.add("sanket");
	ls.addLast("rohan");		//3]void addLast(element)  
   	ls.add("shivam");
	
	 System.out.println(ls.removeFirst());	//4]element removeFirst();	
	 System.out.println(ls);
	}
}

/*shubham
[sanket, rohan, shivam]
*/